package cn.com.wtrj.jx.web.portal.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomWexinPayResult;
import cn.com.wtrj.jx.web.portal.util.WXPayConstants.SignType;


public class WXPayUtil {

    /**
     * XML格式字符串转换为Map
     *
     * @param strXML XML字符串
     * @return XML数据转换后的Map
     * @throws Exception
     */
    public static Map<String, String> xmlToMap(String strXML) throws Exception {
        try {
            Map<String, String> data = new HashMap<String, String>();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
            org.w3c.dom.Document doc = documentBuilder.parse(stream);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getDocumentElement().getChildNodes();
            for (int idx = 0; idx < nodeList.getLength(); ++idx) {
                Node node = nodeList.item(idx);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                    data.put(element.getNodeName(), element.getTextContent());
                }
            }
            try {
                stream.close();
            } catch (Exception ex) {
                // do nothing
            }
            return data;
        } catch (Exception ex) {
            WXPayUtil.getLogger().warn("Invalid XML, can not convert to map. Error message: {}. XML content: {}", ex.getMessage(), strXML);
            throw ex;
        }

    }

    /**
     * 将Map转换为XML格式的字符串
     *
     * @param data Map类型数据
     * @return XML格式的字符串
     * @throws Exception
     */
    public static String mapToXml(Map<String, String> data) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
        org.w3c.dom.Document document = documentBuilder.newDocument();
        org.w3c.dom.Element root = document.createElement("xml");
        document.appendChild(root);
        for (String key: data.keySet()) {
            String value = data.get(key);
            if (value == null) {
                value = "";
            }
            value = value.trim();
            org.w3c.dom.Element filed = document.createElement(key);
            filed.appendChild(document.createTextNode(value));
            root.appendChild(filed);
        }
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(document);
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
        String output = writer.getBuffer().toString(); //.replaceAll("\n|\r", "");
        try {
            writer.close();
        }
        catch (Exception ex) {
        }
        return output;
    }


    /**
     * 生成带有 sign 的 XML 格式字符串
     *
     * @param data Map类型数据
     * @param key API密钥
     * @return 含有sign字段的XML
     */
    public static String generateSignedXml(final Map<String, String> data, String key) throws Exception {
        return generateSignedXml(data, key, SignType.MD5);
    }

    /**
     * 生成带有 sign 的 XML 格式字符串
     *
     * @param data Map类型数据
     * @param key API密钥
     * @param signType 签名类型
     * @return 含有sign字段的XML
     */
    public static String generateSignedXml(final Map<String, String> data, String key, SignType signType) throws Exception {
        String sign = generateSignature(data, key, signType);
        data.put(WXPayConstants.FIELD_SIGN, sign);
        return mapToXml(data);
    }


    /**
     * 判断签名是否正确
     *
     * @param xmlStr XML格式数据
     * @param key API密钥
     * @return 签名是否正确
     * @throws Exception
     */
    public static boolean isSignatureValid(String xmlStr, String key) throws Exception {
        Map<String, String> data = xmlToMap(xmlStr);
        if (!data.containsKey(WXPayConstants.FIELD_SIGN) ) {
            return false;
        }
        String sign = data.get(WXPayConstants.FIELD_SIGN);
        return generateSignature(data, key).equals(sign);
    }

    /**
     * 判断签名是否正确，必须包含sign字段，否则返回false。使用MD5签名。
     *
     * @param data Map类型数据
     * @param key API密钥
     * @return 签名是否正确
     * @throws Exception
     */
    public static boolean isSignatureValid(Map<String, String> data, String key) throws Exception {
        return isSignatureValid(data, key, SignType.MD5);
    }

    /**
     * 判断签名是否正确，必须包含sign字段，否则返回false。
     *
     * @param data Map类型数据
     * @param key API密钥
     * @param signType 签名方式
     * @return 签名是否正确
     * @throws Exception
     */
    public static boolean isSignatureValid(Map<String, String> data, String key, SignType signType) throws Exception {
        if (!data.containsKey(WXPayConstants.FIELD_SIGN) ) {
            return false;
        }
        String sign = data.get(WXPayConstants.FIELD_SIGN);
        return generateSignature(data, key, signType).equals(sign);
    }

    /**
     * 生成签名
     *
     * @param data 待签名数据
     * @param key API密钥
     * @return 签名
     */
    public static String generateSignature(final Map<String, String> data, String key) throws Exception {
        return generateSignature(data, key, SignType.MD5);
    }

    /**
     * 生成签名. 注意，若含有sign_type字段，必须和signType参数保持一致。
     *
     * @param data 待签名数据
     * @param key API密钥
     * @param signType 签名方式
     * @return 签名
     */
    public static String generateSignature(final Map<String, String> data, String key, SignType signType) throws Exception {
        Set<String> keySet = data.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {
            if (k.equals(WXPayConstants.FIELD_SIGN)) {
                continue;
            }
            if (data.get(k).trim().length() > 0) // 参数值为空，则不参与签名
                sb.append(k).append("=").append(data.get(k).trim()).append("&");
        }
        sb.append("key=").append(key);
        if (SignType.MD5.equals(signType)) {
            return MD5(sb.toString()).toUpperCase();
        }
        else if (SignType.HMACSHA256.equals(signType)) {
            return HMACSHA256(sb.toString(), key);
        }
        else {
            throw new Exception(String.format("Invalid sign_type: %s", signType));
        }
    }


    /**
     * 获取随机字符串 nonce_str
     *
     * @return String 随机字符串
     */
    public static String generateNonceStr() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32);
    }


    /**
     * 生成 MD5
     *
     * @param data 待处理数据
     * @return MD5结果
     */
    public static String MD5(String data) throws Exception {
        java.security.MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    /**
     * 生成 HMACSHA256
     * @param data 待处理数据
     * @param key 密钥
     * @return 加密结果
     * @throws Exception
     */
    public static String HMACSHA256(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    /**
     * 日志
     * @return
     */
    public static Logger getLogger() {
        Logger logger = LoggerFactory.getLogger("wxpay java sdk");
        return logger;
    }

    /**
     * 获取当前时间戳，单位秒
     * @return
     */
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis()/1000;
    }

    /**
     * 获取当前时间戳，单位毫秒
     * @return
     */
    public static long getCurrentTimestampMs() {
        return System.currentTimeMillis();
    }

    /**
     * 生成 订单号， 即用来标识一笔单，也用做 nonce_str
     * 必须保证订单号唯一性，这里用当前系统时间+生成的随机uuid组合而成，保证唯一性
     * @return
     */
    public static String generateUUID() {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date())+UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18);
    }
    
    /**
     * 回调方法中接收到微信返回数据，验证信息并生成XML格式数据，用于返回给微信
     * @param return_code
     * @param return_msg
     * @return
     */
    public static String resposeXMLToWeiXin(String return_code, String return_msg) {
        return "<xml><return_code><![CDATA[" + return_code
                + "]]></return_code><return_msg><![CDATA[" + return_msg
                + "]]></return_msg></xml>";
	}
    
    /**
     * 回调成功时，把微信回调结果map转化为dto对象，用于入库
     * @param resultMap 回调结果Map
     * @return 
     */
    public static WtrjEcomWexinPayResult getSuccessWxPayResult(Map<String,String>resultMap){
    	WtrjEcomWexinPayResult wxPayResult=new WtrjEcomWexinPayResult();
    	wxPayResult.setAppid(resultMap.get("appid"));
    	wxPayResult.setBankType(resultMap.get("bank_type"));
    	Integer cash_fee=resultMap.get("cash_fee")==null?null:Integer.parseInt(resultMap.get("cash_fee"));
    	wxPayResult.setCashFee(cash_fee);
    	wxPayResult.setFeeType(resultMap.get("fee_type"));
    	wxPayResult.setIsSubscribe(resultMap.get("is_subscribe"));
    	wxPayResult.setMchId(resultMap.get("mch_id"));
    	wxPayResult.setNonceStr(resultMap.get("nonce_str"));
    	wxPayResult.setOpenid(resultMap.get("openid"));
    	wxPayResult.setOutTradeNo(resultMap.get("out_trade_no"));	
    	wxPayResult.setResultCode(resultMap.get("result_code"));
    	wxPayResult.setReturnCode(resultMap.get("return_code"));
    	wxPayResult.setSign(resultMap.get("sign"));
    	wxPayResult.setTimeEnd(resultMap.get("time_end"));
    	Integer total_fee=resultMap.get("total_fee")==null?null:Integer.parseInt(resultMap.get("total_fee"));
    	wxPayResult.setTotalFee(total_fee);
    	wxPayResult.setTradeType(resultMap.get("trade_type"));
    	wxPayResult.setTransactionId(resultMap.get("transaction_id"));
    	wxPayResult.setCreateTime(new Date());
    	return wxPayResult;
    }
    
    
    public static void main(String[] args) throws Exception {
    			//测试统一下单xml格式字符串
				//金额
				String total_fee="1";	
			    // 微信公众号密钥
			    String secret="w56W2BhzX3VPcGT2oP9Z0-9Cmnt9Be9e9hMEsUztmOE";
			    // 微信公众号id
			    String appid="wx83722e76554de64b";
			    // 商户号
			    String mch_id = "1434171002";
			    // 商户号对应的密钥
			    String key = "96cdb35abbb7dd7904b40469afa7aa1f";	
				Map<String,String>parameters=new HashMap<String,String>();
				//随机字符串
				String nonce_str= WXPayUtil.generateNonceStr();
				//生成订单号
				String out_trade_no=WXPayUtil.generateUUID();
				//订单生成的机器 IP（终端ip）
			    String spbill_create_ip = "127.0.0.1";	
				//公众账号ID
				parameters.put("appid", appid);
				//商户id
				parameters.put("mch_id", mch_id);
				//随机字符串
				parameters.put("nonce_str", nonce_str);
				//商品描述
				parameters.put("body", "维睿教育社区-缴费");
				//订单号
				parameters.put("out_trade_no", out_trade_no);
				//交易金额，单位分
				parameters.put("total_fee", total_fee);
				//终端ip 
				parameters.put("spbill_create_ip", spbill_create_ip);
				//异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数
				parameters.put("notify_url", "http://wrjypd.cdwtrj.com/wtrj-edu-community/pay/payResultCallBack");
				//交易类型（公众号支付）
				parameters.put("trade_type", "JSAPI");
				//用户标识（使用公众号支付时，此参数为必传）
				parameters.put("openid", "ovqBywEXQPItqme8mtn0wloDeg2Y");
				//获取签名
				String sign=WXPayUtil.generateSignature(parameters, key);
				//设置签名
				parameters.put("sign",sign);
				//生成调用统一下单接口的xml格式的字符串数据
				String data=WXPayUtil.mapToXml(parameters);
				System.out.println(data);
				//调用统一下单接口
				String unifiedorderResult=HttpRequestUtils.sendXMLDataByPost("https://api.mch.weixin.qq.com/pay/unifiedorder",data);
				Map unifiedorderResultMap=WXPayUtil.xmlToMap(unifiedorderResult);
				System.out.println("下单接口调用结果:"+unifiedorderResult);

				
				
//    	String str="<xml>"
//					+"<appid><![CDATA[wx83722e76554de64b]]></appid>"
//					+"<bank_type><![CDATA[CFT]]></bank_type>"
//					+"<cash_fee><![CDATA[3]]></cash_fee>"
//					+"<fee_type><![CDATA[CNY]]></fee_type>"
//					+"<is_subscribe><![CDATA[Y]]></is_subscribe>"
//					+"<mch_id><![CDATA[1434171002]]></mch_id>"
//					+"<nonce_str><![CDATA[4db5744f898d4406b9465d99bcf4e07a]]></nonce_str>"
//					+"<openid><![CDATA[ovqBywEXQPItqme8mtn0wloDeglY]]></openid>"
//					+"<out_trade_no><![CDATA[20170825152556aacdc1a3dc104aa0b9]]></out_trade_no>"
//					+"<result_code><![CDATA[SUCCESS]]></result_code>"
//					+"<return_code><![CDATA[SUCCESS]]></return_code>"
//					+"<sign><![CDATA[12B7C565ABB8363379DD9E056B760EB0]]></sign>"
//					+"<time_end><![CDATA[20170825152617]]></time_end>"
//					+"<total_fee>3</total_fee>"
//					+"<trade_type><![CDATA[JSAPI]]></trade_type>"
//					+"<transaction_id><![CDATA[4009682001201708258175155513]]></transaction_id>"
//					+"</xml>";
//    	Map map=WXPayUtil.xmlToMap(str);
//    	System.out.println(getSuccessWxPayResult(map));
	}
}

package cn.com.wtrj.jx.web.portal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HttpRequestUtils {
    private static Logger logger = LoggerFactory
            .getLogger(HttpRequestUtils.class); // 日志记录

    /**
     * httpPost
     *
     * @param url
     *            路径
     * @param jsonParam
     *            参数
     * @return
     */
    public static JsonObject httpPost(String url, JsonObject jsonParam) {
        return httpPost(url, jsonParam, false);
    }

    /**
     * post请求
     *
     * @param url
     *            url地址
     * @param jsonParam
     *            参数
     * @param noNeedResponse
     *            不需要返回结果
     * @return
     */
    public static JsonObject httpPost(String url, JsonObject jsonParam,
            boolean noNeedResponse) {
    	JsonObject jsonResult = null;

        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        // HttpClient
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        try {

            HttpPost httpPost = new HttpPost(url);

            if (null != jsonParam) {
                // 解决中文乱码问题
                StringEntity entity = new StringEntity(jsonParam.toString(),
                        "utf-8");
                entity.setContentEncoding("UTF-8");
                entity.setContentType("application/json");
                httpPost.setEntity(entity);
            }
            HttpResponse result = closeableHttpClient.execute(httpPost);
            /** 请求发送成功，并得到响应 **/
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /** 读取服务器返回过来的json字符串数据 **/
                    str = EntityUtils.toString(result.getEntity());
                    if (noNeedResponse) {
                        return null;
                    }
                    /** 把json字符串转换成json对象 **/
                    jsonResult = 
                            new JsonParser().parse(str).getAsJsonObject();
                } catch (Exception e) {
                    logger.error("post请求提交失败:" + url, e);
                }
            }

        } catch (IOException e) {
            logger.error("post请求提交失败:" + url, e);
        } finally {
            try {
                // 关闭流并释放资源
                closeableHttpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonResult;
    }

    /**
     * 发送get请求
     *
     * @param url
     *            路径
     * @return
     */
    public static JsonObject httpGet(String url) {
        // get请求返回结果
    	JsonObject jsonResult = null;

        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        // HttpClient
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

        try {

            HttpGet httpGet = new HttpGet(url);

            // 执行get请求
            HttpResponse httpResponse = closeableHttpClient.execute(httpGet);
            // 获取响应消息实体
            HttpEntity entity = httpResponse.getEntity();
            // 判断响应实体是否为空
            if (entity != null) {
                /** 把json字符串转换成json对象 **/
                jsonResult = 
                new JsonParser().parse(EntityUtils.toString(entity)).getAsJsonObject();  

            }
        } catch (IOException e) {
            logger.error("get请求提交失败:" + url, e);
        } finally {
            try {
                // 关闭流并释放资源
                closeableHttpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonResult;
    }
    
    public static JsonArray httpGetArray(String url) {
        // get请求返回结果
    	JsonArray jsonResult = null;

        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        // HttpClient
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

        try {

            HttpGet httpGet = new HttpGet(url);

            // 执行get请求
            HttpResponse httpResponse = closeableHttpClient.execute(httpGet);
            // 获取响应消息实体
            HttpEntity entity = httpResponse.getEntity();
            // 判断响应实体是否为空
            if (entity != null) {
                /** 把json字符串转换成json对象 **/
                jsonResult = 
                new JsonParser().parse(EntityUtils.toString(entity)).getAsJsonArray();  

            }
        } catch (IOException e) {
            logger.error("get请求提交失败:" + url, e);
        } finally {
            try {
                // 关闭流并释放资源
                closeableHttpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonResult;
    }
    
    
    /**
     * 通过HttpClient以XML字符串的形式发送post请求调用接口
     * @param url 目标url
     * @param xmlData XML格式字符串数据
     * @return 
     * @throws IOException 
     * @throws UnsupportedEncodingException 
     * @throws Exception
     */
    public static String sendXMLDataByPost(String url, String xmlData) throws IOException{ 
    	 String UTF8 = "UTF-8";
         URL httpUrl = new URL(url);
         HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();
         //httpURLConnection.setRequestProperty("Host", "api.mch.weixin.qq.com");
         httpURLConnection.setDoOutput(true);
         httpURLConnection.setRequestMethod("POST");
         httpURLConnection.setConnectTimeout(10*1000);
         httpURLConnection.setReadTimeout(10*1000);
         httpURLConnection.connect();
         OutputStream outputStream = httpURLConnection.getOutputStream();
         outputStream.write(xmlData.getBytes(UTF8));
         //获取内容
         InputStream inputStream = httpURLConnection.getInputStream();
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF8));
         final StringBuffer stringBuffer = new StringBuffer();
         String line = null;
         while ((line = bufferedReader.readLine()) != null) {
             stringBuffer.append(line);
         }
         String resp = stringBuffer.toString();
         
         if (stringBuffer!=null) {
             try {
                 bufferedReader.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if (inputStream!=null) {
             try {
                 inputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         if (outputStream!=null) {
             try {
                 outputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         return resp;
    }
    
    public static void main(String[] args) throws Exception {
    	String textXml=
    			  "<?xml version='1.0' encoding='UTF-8' standalone='no'?>"
    			+ "<xml>"
    			+ "<nonce_str>0e82af301cc34abab0856430aab40baa</nonce_str>"
    			+ "<out_trade_no>20170818094426b7f2741845944d8284</out_trade_no>"
    			+ "<openid>ovqBywEXQPItqme8mtn0wloDeglY</openid>"
    			+ "<appid>wx83722e76554de64b</appid>"
    			+ "<total_fee>1</total_fee>"
    			+ "<sign>8C3C08B44E20DD33C3EBF5D9EB83241A</sign>"
    			+ "<trade_type>JSAPI</trade_type>"
    			+ "<fee_type>CNY</fee_type>"
    			+ "<mch_id>1434171002</mch_id>"
    			+ "<body>维睿教育社区-缴费</body>"
    			+ "<notify_url>http://1804w7d761.imwork.net/wtrj-edu-community/pay/payResultCallBack</notify_url>"
    			+ "<spbill_create_ip>192.168.3.254</spbill_create_ip>"
    			+ "</xml>";
    			String o=sendXMLDataByPost("https://api.mch.weixin.qq.com/pay/unifiedorder",textXml);
    			System.out.println(o);
    			System.out.println(WXPayUtil.xmlToMap(o));
	}
}

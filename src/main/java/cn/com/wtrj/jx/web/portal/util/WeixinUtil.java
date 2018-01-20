package cn.com.wtrj.jx.web.portal.util;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;

import com.google.gson.JsonObject;

import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.config.WxCpConfigStorage;
import me.chanjar.weixin.cp.config.WxCpInMemoryConfigStorage;
import net.sf.json.JSONObject;


public class WeixinUtil {
	/**
	 * 将授权用户的userid转化为openid
	 * @param accessToken 调用接口凭证
	 * @param userId 用户id
	 * @return 
	 */
	public static JsonObject convertUseridToOpenid(String accessToken,String userId){
		String url="https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token="+accessToken;
		JsonObject obj=new JsonObject();
		obj.addProperty("userid", userId);
		return HttpRequestUtils.httpPost(url,obj);
	}
	
	
	/**
	 * 根据code获取成员信息
	 * 如果当前微信用户是企业成员，则获取到的是userid,通过userid换区openid
	 * 如果当前微信用户非企业成员，则获取到的是openid(每个微信用户对每个微信应用有唯一的openid)
	 * @param token 调用接口凭证 
	 * @param code 通过成员授权获取到的code，每次成员授权带上的code将不一样，code只能使用一次，10分钟未被使用自动过期 
	 * @return
	 */
	public static JsonObject getUserInfo(String token, String code) {

		String getUser = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=" + token + "&code=" + code;

		JsonObject userResult = HttpRequestUtils.httpGet(getUser);

		return userResult;
	}
	
	/**
	 * 获取接口调用凭证
	 * @param appid
	 * @param secret
	 * @return
	 */
	public static String getToken(String appid, String secret) {
		String aturl = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + appid + "&corpsecret=" + secret;

		JsonObject jo = HttpRequestUtils.httpGet(aturl);

		return jo.get("access_token").getAsString();
	}
	
	/**
	 * 通过token和userId获取用户详细信息
	 * @param token
	 * @param userId
	 * @return
	 */
	public static JsonObject getUserInfoByUserId(String token, String userId) {
		String url = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=" + token + "&userid=" + userId;

		JsonObject jo = HttpRequestUtils.httpGet(url);
		return jo;
	}

	public static JsonObject sendWeiXinMessage(String token, JsonObject jsonParam) {
		String url = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=" + token;
		return HttpRequestUtils.httpPost(url, jsonParam);
	}

	public static WxCpService getWxCpService(String appid,String secret) {
		WxCpInMemoryConfigStorage config = new WxCpInMemoryConfigStorage();
        config.setCorpId(appid);      // 设置微信企业号的appid
        config.setCorpSecret(secret);  // 设置微信企业号的app corpSecret
        WxCpService wxCpService = new WxCpServiceImpl();
        wxCpService.setWxCpConfigStorage((WxCpConfigStorage)(config));
        return wxCpService;
	}
	
	
	 /** 
     * 上传多媒体文件 
     * @param access_token 
     * @param type 图片（image）、语音（voice）、视频（video）和缩略图（thumb） 
     * 图片（image）: 1M，支持JPG格式 
     * 语音（voice）：2M，播放长度不超过60s，支持AMR\MP3\SPEEX格式 
     * 视频（video）：10MB，支持MP4格式 
     * 缩略图（thumb）：64KB，支持JPG格式 
     * @param fileUrl 
     * @return 
     * @throws IOException 
     */  
    @SuppressWarnings("deprecation")  
    public static String uploadMedia(String access_token, String type,  
            String fileUrl) throws IOException {  
        String media_id = null;  
        CloseableHttpResponse response = null;  
        String url = "https://qyapi.weixin.qq.com/cgi-bin/media/upload?access_token="  
                + access_token + "&type=" + type;  
        CloseableHttpClient httpclient = null;  
        httpclient = HttpClients.createDefault();  
        HttpPost httpPost = new HttpPost(url);  
        FileBody bin = new FileBody(new File(fileUrl));  
        MultipartEntity mpEntity = new MultipartEntity(); // 文件传输  
        mpEntity.addPart("media", bin);  
        httpPost.setEntity(mpEntity);  
        try {  
            response = httpclient.execute(httpPost);  
            int statusCode = response.getStatusLine().getStatusCode();  
            if (statusCode == HttpStatus.SC_OK) {  
                HttpEntity entity = response.getEntity();  
                String jsonString = EntityUtils.toString(entity);  
                JSONObject fromObject = JSONObject.fromObject(jsonString);  
                Object media_idObject = fromObject.get("media_id");  
                if (media_idObject != null) {  
                    media_id = media_idObject.toString();  
                } else {  
                    System.out.println(fromObject.toString());  
                }  
            }  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if(response != null){  
                response.close();  
            }  
            if(httpclient!= null){  
                httpclient.close();  
            }  
        }  
        return media_id;  
    }  
	
}

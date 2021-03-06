package cn.com.wtrj.jx.web.portal.util;

import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.api.impl.WxCpServiceImpl;
import me.chanjar.weixin.cp.config.WxCpConfigStorage;
import me.chanjar.weixin.cp.config.WxCpInMemoryConfigStorage;
import me.chanjar.weixin.cp.message.WxCpMessageRouter;

public class WxCpServiceInstance {
	private WxCpService wxCpService;
	private WxCpInMemoryConfigStorage wxCpConfigStorage;
	private WxCpMessageRouter wxCpMessageRouter;

	private static WxCpServiceInstance instance = null;

	public static WxCpServiceInstance getInstance() {
		if (instance == null) {
			try {
				instance = new WxCpServiceInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

	private WxCpServiceInstance() throws Exception {
		wxCpService = new WxCpServiceImpl();
		wxCpConfigStorage = new WxCpInMemoryConfigStorage();
		wxCpConfigStorage.setCorpId(PropertiesUtil.getInstance().getValue(SampleConstants.WEIXIN_CP_APPID));      // 设置微信企业号的appid
		wxCpConfigStorage.setCorpSecret(PropertiesUtil.getInstance().getValue(SampleConstants.WEIXIN_CP_SECRET));  // 设置微信企业号的app corpSecret
		wxCpService.setWxCpConfigStorage(wxCpConfigStorage);
		wxCpMessageRouter = new WxCpMessageRouter(wxCpService);
	}

	public WxCpService getWxCpService() {
		return wxCpService;
	}

	public WxCpConfigStorage getWxCpConfigStorage() {
		return wxCpConfigStorage;
	}

	public WxCpMessageRouter getWxCpMessageRouter() {
		return wxCpMessageRouter;
	}
}

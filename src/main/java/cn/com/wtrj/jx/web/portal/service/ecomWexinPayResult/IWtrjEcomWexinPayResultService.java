package cn.com.wtrj.jx.web.portal.service.ecomWexinPayResult;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomWexinPayResult;

public interface IWtrjEcomWexinPayResultService {
  /**
   * 新增微信支付结果记录
   * @param record
   */
  void insertSelective(WtrjEcomWexinPayResult record);
}

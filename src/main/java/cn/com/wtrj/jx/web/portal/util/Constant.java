package cn.com.wtrj.jx.web.portal.util;

public class Constant {
	/**
	 * 页面request请求处理结果
	 * @author wusm
	 *
	 */
	public static class RetCode{
		
		/**
		 * 页面request请求处理结果：01：发生异常
		 */
		public static String ERROR = "01";
		
		/**
		 * 页面request请求处理结果：02：成功
		 */
		public static String SUCCESS = "02";
	}
	
	public static class PayStatus{
		
		//已下单，待支付
		public static final String UNPAID="00";
		
		//支付成功
		public static final String SUCCESS="01";
		
		//支付失败
		public static final String FAIL="02";
		
		//支付取消
		public static final String CANCEL="03";
	}
	
	public static class PayType{
		//支付宝
		public static final String ALI_PAY="01";
		//微信
		public static final String WEXIN="02";
	}
	
	public static class PermissionType {
		// 班主任
		public static final String HEADER_TEACHER = "1";
		// 任课老师
		public static final String COURSE_TEAHCER = "2";
		// 3：生辅老师
		public static final String SHENFU_TEACHER = "3";
		// 4：备课组长
		public static final String BEIKE_TEACHER = "4";
		// 5：年级组长
		public static final String GRADE_LEADER = "5";
		// 6：教研组长
		public static final String RESEACHER_LEADER = "6";
		// 99：其他（行政）
		public static final String OTHER_AMD = "99";
		// 100:员工
		public static final String EMPLOYEE = "100";
		// 101:学部领导
		public static final String STAGE_LEADER = "101";
		// 110：全部权限
		public static final String ALL_AUTH = "110";
	}
	
	
}

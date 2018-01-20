package cn.com.wtrj.jx.web.portal.service.report.impl;

public class ConstRpt {

	/**
	 * 各类指标
	 * 
	 * @author VI
	 *
	 */
	public static class IndexId {
		public static final Integer index101 = 1; // 总收入
		public static final Integer index102 = 2; // 总支出
		public static final Integer index103 = 3; // 净利率
		public static final Integer index104 = 4; // 净利润
		public static final Integer index105 = 5; // 人均净利润
		public static final Integer index106 = 6; // 师均净利润
		public static final Integer index107 = 7; // 生均净利润
		public static final Integer index201 = 8; // 招生总人数
		public static final Integer index202 = 9; // 直升人数
		public static final Integer index203 = 10; // 推优人数
		public static final Integer index301 = 11; // 总平均分
		public static final Integer index302 = 12; // 总分最高分
		public static final Integer index303 = 13; // 及格率
		public static final Integer index304 = 14; // 有效分
		public static final Integer index401 = 15; // 师生比
		public static final Integer index501 = 16; // OA流程完成率
		public static final Integer index502 = 17; // OA流程完成平均耗时
		public static final Integer index503 = 18; // OA未完成节点最长停留时间
	}

	/**
	 * 各类指标
	 * 
	 * @author VI
	 *
	 */
	public static class IndexType {
		public static final Integer type01 = 1; // 财务
		public static final Integer type02 = 2; // 招生
		public static final Integer type03 = 3; // 成绩
		public static final Integer type04 = 4; // 人员
		public static final Integer type05 = 5; // 管理
	}

	/**
	 * 警告级别
	 * 
	 * @author VI
	 *
	 */
	public static class WarnLevel {
		public static final Integer Warn = -1; // 指标异常
		public static final Integer Normal = 0; // 指标正常
		public static final Integer Perfect = 1; // 指标优良
	}
}

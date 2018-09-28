package ces.fileonvert.page_mu.zjm;

import ces.fileonvert.page_mu.Ac;

public class mubus {
	/**
	 * 主页面
	 */
	/**
	 * 点击配置按钮，进入配置中心
	 */
	public static void click_pz() {
		Ac.click_xpath(muele.pzan);
	}

	/**
	 * 配置中心主界面
	 */
	/**
	 * 目录监控：配置中心
	 */

	/**
	 * 点击目录监控设置
	 */
	public static void click_jkms() {
		Ac.wait_id(muele.jkmssz);
		Ac.click_id(muele.jkmssz);
	}

	/**
	 * 点击通用参数设置
	 */
	public static void click_tycs() {
		Ac.click_id(muele.tycssz);
	}

	/**
	 * 点击支持格式设置
	 */
	public static void click_zcgs() {
		Ac.click_id(muele.zcgssz);
	}

	/**
	 * 点击格式转换方案选择
	 */
	public static void click_zhfaxz() {
		Ac.click_id(muele.zhfaxz);
	}

	
	/**
	 * 主页面
	 */
	/**
	 * 点击启动按钮
	 */
	public static void click_qid() {
		Ac.click_id(muele.qd);
	}
	/**
	 * 点击 关闭按钮
	 */
	public static void click_off() {
		Ac.click_id(muele.close);
	}
	/**
	 * 点击最小化按钮
	 */
	public static void click_min() {
		Ac.click_id(muele.min);
	}
	/**
	 * 点击方案按钮
	 */
	public static void click_fa() {
		Ac.click_id(muele.fa);
	}
	/**
	 * 点击查询按钮
	 */
	public static void click_slelect() {
		Ac.click_id(muele.select);
	}
	/**
	 * 点击统计按钮
	 */
	public static void click_tj() {
		Ac.click_id(muele.tj);
	}
	/**
	 * 点击日志按钮
	 */
	public static void click_log() {
		Ac.click_id(muele.log);
	}
	/**
	 * 
	 * 
	 */
	
	
	
}

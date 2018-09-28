package ces.fileonvert.page_mu.jkms;

import ces.fileonvert.page_mu.Ac;

public class bus {
	/**
	 * 目录监控
	 */
	/**
	 * 点击目录监控
	 */
	public static void click_ml() {
		Ac.click_id(eles.mljk);
	}

	public static void 点击目录监控() {
		Ac.click_id(eles.mljk);
	}

	/**
	 * 点击数据库监控
	 */
	public static void click_sjk() {
		Ac.click_id(eles.sjkjk);
	}

	public static void 点击数据库监控() {
		Ac.click_id(eles.sjkjk);
	}

	/**
	 * 点击数据库设置
	 */
	public static void click_sjksz() {
		Ac.click_id(eles.sjksz);
	}

	public static void 点击数据库设置() {
		Ac.click_id(eles.sjksz);
	}

	/**
	 * 普通模式：
	 */
	public static void click_pt() {
		Ac.click_id(eles.pt);
		// Ac.click_linktext(eles.pt_link);
	}

	public static void 点击普通模式() {
		Ac.click_id(eles.pt);
	}

	/**
	 * 数据库类型:点击下拉框按钮
	 */
	public static void click_title() {
		Ac.click_xpath(eles.sjklxbu_x);
	}

	public static void 点击选择数据库的下拉框() {
		Ac.click_xpath(eles.sjklxbu_x);
	}

	/**
	 * 选择数据库类型:
	 * 
	 * @param sqlid
	 *            数据库类型
	 * @param
	 */
	public static void select_sqltest(String sqlid) {
		Ac.wait_until(5, sqlid);
		Ac.click_id(sqlid);
	}

	public static void 点击选择数据库名称(String sqlid) {
		Ac.wait_until(5, sqlid);
		Ac.click_id(sqlid);
	}

	/**
	 * 输入数据库地址：
	 */
	public static void inputadd(String sjadd) {
		Ac.clear_id(eles.sjkdz);
		Ac.input_id(eles.sjkdz, sjadd);
	}

	public static void 输入数据库地址(String sjadr) {
		Ac.clear_id(eles.sjkdz);
		Ac.input_id(eles.sjkdz, sjadr);
	}

	/**
	 * 输入数据库名称
	 */
	public static void inputsjname(String sjname) {
		Ac.clear_id(eles.sjkmc);
		Ac.input_id(eles.sjkmc, sjname);
	}

	public static void 输入数据库名称(String 数据库名称) {
		Ac.clear_id(eles.sjkmc);
		Ac.input_id(eles.sjkmc, 数据库名称);
	}

	/**
	 * 输入数据库端口
	 */
	public static void inputport(String sjtcp) {
		Ac.clear_id(eles.sjkdk);
		Ac.input_id(eles.sjkdk, sjtcp);
	}

	public static void 输入数据库端口(String 数据库端口) {
		Ac.clear_id(eles.sjkdk);
		Ac.input_id(eles.sjkdk, 数据库端口);
	}

	/**
	 * 输入登录用户名：
	 */
	public static void inputdlname(String dlname) {
		Ac.clear_id(eles.dlyhm);
		Ac.input_id(eles.dlyhm, dlname);
	}

	public static void 输入登陆用户名(String 数据库登录名) {
		Ac.clear_id(eles.dlyhm);
		Ac.input_id(eles.dlyhm, 数据库登录名);
	}

	/**
	 * 输入登录密码：
	 */
	public static void inputdlpwd(String dlpwd) {
		Ac.clear_id(eles.dlmm);
		Ac.input_id(eles.dlmm, dlpwd);
	}

	public static void 输入登录密码(String 数据库登录密码) {
		Ac.clear_id(eles.dlmm);
		Ac.input_id(eles.dlmm, 数据库登录密码);
	}

	/**
	 * 点击测试连接：普通模式
	 */
	public static void click_testconn() {
		Ac.click_xpath(eles.cslj_x);
	}

	public static void 点击普通模式下的测试链接() {
		Ac.click_xpath(eles.cslj_x);
	}

	/**
	 * 点击测试链接：自定义模式
	 */
	public static void click_connzdy() {
		Ac.click_xpath(eles.cslj_zdy_x);
	}

	public static void 点击自定义模式测试链接() {
		Ac.click_xpath(eles.cslj_zdy_x);
	}

	/**
	 * 点击重置权限表
	 */
	public static void click_reset() {
		Ac.click_id(eles.czqxb);
	}

	public static void 点击重置权限表() {
		Ac.click_id(eles.czqxb);
	}

	/**
	 * 点击自定义模式
	 */
	public static void click_zdy() {
		Ac.click_linktext(eles.zdy_lt);
	}

	public static void 点击自定义模式按钮() {
		Ac.click_linktext(eles.zdy_lt);
	}

	/**
	 * 输入自定义url
	 */
	public static void inputurl(String url) {
		Ac.clear_id(eles.url);
		Ac.input_id(eles.url, url);
	}

	public static void 输入自定义url(String url) {
		Ac.clear_id(eles.url);
		Ac.input_id(eles.url, url);
	}

	/**
	 * 输入自定义登录用户名
	 */
	public static void inputuname(String uname) {
		Ac.clear_id(eles.udlyhm);
		Ac.input_id(eles.udlyhm, uname);
	}

	public static void 输入自定义登录用户名(String uname) {
		Ac.clear_id(eles.udlyhm);
		Ac.input_id(eles.udlyhm, uname);
	}

	/**
	 * 输入自定义登录密码
	 */
	public static void inputupwd(String upwd) {
		Ac.clear_id(eles.udlmm);
		Ac.input_id(eles.udlmm, upwd);
	}

	public static void 输入自定义登录密码(String upwd) {
		Ac.clear_id(eles.udlmm);
		Ac.input_id(eles.udlmm, upwd);
	}

	/**
	 * 数据库配置界面的保存
	 */
	public static void click_sav() {
		Ac.click_xpath(eles.sa_x);
	}

	public static void 点击数据库配置的保存按钮() {
		Ac.click_xpath(eles.sa_x);
	}

	/**
	 * 数据库配置界面的返回
	 */
	public static void click_can() {
		Ac.click_xpath(eles.ca_x);
	}

	public static void 点击数据库配置界面的返回按钮() {
		Ac.click_xpath(eles.ca_x);
	}
	
	
}

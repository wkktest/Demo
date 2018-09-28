package test13.maile.maue.them;

import test13.Action.Ac;

public class thembus extends Ac {

	/**
	 * 点击首页按钮
	 */
	public static void click_hopage() {
		Ac.click_xpath(themele.ho_page_x);
	}

	/**
	 * 点击邮件按钮
	 * 
	 */
	public static void click_mail() {
		Ac.click_xpath(themele.ma_x);
	}

	/**
	 * 点击通讯录按钮
	 */
	public static void click_mali_list() {
		Ac.click_xpath(themele.ma_list_x);
	}

	/**
	 * click 日历 button
	 */
	public static void click_calendar() {
		Ac.click_xpath(themele.calendar);
	}

	/**
	 * 点击彩云网盘按钮
	 */
	public static void click_color_skyd() {
		Ac.click_xpath(themele.color_cloudsky);
	}

	/**
	 * 点击云邮局
	 */
	public static void click_skymail() {
		Ac.click_xpath(themele.cloud_postoffice);
	}

	/**
	 * 点击下载pc端
	 */
	public static void click_downpc() {
		Ac.click_xpath(themele.down_pc);
	}

	/**
	 * 点击企业邮箱
	 */
	public static void click_companymail() {
		Ac.click_xpath(themele.company_mail);
	}

	/**
	 * 点击和通行证按钮
	 */
	public static void click_gopass() {
		Ac.click_xpath(themele.go_pass);
	}

	/**
	 * 点击升级服务按钮
	 */
	public static void click_updatesever() {
		Ac.click_xpath(themele.update_server);
	}

	/**
	 * 点击设置按钮
	 */
	public static void click_install() {
		Ac.click_xpath(themele.install);
	}

	/**
	 * 点击帮助按钮
	 */
	public static void click_help() {
		Ac.click_xpath(themele.help);
	}

	/**
	 * 点击 意见反馈按钮
	 */
	public static void click_feedback() {
		Ac.click_xpath(themele.feedback);
	}

	/**
	 * 点击退出按钮
	 */
	public static void click_quite() {
		Ac.click_xpath(themele.quite);
	}

}

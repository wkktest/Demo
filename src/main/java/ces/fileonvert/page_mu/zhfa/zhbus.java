package ces.fileonvert.page_mu.zhfa;

import ces.fileonvert.page_mu.Ac;

public class zhbus {
	/**
	 * 转换方案的业务逻辑
	 */
	/**
	 * 点击复制模板按钮
	 */
	public static void click_copym() {
		Ac.click_xpath(zheles.copym);
	}
	public static void 点击复制按钮() {
		
	}
	/**
	 * 选择新的模板按钮
	 */
	public static void click_newm() {
		Ac.click_xpath(zheles.newm);
		
	}
	/**
	 * 点击载入按钮
	 */
	public static void click_go_m() {
		Ac.click_xpath(zheles.goM);
	}
	/**
	 * 点击新模板的复制按钮
	 */
	public static void click_newmcopy() {
		Ac.click_xpath(zheles.copynewm);
		
	}
	/**
	 * 点击模板的删除按钮
	 */
	public static void delete_m() {
		Ac.click_xpath(zheles.deletenewm);
		
	}
	

}

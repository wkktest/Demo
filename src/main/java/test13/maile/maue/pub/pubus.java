package test13.maile.maue.pub;

import ces.fileonvert.page_mu.Ac;
import test13.base.base;

public class pubus extends base{
	/**
	 * 点击打开按钮
	 */
	
	public static void click_opensetbut() {
		if(Ac.return_s_i(puele.settbunt, "checked").equals("checked")){
			Ac.click_id(puele.settingbut);
		}else {
			
		}
	}
	
	/**
	 * 点击关闭按钮
	 */
	public static void click_closesetbut() {
		if(Ac.return_s_i(puele.closesetsetbut_x, "class").contains("closingbtn openingbtn")){
			Ac.click_id(puele.settingbut);
		}
	}

	
	
}

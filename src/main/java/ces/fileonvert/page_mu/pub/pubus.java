package ces.fileonvert.page_mu.pub;

import Demo.Base.base;
import Demo.Util.ScreenShot;
import ces.fileonvert.page_mu.Ac;
import ces.fileonvert.page_mu.tycs.teles;

public class pubus extends base{
	/**
	 * 公共的按钮
	 */
	/**
	 *上一步 
	 *
	 */
	public static void click_butpre(){
		Ac.click_xpath(pubele.goback_x);
	}
	
	/**
	 *  保存 
	 *
	 */
	public static void click_s(){
		Ac.click_xpath(pubele.save_x);
	}
	/**
	 *返回
	 *
	 */
	public static void click_back(){
		Ac.click_xpath(pubele.exit_x);
	}
	/**
	 *下一步 
	 *
	 */
	public static void click_butnex(){
		Ac.click_xpath(pubele.next_x);
	}
	
	/**
	 *导入方案 
	 *
	 */
	public static void click_import(){
		Ac.click_xpath(pubele.imcase);
	}
	
	
	
	

	/**
	 * 点击确定
	 */
	public static void clickcent() {
		Ac.click_xpath(pubele.center_x);
	}

	/**
	 * 点击取消
	 */
	public static void clickcance() {
		Ac.click_xpath(pubele.cnacel_x);
	}			
	/**
	 * 提示：
	 */
	
	/**
	 * 
	 */
	public static void issav() {
		
		try {
			Ac.wait_xpath(pubele.saveshow_x);
		}catch (Exception e){
			ScreenShot.takeScreenshot(driver, "baocun");
		}
		
	}
	/**
	 * 判断是否：ftp是否链接保存成功：目录监控：ftp协议
	 */
	public static void isftpconn(){
		String s = Ac.return_s_x(pubele.ftpconn, "class");
		if(s.contains("icon-notification2")){
			pubus.click_butnex();
		}else {
			System.out.println("ftp 链接失败：");
			ScreenShot.takeScreenshot(driver, "ftpconn");
		}
	}
	
	
	
	public static boolean showbiao(){
		Ac.wait_xpath(pubele.addbiao);
		return true;
	}
}

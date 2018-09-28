package test13.maile.maue.them;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Demo.Util.ReportUtil;
import Demo.Util.ScrennFailtureListener;
import test13.loginpagetest.logintest;
import test13.logpage.logpagebus;

@Listeners({ ReportUtil.class,ScrennFailtureListener.class })
public class themtest  {

	static String username="15000345819";
	static String password ="a521yulan";
	@BeforeClass
	public static void login() throws MalformedURLException {
		logintest.setup();
	}
	
	@Test
    public static void testclick() throws InterruptedException {
		logpagebus.login_test(username, password);
		Thread.sleep(4000);
		//主页
		thembus.click_hopage();
		Thread.sleep(4000);
		//邮箱
		thembus.click_mail();
		Thread.sleep(4000);
		//通讯录
		thembus.click_mali_list();
		Thread.sleep(4000);
		//日历
		thembus.click_calendar();
		Thread.sleep(4000);
		//彩云网盘
		thembus.click_color_skyd();
		Thread.sleep(4000);
		//云邮箱
		thembus.click_skymail();
		Thread.sleep(4000);
		//和通行证
		thembus.click_gopass();
		Thread.sleep(4000);
		//设置
		thembus.click_install();
		Thread.sleep(4000);
		//帮助
		thembus.click_help();
		Thread.sleep(4000);
		//下载pc
		thembus.click_downpc();
		Thread.sleep(4000);
		//升级服务：需要使用多窗口
		thembus.click_updatesever();
	    Thread.sleep(4000);
	    //企业邮箱： 需要使用多窗口
	    thembus.click_companymail();
	    Thread.sleep(4000);
	    //意见反馈  : 需要使用多窗口
	    thembus.click_feedback();
	    Thread.sleep(4000);
	    //退出
		thembus.click_quite();
		Thread.sleep(4000);
		
		
	}
	
	
	@AfterClass
    public static void logout() {
		logintest.down();
	}
}

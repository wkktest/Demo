package ces.fileonvert.page_mu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Demo.Base.base;
import Demo.Util.ScreenShot;
import ces.fileonvert.page_mu.jkms.bus;
import ces.fileonvert.page_mu.jkms.eles;
import ces.fileonvert.page_mu.pub.pubele;
import ces.fileonvert.page_mu.pub.pubus;

public class asert extends base {

	/**
	 * 验证提示信息是否存在
	 */
	/**
	 * 判断页面元素是否存在
	 */
	public static boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * 验证数据库是否链接成功
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public static void isconn_pt() throws InterruptedException {
		String s = Ac.return_s_x(pubele.conn, "class");
		System.out.println(s);
		if (s.contains("icon-notification2")) {
			// 进行保存操作
			bus.click_sav();
			Thread.sleep(1000);
			// 验证是否保存成功
			asert.issave_p();
		} else {
			System.out.println("数据库配置错误，请检查");
		}
	}

	/**
	 * 
	 * 验证是否链接成功：
	 * 
	 * @throws InterruptedException
	 */
	public static void isconn_zdy() throws InterruptedException {
		String s = Ac.return_s_x(pubele.conn, "class");
		System.out.println(s);
		if (s.contains("icon-notification2")) {
			Thread.sleep(3000);
			bus.click_sav();
			// // 验证是否保存成功
			asert.issave_z();
		} else {
			System.out.println("数据库配置错误，请检查：");
		}
	}

	/**
	 * 普通模式：验证是否保存成功
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public static void issave_p() throws InterruptedException {
		String s = Ac.return_text_xpath(pubele.saveshow_p);
		System.out.println(s);
		if (s.contains("保存成功")) {
			// 点击返回按钮
			pubus.click_back();
			Thread.sleep(1000);
			// // 点击下一步按钮
			pubus.click_butnex();
		} else {
			System.out.println("保存失敗：连接数据库失败，请检查！");
		}
	}

	/**
	 * 自定义模式：验证是否保存成功
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public static void issave_z() throws InterruptedException {
		String s = Ac.return_text_xpath(pubele.saveshow_z);
		System.out.println("============================" + s);
		if (s.contains("保存成功")) {
			Thread.sleep(1000);
			// 点击返回按钮
			pubus.click_back();
			Thread.sleep(1000);
			// 点击下一步按钮
			pubus.click_butnex();
		} else {
			System.out.println("保存失敗：连接数据库失败，请检查 ");
		}
	}

	/**
	 * 验证保存成功
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public static void save_issueces() {
		try {
			String s1 = Ac.return_text_xpath(pubele.savsow_x);
			System.out.println(s1);
			Assert.assertEquals("保存成功", s1);
			// return true;
		} catch (Exception e) {
			System.out.println("保存失败：");
//			e.printStackTrace();
			Assert.fail("保存失敗，未找到元素：" + pubele.savsow_x);
			// return false;
		}
	}

	public static void sav_issuec() {
		Ac.wait_until(5, pubele.savsow_x);
	}

	/**
	 * 验证数据库是否链接成功
	 */
	public static void conn_issueces() {
		try {
			String s = Ac.return_text_xpath(pubele.sqlconn_x);
			System.out.println(s);
			Assert.assertEquals("数据库配置正确", s);
		} catch (Exception e) {
			System.out.println("数据库测试链接失败：");
			e.printStackTrace();
		}
	}

	/**
	 * 验证数据库是否链接失败
	 */
	public static void conn_fail() {
		try {
			String s = Ac.return_text_xpath(pubele.sqlfail_x);
			Assert.assertEquals("连接数据库失败，请检查！", s);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}

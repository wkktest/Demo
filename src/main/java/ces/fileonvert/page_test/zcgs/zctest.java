package ces.fileonvert.page_test.zcgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.Base.base;
import Demo.Util.AcUtil;
import ces.fileonvert.page_mu.zjm.mubus;
import ces.fileonvert.page_test.jkms.jkcas;

public class zctest extends base {
	static String url = "http://192.168.10.92:12312/convert/file-convert/convertIndex.html";

	@BeforeMethod
	public static void setup() {
		AcUtil.killProcess();
		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//	@Test(description="正用例：开启所有的支持格式按钮",groups="支持格式")
//	public static void test1() throws InterruptedException{
//		//进入目录监控按钮
//		jkcas.click_m();
//		//进入支持格式界面；
//		mubus.click_zcgs();
//		//全部开启支持格式
//        zccas.case1();
//	}
	@Test(description="反用例：验证关闭所有的支持格式按钮",groups="支持格式")
	public static void test2() throws InterruptedException{
		//进入目录监控按钮
		jkcas.click_m();
		//进入支持格式界面；
		mubus.click_zcgs();
		//全部开启支持格式
        zccas.case2();
	}
	

	@AfterMethod
	public static void teardown() {
		driver.close();
	}
}

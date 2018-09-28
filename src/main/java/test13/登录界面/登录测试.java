package test13.登录界面;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Demo.Base.base;
import Demo.Util.ReportUtil;
import Demo.Util.ScrennFailtureListener;
import Demo.Util.importreadfileUtil;

@Listeners({ ReportUtil.class,ScrennFailtureListener.class })

public class 登录测试  extends base {

	
	
	


//	public static WebDriver driver;
	static String username = "15000345819";
	static String password = "a521yulan";

	@BeforeClass(description = "测试类的初始化")
	public static void setup() throws MalformedURLException {
		//关闭后台浏览器
//	ActionUtil.killProcess();
//		
		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
		driver = new ChromeDriver();
//		getdriver.getchromefoxdriver();	
		driver.get("http://mail.10086.cn/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass(description = "测试类结束")
	public static void down() {
		driver.quit();
	}
//成功验证
	@Test(description = "成功的登录验证",groups="登录页面")
	public static void 登录测试2() throws InterruptedException {
		登录操作.登录测试(username, password);
		Thread.sleep(5000);
	}
//数据驱动验证
	@Test(dataProvider = "sss", description = "数据驱动",groups="登录页面")
	public static void 登录测试1(String username, String password) throws InterruptedException {
		登录操作.登录测试1(username, password);
		Thread.sleep(5000);
	}

	@DataProvider(name = "sss")
	public static Object[][] words() throws IOException {
		return importreadfileUtil.readCsvFile("d:\\1\\用户登录.csv", 1);
	}
}

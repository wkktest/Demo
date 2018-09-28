package ces.fileonvert.page_test.zjm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demo.Base.base;

public class test extends base {
	static String url = "http://192.168.10.92:12312/convert/file-convert/convertIndex.html";

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public static void test1() throws InterruptedException{

	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}
}

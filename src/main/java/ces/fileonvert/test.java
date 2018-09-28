package ces.fileonvert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.Base.base;
import Demo.Util.AcUtil;

public class test extends base {
	@BeforeMethod
	public static void setup() {
		AcUtil.killProcess();
		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public static void ss() throws InterruptedException {
		driver.findElement(By.id("kw")).sendKeys("张三");
		driver.findElement(By.id("su")).click();
		Thread.sleep(3000);
		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scrollTo(0,10000)");
//		Thread.sleep(5000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("scrollTo(0,1)");
//		Thread.sleep(5000);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("scrollTo(0,10000)");

//		// Thread.sleep(5000);
//		// 滚动到底部
//		((JavascriptExecutor) driver).executeAsyncScript("document.documentElement.scrollTop=500");
//		Thread.sleep(5000);
//		// 滚动到顶部
//		((JavascriptExecutor) driver).executeAsyncScript("document.documentElement.scrollTop=0");

	}

	@AfterMethod
	public static void teardown() {
		driver.close();
	}
}

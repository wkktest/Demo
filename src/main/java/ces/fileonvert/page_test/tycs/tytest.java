package ces.fileonvert.page_test.tycs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Demo.Base.base;
import Demo.Util.AcUtil;
import Demo.Util.ReportUtil;
import Demo.Util.ScrennFailtureListener;
import ces.fileonvert.page_test.jkms.jkcas;

@Listeners({ ReportUtil.class, ScrennFailtureListener.class })
public class tytest extends base {

	
	
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


	@Test(description="直接转换：文件协议：手动输入路径",groups="通用参数")
	public static void test1() throws InterruptedException{
		jkcas.click_m();
		tycas.case1("D:\\2\\2", "D:\\2\\目标文件名", "D:\\2\\转换成功的文件目录", "D:\\2\\转换失败的文件目录","D:\\2\\临时转换目录","1","","");
	}
	
	@Test(description="直接转换：文件协议：一键创建路径",groups="通用参数")
	public static void test2() throws InterruptedException{
		jkcas.click_m();
		tycas.case2("D:\\2\\3", "1", "", "");
	}
	@Test(description="直接转换：ftp协议：手动输入路径",groups="通用参数")
	public static void test3() throws InterruptedException{
		jkcas.click_m();
		tycas.case3("10.250.190.207","21","wkk","wkk","D:\\2\\4", "D:\\2\\目标文件名", "D:\\2\\转换成功的文件目录", "D:\\2\\转换失败的文件目录","D:\\2\\临时转换目录","1","","");
	}
	@Test(description="重复转换：2次：文件协议：手动输入路径",groups="通用参数")
	public static void test4() throws InterruptedException{
		jkcas.click_m();
		tycas.case4("2","D:\\2\\2", "D:\\2\\目标文件名", "D:\\2\\转换成功的文件目录", "D:\\2\\转换失败的文件目录","D:\\2\\临时转换目录","1","","");
	}
	@Test(description="重复转换：2次:文件协议：一键创建路径",groups="通用参数")
	public static void test5() throws InterruptedException{
		jkcas.click_m();
		tycas.case5("2","D:\\2\\3", "1", "", "");
	}
	
	@Test(description="重复转换：2次：ftp协议：手动输入路径",groups="通用参数")
	public static void test6() throws InterruptedException{
		jkcas.click_m();
		tycas.case6("2","10.250.190.207","21","wkk","wkk","D:\\2\\4", "D:\\2\\目标文件名", "D:\\2\\转换成功的文件目录", "D:\\2\\转换失败的文件目录","D:\\2\\临时转换目录","1","","");
	}


	@AfterMethod
	public static void teardown() {
		driver.close();
	}
}

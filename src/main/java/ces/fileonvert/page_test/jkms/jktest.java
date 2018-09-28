package ces.fileonvert.page_test.jkms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Demo.Base.base;
import Demo.Util.AcUtil;
import Demo.Util.ReportUtil;
import Demo.Util.ScrennFailtureListener;
import ces.fileonvert.page_mu.jkms.eles;

@Listeners({ ReportUtil.class, ScrennFailtureListener.class })
public class jktest extends base {
	static String url = "http://192.168.10.92:12312/convert/file-convert/convertIndex.html";

	@BeforeMethod(description = "测试类开始")
	public static void setup() {
		AcUtil.killProcess();
		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	static String 数据库地址    ="10.10.36.62";
	static String 数据库名称    ="convertTool2";
	static String 数据库端口    ="1433";
	static String 数据库登录名称 ="sa";
	static String 数据库登录密码 ="sa_2012";
	
	static String ip = "10.10.36.62";
	static String name = "convertTool2";
	static String prot = "1433";
	static String username = "sa";
	static String userpwd = "sa_2012";

	@Test(description = "正用例：测试进入目录监控界面", groups = "正用例")
	public static void test0() throws InterruptedException {
		jkcas.测试目录数据库监控按钮(ip, name, prot, username, userpwd);
//	jkcas.测试目录数据库监控按钮(数据库地址, 数据库名称, 数据库端口, 数据库登录名称, 数据库登录密码);	
	}

	@Test(description = "正用例：测试进入目录监控界面", groups = "正用例")
	public static void test1() throws InterruptedException {
		jkcas.click_m();
	}

	@Test(description = "正用例：测试sqlserver数据库链接", groups = "正用例")
	public static void test2() throws InterruptedException {
		jkcas.click_sp(eles.sjsql, "10.10.36.62", "convertTool2", "1433", "sa", "sa_2012");
	}

	@Test(description = "正用例：测试mysql数据库链接", groups = "正用例")
	public static void test3() throws InterruptedException {
		jkcas.click_sp(eles.sjmysql, "192.168.40.224", "test", "3360", "root", "root");
	}

	@Test(description = "正用例：测试gbase数据库链接", groups = "正用例")
	public static void test4() throws InterruptedException {
		jkcas.click_sp(eles.sjgabes, "172.16.17.170", "test", "5258", "sysdba", "cesgroup");
	}

	@Test(description = "正用例：测试dm数据库链接", groups = "正用例")
	public static void test5() throws InterruptedException {
		jkcas.click_sp(eles.sjdm, "192.168.10.92", "test", "5258", "sysdba", "000000000");
	}

	@Test(description = "正用例：测试oracle数据库链接", groups = "正用例")
	public static void test6() throws InterruptedException {
		jkcas.click_sp(eles.sjorac, "192.168.40.111", "ORCL", "1521", "wkk", "000000");
	}

	@Test(description = "正用例：测试db2数据库链接", groups = "正用例")
	public static void test7() throws InterruptedException {
		jkcas.click_sp(eles.sjdb2, "192.168.10.201", "ORCL", "50000", "db2admin", "000000000000");
	}

	@Test(description = "正用例：自定义模式：sql数据库", groups = "正用例")
	public static void test8() throws InterruptedException {
		jkcas.click_sz("jdbc:sqlserver://10.10.36.62:1433;DatabaseName=convertTool2", "sa", "sa_2012");
	}

	@Test(description = "反用例：自定义模式：sql数据库", groups = "反用例")
	public static void test9() throws InterruptedException {
		jkcas.click_sz("jdbc:sqlserver://10.10.36.621:1433;DatabaseName=convertTool2", "sa", "sa_2012");
	}

	// 需要从新验证：：
	// // 数据驱动验证
	// @Test(dataProvider = "sss", description = "数据驱动:验证", groups = "正用例")
	// public static void test8(String sqlid, String ip, String name, String
	// prot, String username, String userpwd)
	// throws InterruptedException {
	// case1.click_sp(sqlid, ip, name, prot, username, userpwd);
	//
	// }
	//
	// @DataProvider(name = "sss")
	// public static Object[][] words() throws IOException {
	// return importreadfileUtil.readCsvFile("d:\\1\\sqlconnect.csv", 5);
	// }

	@AfterMethod(description = "测试类结束")
	public static void teardown() {
		driver.quit();
		// driver.close();
	}

}

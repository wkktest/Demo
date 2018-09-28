package Demo.Base;

import Demo.Util.logUtil;
import net.sourceforge.htmlunit.corejs.javascript.ast.NewExpression;

public class log  {
	public static void main(String args[]){
		logUtil logg = new logUtil();
		
		
		logg.info("1111");
		logg.debug("2222");
		logg.warn("3333");
		logg.error("4444");
	}

//	private static WebDriver driver = null;
//	static String url = "http://10.250.199.9:18083/authensystem4-web/login";
//
//	@BeforeClass
//	public static void login() throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
//		// System.setProperty("webdriver.InternetExplorer.driver",
//		// "D:\\webdirver1\\IEDriverServer.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//		driver.get(url);
//	}
//
//	@AfterClass
//	public static void logout() {
//		driver.quit();
//	}
	// @Test
	// public static void test() throws InterruptedException {
	// // Thread.sleep(2000);
	// driver.findElement(By.id("loginName")).sendKeys("user"+randomutil.RndsupStr());
	//
	//// Thread.sleep(2000);
	//// driver.findElement(By.id("loginName")).sendKeys("a"+random.getRandomNumber(0,
	// 9999));
	//// Thread.sleep(2000);
	//// driver.findElement(By.id("pwd")).sendKeys("pwd"+random.getRandomNumber(0,
	// 9999));
	// Thread.sleep(2000);
	// // driver.findElement(By.id("pwd")).sendKeys(b);
	// // Thread.sleep(2000);
	// // Assert.assertEquals(as, driver.getTitle());
	//
	// }

//	@Test
	// (dataProvider = "excledata")
//	public static void test() throws InterruptedException, IOException {
//		
//		// Thread.sleep(2000);
//		driver.findElement(By.id("loginName")).sendKeys("1111111q");
//		// Thread.sleep(2000);
//		driver.findElement(By.id("pwd")).sendKeys("1111111q");
//		Thread.sleep(2000);
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("d:\\1\\.png"));
//		ActionUtil.copyscr("d:\\1\\111.png");
	
		
		
		
		
//		Actionutil.scr();
		// driver.findElement(By.id("pwd")).sendKeys(pwd);
//		Thread.sleep(2000);
		// driver.findElement(By.id("pwd")).sendKeys(b);
		// Thread.sleep(2000);
		// Assert.assertEquals(as, driver.getTitle());S

//	}

	// @DataProvider(name = "excledata")
	// public static Object[][] words() throws IOException,
	// ClassNotFoundException, SQLException {
	//
	// return importreadfileutil.readexcle("d:\\1\\test1.xls", 1);
	// // return excelread.importCsvFile("��ȡcsvģ��.csv", 1);
	// // getTestData("d:\\1\\test1.xls", "test");
	//// return importreadfileutil.readexcle("d:\\1\\test.xlsx", 1);

}

// }
//package Demo.Util.Browser;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import Demo.Base.base;
//
//public class BrowserU extends base {
//
//	private static WebDriver driver;
//
//    public static WebDriver getDriver() {
//        return driver;
//    }
//
//    public static WebDriver setDriver(String browser) {
//    	return myDriver(browser);
//    }
//
//	public static WebDriver myDriver(String browser) {
//
//		WebDriver driver = null;
//
//		if ("firefox".equals(browser.toLowerCase())) {
//
//			// //启动本机firefox
//			// ProfilesIni allProfiles = new ProfilesIni();
//			// FirefoxProfile profile = allProfiles.getProfile("default");
//			// //启动浏览器
//			System.setProperty("webdriver.gecko.driver", "D:\\webdirver1\\geckodriver.exe");
//			// System.setProperty("webdriver.firefox.bin", "C:\\Program Files
//			// (x86)\\Mozilla Firefox\\firefox.exe");
//			ProfilesIni allprofiles = new ProfilesIni();
//			FirefoxProfile profile = allprofiles.getProfile("default");
//
//			driver = new FirefoxDriver(profile);
//			driver.manage().window().maximize();
////			driver.get(URL);
//			
//
//		} else if ("ie_32".equals(browser.toLowerCase())) {
//
//			// 关闭保护模式
//			DesiredCapabilities capability = new DesiredCapabilities();
//			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//			capability.setCapability("ignoreProtectedModeSettings", true);
//			// 指定驱动位置，并加载驱动
//			System.setProperty("webdriver.ie.driver", "D:\\webdirver1\\IEDriverServer_64.exe");
//			driver = new InternetExplorerDriver(capability);
//			driver.manage().window().maximize();
////			driver.get(URL);
//			
//		} else if ("chrome".equals(browser.toLowerCase())) {
//
//			// 指定驱动位置，并加载驱动
//			System.setProperty("webdriver.chrome.driver", "D:\\webdirver1\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
////			driver.get(URL);/
//			
//		} else {
//
//			System.out.println("浏览器指定错误！！！");
//		}
//		return driver;
//
//	}
//
//	//
//	// private static WebDriver driver = null;
//	//
//	// private BrowserU() {
//	//
//	// }
//	//
//	// //单例模式，只有一个driver
//	// public static WebDriver getDriverInstance(Browser browser) {
//	// if (driver == null) {
//	// driver = getDriver(browser);
//	// }
//	// return driver;
//	// }
//	//
//	// public static WebDriver getDriver(Browser browser) {
//	// switch (browser.ordinal()) {
//	// case 1:
//	// return getFireFoxWebDriver();
//	// case 2:
//	// return getIEDriver();
//	// case 3:
//	// return getSafariWebDriver();
//	// case 4:
//	// return getHtmlWebDriver();
//	// }
//	// return getChromeWebDriver();
//	// }
//	//
//	// public static WebDriver getIEDriver() {
//	// if (!System.getProperties().containsKey("webdriver.ie.driver")) {
//	// System.setProperty("webdriver.ie.driver",
//	// System.getProperty("user.dir")
//	// + "D:\\webdirver1\\IEDriverServer_64.exe");
//	// } else
//	// {
//	// System.setProperty("webdriver.ie.driver",
//	// System.getProperty("user.dir")
//	// + "D:\\webdirver1\\IEDriverServer_32.exe");
//	// }
//	// DesiredCapabilities ieCapabilities = DesiredCapabilities
//	// .internetExplorer();
//	// ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
//	// ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//	// return new InternetExplorerDriver(ieCapabilities);
//	// }
//	//
//	// public static WebDriver getFireFoxWebDriver() {
//	// System.setProperty("webdriver.firefox.bin",
//	// "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//	// return new FirefoxDriver();
//	// }
//	//
//	// public static WebDriver getChromeWebDriver() {
//	// try {
//	// if (!System.getProperties().containsKey("webdriver.chrome.driver")) {
//	// System.setProperty("webdriver.chrome.driver",
//	// "D:\\webdirver1\\chromedriver.exe");
//	// }
//	// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	// capabilities.setCapability("chrome.switches",Arrays.asList("--incognito"));
//	// ChromeOptions options = new ChromeOptions();
//	// options.addArguments("--test-type");
//	// capabilities.setCapability("chrom.binary","src/ucBrowserDrivers/chromedriver.exe");
//	// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//	// if (System.getProperties().containsKey("webdriver.chrome.profile")) {
//	// options.addArguments(new String[] { "user-data-dir="
//	// + System.getProperty("webdriver.chrome.profile") });
//	// }
//	// options.addArguments(new String[] { "start-maximized" });
//	// return new ChromeDriver(capabilities);
//	// } catch (Exception e) {
//	// e.getStackTrace();
//	// }
//	//
//	// return null;
//	// }
//	//
//	// public static WebDriver getSafariWebDriver() {
//	// Platform current = Platform.getCurrent();
//	// if ((Platform.MAC.is(current)) || (Platform.VISTA.is(current))
//	// || (Platform.WIN8.is(current))) {
//	// return new SafariDriver();
//	// }
//	//
//	// return null;
//	// }
//	//
//	// public static WebDriver getHtmlWebDriver() {
//	// DesiredCapabilities Capabilities = DesiredCapabilities.htmlUnit();
//	// Capabilities.setCapability("ignoreProtectedModeSettings", true);
//	// HtmlUnitDriver html = new HtmlUnitDriver(Capabilities);
//	// html.setJavascriptEnabled(true);
//	// return html;
//	// }
//}

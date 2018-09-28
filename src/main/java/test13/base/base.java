package test13.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import Demo.Util.DateTimeUtil;
import Demo.Util.ReportUtil;
import Demo.Util.ScreenShot;
import Demo.Util.ScrennFailtureListener;
import Demo.Util.getipUtil;
import Demo.Util.importmysqlUtil;
import Demo.Util.importreadfileUtil;
import Demo.Util.logUtil;
import Demo.Util.randomUtil;

//@Listeners({ ReportUtil.class,ScreSnnFailtureListener.class })
public class base {
	
	
	protected static logUtil log = new logUtil();
	
	protected static getipUtil getip = new getipUtil();
	
	protected static randomUtil random = new randomUtil();
	
	protected static importreadfileUtil readfile = new importreadfileUtil();
	
	protected static importmysqlUtil readsql = new importmysqlUtil();
	
	protected static ScreenShot screen = new ScreenShot();
	
	protected static DateTimeUtil time = new DateTimeUtil();
	
	
	public static WebDriver driver;

	public WebDriver getDriver() {

		return this.driver = driver;
	}

	public static void getInstance(WebDriver superdriver) {
		if (driver == null) {
			driver = superdriver;
		}

	}

}

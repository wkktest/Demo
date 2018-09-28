package test13.asset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Demo.Util.AcUtil;
import Demo.Util.DateTimeUtil;
import Demo.Util.ScreenShot;
import Demo.Util.logUtil;
import test13.base.base;

public class assrt extends base {
	
	public static boolean  iselement(String id) {
		driver.findElement(By.id(id)).isDisplayed();
		return true;
	}
	
	/**
	 * 判断页面元素是否存在
	 * @param name 
	 */
	public static boolean isElementPresent(By by ) {
		
		try {
			driver.findElement(by);
//			log.info("当前页面存在元素："+by);
			return true;
		} catch (Exception e) {
//			ScreenShot.takeScreenshot(driver,"test");
//			log.debug("查看错误截图：");
			return false;
		}

	}
	 
public static boolean 是否存在元素(By by) {
		
		try {
			driver.findElement(by);
			
			return true;
		} catch (Exception e) {
//			ScreenShot.takeScreenshot(driver, "testimg");
//			System.out.println("查看错误截图：");
			return false;
		}

	}
	

	/**
	 * 
	 * 自定义显示等待:判断直到某个元素出现
	 * 
	 * @param id
	 *            :id定位元素
	 * @param time
	 *            ：直到多少时间
	 * @param ele
	 *            ：元素
	 * @return
	 */
	public static boolean is_wait_until(int time, final String ele) {
		
		boolean flag = true;
		WebDriverWait wait;
		wait = new WebDriverWait(driver, time);
		try {
			WebElement wl = wait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id(ele));
				}
			});
			
			flag = true;

		} catch (Exception e) {
			flag = false;
			Assert.fail("not  find :"+ele);
			
		}
		return flag;
	}

	// 显示等待页面元素出现的封装方法，参数为页面元素的By对象
    public static boolean waitWebElement(WebDriver driver, final By by, int second) {
        WebElement waitElement = null;
        WebDriverWait wait = new WebDriverWait(driver, second);
        try {
            // 创建一个新的ExpectedCondition接口，实现apply方法
            waitElement = wait.until(new ExpectedCondition<WebElement>(){
                public WebElement apply(WebDriver d) {
                    return d.findElement(by);
                }
            });
        } catch (Exception e) {
        	Assert.fail("not find :"+by);
            System.out.println(by.toString() + " is not exist until " + second);
        }
        return true;
    }
		
	

	/**
	 * 判断按钮是否选择
	 */
     public static boolean isdisplay(){
		return false;
    	 
     }
}

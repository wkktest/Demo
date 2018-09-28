package test13.登录界面;

import org.openqa.selenium.By;
import org.testng.Assert;

import Demo.Util.logUtil;
import test13.Action.Ac;
import test13.asset.assrt;
import test13.base.base;

public class 登录操作 extends base {
	/**
	 * 登录操作
	 */

	public static void 登录测试(String 用户名, String 密码) {
		logUtil log = new logUtil();
		
//		if (登录操作.是否存在用户名()) {
		if(assrt.是否存在元素(By.id(登录元素.用户名))){
			登录操作.输入用户名(用户名);
		} else {
			log.debug("元素不存在："+登录元素.用户名);
			System.out.println("元素不存在："+登录元素.用户名);
			Assert.fail("元素不存在："+登录元素.用户名);
		}

		if (assrt.是否存在元素(By.id(登录元素.密码))) {
			登录操作.输入密码(密码);
		} else {
			log.debug("元素不存在："+登录元素.密码);
			System.out.println("元素不存在："+登录元素.密码);
			Assert.fail("元素不存在："+登录元素.密码);
		}

		/**
		 * false 输出:已选择保存密码
		 */
//		try{
//			Ac.isselect_id(登录元素.保持登录状态);
////			登录操作.点击保存密码();
//		} catch (Exception e) {
//            log.debug("元素不存在："+登录元素.保持登录状态);
//			Assert.fail("元素不存在："+登录元素.保持登录状态);
//		}
		if (assrt.是否存在元素(By.id(登录元素.登录按钮))) {
			登录操作.点击登录按钮();
			System.out.println("00000000000");
		} else {
			log.debug("元素不存在："+登录元素.登录按钮);
			Assert.fail("元素不存在："+登录元素.登录按钮);
			Assert.fail("");
		}
		登录操作.验证是否登陆成功();
		System.out.println("222222");
	}

	
	
	public static void 登录测试1(String 用户名, String 密码) {
		logUtil log = new logUtil();
		
//		if (登录操作.是否存在用户名()) {
		if(assrt.是否存在元素(By.id(登录元素.用户名))){
			登录操作.输入用户名(用户名);
		} else {
			log.debug("元素不存在："+登录元素.用户名);
			System.out.println("元素不存在："+登录元素.用户名);
			Assert.fail("元素不存在："+登录元素.用户名);
		}

		if (assrt.是否存在元素(By.id(登录元素.密码))) {
			登录操作.输入密码(密码);
		} else {
			log.debug("元素不存在："+登录元素.密码);
			System.out.println("元素不存在："+登录元素.密码);
			Assert.fail("元素不存在："+登录元素.密码);
		}

		/**
		 * false 输出:已选择保存密码
		 */
//		try{
//			Ac.isselect_id(登录元素.保持登录状态);
////			登录操作.点击保存密码();
//		} catch (Exception e) {
//            log.debug("元素不存在："+登录元素.保持登录状态);
//			Assert.fail("元素不存在："+登录元素.保持登录状态);
//		}
		if (assrt.是否存在元素(By.id(登录元素.登录按钮))) {
			登录操作.点击登录按钮();
			System.out.println("00000000000");
		} else {
			log.debug("元素不存在："+登录元素.登录按钮);
			Assert.fail("元素不存在："+登录元素.登录按钮);
			Assert.fail("");
		}
		登录操作.验证是否登录失败();
		System.out.println("1111111");
	}
//	登录操作.验证是否登录失败();
	
	
	
	
	
	
	/**
	 * 
	 */
	public static void 是否存在用户名() {
//		assrt.是否存在元素(By.id(登录元素.用户名));
		
	}

	public static boolean 是否存在密码() {
//		assrt.是否存在元素(By.id(登录元素.密码));
		return false;
	}

	public static boolean 选择保存密码() {
//		登录操作.是否选择(登录元素.保持登录状态);
		return false;
	}

	public static boolean 存在登录按钮() {
//		assrt.是否存在元素(By.id(登录元素.登录按钮));
		return false;
	}

	
	
	/**
	 * 
	 */
//	public static void 验证登录提示() {
//		if(driver.findElement(By.id(登录元素.注册)).isDisplayed()==true){
//			登录操作.验证是否登录失败();
//			System.out.println("111111");
//		}else {
//			登录操作.验证是否登陆成功();
//			System.out.println("222222");
//		}
//	}
	
	
	public static void  验证是否登陆成功() {
		assrt.是否存在元素(By.xpath(登录元素.验证登录成功));
	}

	public static void 验证是否登录失败() {
		assrt.是否存在元素(By.xpath(登录元素.验证密码失败));
	}
	/**
	 * false 为已经选择
	 */
	public static void 是否选择(String id) {
		Ac.isselect_id(id);

	}

	public static boolean 是否存在注册() {
		Ac.isDisplayed(登录元素.注册);
		return false;
	}
	/**
	 * 登录业务操作
	 */

	public static void 输入用户名(String value) {
		Ac.clear_id(登录元素.用户名);
		Ac.input_id(登录元素.用户名, value);
	}

	public static void 输入密码(String value) {
		Ac.clear_id(登录元素.密码);
		Ac.input_id(登录元素.密码, value);
	}

	public static void 点击保存密码() {
		Ac.click_id(登录元素.保持登录状态);
	}

	public static void 点击登录按钮() {
		Ac.click_id(登录元素.登录按钮);
	}
}

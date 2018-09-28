package ces.fileonvert.page_test.jkms;

import org.openqa.selenium.WebElement;

import ces.fileonvert.page_mu.Ac;
import ces.fileonvert.page_mu.asert;
import ces.fileonvert.page_mu.jkms.bus;
import ces.fileonvert.page_mu.jkms.eles;
import ces.fileonvert.page_mu.pub.pubus;
import ces.fileonvert.page_mu.tycs.teles;
import ces.fileonvert.page_mu.zjm.mubus;

public class jkcas {

	/**
	 * 验证中文方法；
	 * @throws InterruptedException 
	 */
	/**
	 * 
	 * @param 数据库地址
	 * @param 数据库名称
	 * @param 数据库端口
	 * @param 数据库登录名
	 * @param 数据库登录密码
	 * @throws InterruptedException
	 */
	public static void 测试目录数据库监控按钮(String 数据库地址,String 数据库名称,String 数据库端口,String 数据库登录名称,String 数据库登录密码) throws InterruptedException {
		mubus.click_pz();
		
		bus.点击目录监控();
//		Ac.暂停5秒();
		bus.点击数据库监控();
//		Ac.暂停5秒();
		bus.点击数据库设置();
		bus.点击普通模式();
		bus.点击选择数据库的下拉框();
//		Ac.暂停5秒();
		bus.点击选择数据库名称(eles.sjsql);
		
		bus.输入数据库地址(数据库地址);
		bus.输入数据库名称(数据库名称);
		bus.输入数据库端口(数据库端口);
		bus.输入登陆用户名(数据库登录名称);
		bus.输入登录密码(数据库登录密码);
		Ac.暂停5秒();
		bus.点击普通模式下的测试链接();
//		Ac.暂停5秒();
		
	}
	
	
		
	
	
	/**
	 * 进入配置中心，设置数据库信息
	 * 
	 * @throws InterruptedException
	 */
	public static void connect() throws InterruptedException {
		String ip = "10.10.36.62";
		String name = "convertTool2";
		String prot = "1433";
		String username = "sa";
		String userpwd = "sa_2012";

	}


	//

	/**
	 * 进入目录监控，点击目录监控
	 */
	public static void click_m() {
		// 在主界面点击配置中心按钮，进入配置中心界面
		mubus.click_pz();
		// 点击监控模式按钮
		mubus.click_jkms();
		// 点击目录监控按钮
		bus.click_ml();
		// 点击下一步
		pubus.click_butnex();
		// 如果提示是否创建表格，则确定，进入通用参数设置界面：
		// centaddb(pubele.addbiao);
		// '
	}

	/**
	 * 判断是否提示：创建表格
	 * 
	 * @param id
	 */
	public static void centaddb(String id) {
		WebElement s = Ac.return_e_id(id);
		String s1 = s.getText();
		if (s1.contains("创建")) {
			pubus.clickcent();
		} else {

		}

	}

	/**
	 * 进入数据库监控:普通模式：
	 * 
	 * @throws InterruptedException
	 */
	public static void click_sp(String sqlid, String ip, String name, String prot, String username, String userpwd)
			throws InterruptedException {
		// 在主界面点击配置中心按钮，进入配置中心界面
		mubus.click_pz();
		// 点击数据库监控按钮
		bus.click_sjk();
		// 点击数据库监控配置中心按钮
		bus.click_sjksz();
		// 判断是否为普通模式:输入数据库信息，进行链接验证：
		jkcas.ispt(sqlid, ip, name, prot, username, userpwd);

	}

	/**
	 * 进入数据库监控：自定义模式：
	 * 
	 * @throws InterruptedException
	 */
	public static void click_sz(String url, String uname, String upwd) throws InterruptedException {
		// 在主界面点击配置中心按钮，进入配置中心界面
		mubus.click_pz();
		// 点击数据库监控按钮
		bus.click_sjk();
		// 点击数据库监控配置中心按钮
		bus.click_sjksz();
		Thread.sleep(1000);
		// 判断是否为：自定义模式：
		jkcas.iszdy(url, uname, upwd);
		
	}

	/**
	 * 数据库链接信息配置:輸入：
	 * 
	 * @param sqlid:数据库类型：
	 *            sjorac = "combobox_i1_1"; 数据库类型2：sql sjsql = "combobox_i1_2";
	 *            数据库类型3：mysql sjmysql = "combobox_i1_3"; 数据库类型4：达蒙 sjdm =
	 *            "combobox_i1_4"; 数据库类型5：db2 sjdb2 = "combobox_i1_5";
	 *            数据库类型6：gbase sjgabes = "combobox_i1_6";
	 * @throws InterruptedException
	 * 
	 * 
	 */
	public static void conntest(String sqlid, String ip, String name, String prot, String username, String userpwd)
			throws InterruptedException {
		// 点击数据库类型 右侧下拉框按钮
		bus.click_title();
		// 选择数据库类型
		bus.select_sqltest(sqlid);
		// 输入sql的ip
		bus.inputadd(ip);
		// 输入sql的数据名：
		bus.inputsjname(name);
		// 输入数据库的端口
		bus.inputport(prot);
		// 输入数据库的用户登录名、
		bus.inputdlname(username);
		// 输入数据库的用户密码
		bus.inputdlpwd(userpwd);

	}

	/**
	 * 
	 * @return
	 */
	/**
	 * 链接自定义数据库信息
	 */
	public static void connzdy(String url, String uname, String upwd) {
		// 输入url
		bus.inputurl(url);
		// 输入用户名
		bus.inputuname(uname);
		// 输入密码
		bus.inputupwd(upwd);
	}

	/**
	 * 判断是否处于普通模式
	 * 
	 * @throws InterruptedException
	 *             case1.conntest(sqlid, ip, name, prot, username, userpwd);
	 *             Thread.sleep(1000); // 判斷：数据库链接:是否成功 asert.conn_pt(); //
	 *             验证：是否保存成功 asert.issave_p(); System.out.println("+++++");
	 *             Thread.sleep(1000); // // 点击下一步按钮 // pubus.click_butnex();
	 */
	public static void ispt(String sqlid, String ip, String name, String prot, String username, String userpwd)
			throws InterruptedException {
		// 输出style的返回值：getAttribute
		String a = Ac.return_s_x(eles.pt_x, "style");
		if (a.contains("none")) {
			bus.click_pt();
			Thread.sleep(2000);
			// 选择输入sql数据库信息：
			jkcas.conntest(sqlid, ip, name, prot, username, userpwd);
			Thread.sleep(1000);
			// 进行测试链接
			bus.click_testconn();
			Thread.sleep(1000);
			// 判斷：数据库链接:是否成功
			asert.isconn_pt();

		} else {

			Thread.sleep(2000);
			// 选择输入sql数据库信息：
			jkcas.conntest(sqlid, ip, name, prot, username, userpwd);
			Thread.sleep(1000);
			// 进行测试链接
			bus.click_testconn();
			Thread.sleep(1000);
			// 判斷：数据库链接失败
			asert.isconn_pt();

		}
	}

	/**
	 * 判断是否处于自定义模式
	 * 
	 * @throws InterruptedException
	 */
	public static void iszdy(String url, String uname, String upwd) throws InterruptedException {
		String a = Ac.return_s_x(eles.zdy_xx, "style");
		if (a.contains("none")) {
			// 点击自定义模式按钮
			bus.click_zdy();
			Thread.sleep(2000);
			// 选择输入sql数据库信息：
			jkcas.connzdy(url, uname, upwd);
			Thread.sleep(1000);
			// 进行测试链接:自定义模式：
			bus.click_connzdy();
//			Thread.sleep(1000);
			// 判断数据库：是否链接成功
			asert.isconn_zdy();
			
			// 判斷是否： 保存成功
//			asert.issave_z();
		} else {
			Thread.sleep(2000);
			// 选择输入sql数据库信息：
			jkcas.connzdy(url, uname, upwd);
			Thread.sleep(1000);
			// 进行测试链接:自定义模式：
			bus.click_connzdy();
			Thread.sleep(1000);
			// 判断数据库：是否链接成功
			asert.isconn_zdy();
			// 判斷是否： 保存成功
//			asert.issave_z();
		}
	}

}

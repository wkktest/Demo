package ces.fileonvert.page_mu.jkms;

public class eles {

	/**
	 * 监控模式设置下的元素定位
	 */

	/**
	 * 目录监控
	 */
	public static String mljk = "directoryMonitor";
	/**
	 * 数据库监控
	 */
	public static String sjkjk = "databaseMonitor";
	/**
	 * 配置数据库模式按钮
	 */
	public static String sjksz = "gotodbconfig";
	/**
	 * 判斷是否為 普通模式
	 */
	public static String pt_x = "//div[@id='deconfigtabs']/div[@id='deconfigtabs-1']";
	/**
	 * 判断是否为 自定义模式：
	 */
	public static String zdy_xx = "//div[@id='deconfigtabs']/div[@id='deconfigtabs-2']";
	/**
	 * 普通模式：按钮
	 * 
	 */
//	public static String pt_link = "普通模式";
	public static String pt = "coral-id-1";
	
	/**
	 * 数据库类型下选按钮：
	 */
	public static String sjklxbu_x = "//span[@class='coral-combo-arrow coral-icon-arrow icon icon-arrow-down2']";
	/**
	 * 数据库类型1：oracle
	 */
	// public static String sjklx = "combobox_i1_0";
	public static String sjorac = "combobox_i1_1";
	/**
	 * 数据库类型2：sql
	 */
	public static String sjsql = "combobox_i1_2";
	/**
	 * 数据库类型3：mysql
	 */
	public static String sjmysql = "combobox_i1_3";
	/**
	 * 数据库类型4：达蒙
	 */
	public static String sjdm = "combobox_i1_4";
	/**
	 * 数据库类型5：db2
	 */
	public static String sjdb2 = "combobox_i1_5";
	/**
	 * 数据库类型6：gbase
	 */
	public static String sjgabes = "combobox_i1_6";

	/**
	 * 数据库地址：
	 */
	public static String sjkdz = "configDbIp";

	/**
	 * 数据库名称：
	 */
	public static String sjkmc = "configDbName";

	/**
	 * 数据库端口
	 */
	public static String sjkdk = "configDbPort";

	/**
	 * 登录用户名：
	 */
	public static String dlyhm = "configDbUsername";

	/**
	 * 登录密码：
	 */
	public static String dlmm = "configDbPassword";

	/**
	 * 测试连接；
	 */
	public static String cslj_x = "//input[@value='测试连接' and @type='button'][1]";

	public static String cslj_zdy_x = "//*[@id='deconfigtabs-2']/span[3]/span[2]/input";
	/**
	 * 重置权限表
	 */
	public static String czqxb = "//input[@value='重置权限表' and @type='button']";

	/**
	 * 自定义模式
	 */
	public static String zdy = "coral-id-2";
	public static String zdy_x = "//a[@href='#deconfigtabs-2']";
	public static String zdy_lt = "自定义模式";
	/**
	 * 自定义模式:url
	 */
	public static String url = "configDbUrl";
	/**
	 * 自定义模式:登录用户名：
	 */
	public static String udlyhm = "configDbUsername2";

	/**
	 * 自定义模式:登录密码：
	 */
	public static String udlmm = "configDbPassword2";
	/**
	 * 自定义模式:测试连接；
	 */
	public static String ucslj = "//input[@value='测试连接' and @type='button']";

	/**
	 * 自定义模式:重置权限表
	 */
	public static String uczqxb = "//input[@value='重置权限表' and @type='button']";

	/**
	 * 配置中心界面：保存
	 */
//	public static String sa_x="//span[@clas='btncssSave save1']";
	public static String sa_x="//span[text()='保存']";
	/**
	 * 配置中心界面：返回
	 */
	public static String ca_x="//span[@class='btncsscancel']";
	
	
	
}

package ces.fileonvert.page_mu.pub;



public class pubele {

	/**
	 * 公共的元素
	 */

	/**
	 * 下一步
	 */
//	public static String next_x  = "//span[@class='btncssNext'and @onclick='configInit.next()']";
	public static String next_x = "//span[text()='下一步']";
	
	/**
	 * 确定
	 */
	public static String center_x = "//span[text()='确定']";
	/**
	 * 取消
	 */
	public static String cnacel_x = "//span[text()='取消']";
	/**
	 *   保存
	 */
	public static String bc_x = "//span[@class='btncssSave save1']";

	/**
	 * 返回
	 */
	public static String exit_x = "//span[@class='btncsscancel']";

	/**
	 * 上一步
	 */
	public static String goback_x = "//span[@class='btncssPrev']";
	/**
	 * 通用参数设置的保存
	 */
//	public static String save= "fileSave";

	/**
	 * 导入方案
	 */
	public static String imcase = "sysimportconfig";
	/**
	 * 导入方案界面的 保存
	 */
	public static String save_x = "//span[@class='btncssSave']";
	
	
	/**
	 * 提示信息
	 */
	/**
	 * 提示：保存成功
	 */
	public static String saveshow_x="//span[@class='coral-alert-content' and text()='保存成功']";
	public static String savsow_x = "//span[text()='保存成功']";
	/**
	 * 普通模式：判斷是否保存成功
	 */
	public static String saveshow_p="//*[@id='coral-id-4']/span[2]";
	/**
	 * 自定義模式：判斷是否保存成功
	 */
	public static String saveshow_z="//span[@class='coral-alert-content']";
	
	/**
	 * 提示是否链接成功
	 * 
	 */
	public static String conn =	"//span[@class='coral-alert-content']/preceding-sibling::span";
	/**
	 * 提示：数据库链接成功：
	 */
	public static String sqlconn_x="//span[@class='coral-alert-content' and text()='数据库配置正确']";
	/**
	 * 提示：数据库链接失败：
	 */
	public static String sqlfail_x ="//span[@class='coral-alert-content' and text()='连接数据库失败，请检查！']";
	/**
	 * 提示：是否创建表格
	 */
	public static String addbiao = "//span[text()='数据库中缺少表！是否创建！']";


	/**
	 * 判断是否存在
	 */
	/**
	 * 提示是否链接成功
	 * 
	 */
	public static String ftpconn =	"//span[@class='coral-alert-content']/preceding-sibling::span";
	








}

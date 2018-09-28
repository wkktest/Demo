package ces.fileonvert.page_mu.tycs;

public class teles {

	/**
	 * 通用参数设置界面定位元素；
	 * 目录监控下的文件协议
	 */
	
	/**
	 * 目录监控：文件转换设置：直接转换
	 */
	public static String zjzy_x="//label[text()='直接转移']";
	/**
	 * 目录监控：文件转换设置：重新转换：
	 */
	public static String cxzh_x = "//label[text()='重新转换']";  
	/**
	 * 目录监控：文件转换设置：重新转换：重新转换次数：id
	 *
	 */
	public static String cxzhc = "convertCount";
	/**
	 * 目录监控：文件转换设置：文件协议：
	 */
	public static String wjxy_x = "//label[text()='文件协议']";
	
	/**
	 * 目录监控：文件协议：文件路径设置：待转换源文件存放目录：输入框：id
	 */
	public static String dzhf="convertFilePath";
	
	/**
	 * 目录监控：文件协议：文件路径设置：待转换源文件存放目录：清空按钮
	 */
	public static String dzhfclear_x="//input[@id='convertFilePath']/following-sibling::input";
	
	/**
	 * 目录监控：文件协议：文件路径设置：待转换源文件存放目录：选择目录
	 */
	public static String dzhf_x = "//span[text()='选择目录' and @class='coral-textbox-btn-ico icon coral-textbox-btn-textico']";
//	public static String dzhf_x ="//input[@id='convertFilePath']/following-sibling::span/span";
	/**
	 * 目录监控：文件协议：文件路径设置：遍历子目录
	 */
	public static String blzml_x = "//label[@class='coral-radio-label' and text()='遍历子目录']";
	
	/**
	 * 目录监控：文件协议：文件路径设置：合并文件
	 */
	public static String hbwj_x = "//label[@class='coral-radio-label' and text()='合并文件']";
	/**
	 * 目录监控：文件协议：文件路径设置：一键创建转换后目录
	 */
	public static String yjcjf = "autoCreateBtn";
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：目标文件存放目录：输入框
	 */
	public static String mbinput = "convertSuccessTargetText";
	
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：目标文件存放目录：清空按钮
	 */
	public static String mbf_x = "//input[@id='clearPathStyle']/following-sibling::input";
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：目标文件存放目录：选择目录
	 */
	public static String mbxzf_x = "//input[@id='clearPathStyle']/following-sibling::span/span";
//	public static String mbxzf_x="//span[text()='选择目录' and @class='coral-textbox-btn-ico icon coral-textbox-btn-textico']";
	
	/**
	 * 目录监控：文件协议：文件路径设置：转换成功的源文件存放目录：输入框
	 */
	public static String zhsf = "convertSuccessSourceText";
	/**
	 * 目录监控：文件协议：文件路径设置：转换成功的源文件存放目录：清空按钮
	 */
	public static String zhsfclear = "//input[@id='convertSuccessSourceText']/following-sibling::input";
	/**
	 * 目录监控：文件协议：文件路径设置：转换成功的源文件存放目录：选择目录
	 */
	public static String zhsf_x = "//input[@id='convertSuccessSourceText']/following-sibling::span/span";
//	public static String zhsf_x = "//span[text()='选择目录' and @class='coral-textbox-btn-ico icon coral-textbox-btn-textico']";
	/**														         
	 * 目录监控：文件协议：文件路径设置：转换失败的源文件存放目录：输入框
	 */
	public static String zhff = "convertFailSourceText";
	/**
	 * 目录监控：文件协议：文件路径设置：转换失败的源文件存放目录：清空按钮
	 */
	public static String zhffclear = "//input[@id='convertFailSourceText']/following-sibling::input";
	/**
	 * 目录监控：文件协议：文件路径设置：转换失败的源文件存放目录：选择目录
	 */
	public static String zhff_x = "//input[@id='convertFailSourceText']/following-sibling::span/span";
	
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：转换临时文件存放目录：输入框
	 */
	public static String zhlsf = "convertTempText";
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：转换临时文件存放目录：清空按钮
	 */
	public static String zhlsfclear = "//input[@id='convertTempText']/following-sibling:/input";
	/**
	 * 目录监控/数据库监控：文件协议：文件路径设置：转换临时文件存放目录：选择目录
	 */
	public static String zhlsf_x = "////input[@id='convertTempText']/following-sibling::/span/span";
	
		
	/**
	 * 目录监控：文件协议:自动启动设置：开
	 */
	public static String openseting_x = "//input[@id='convertanimation']/following-sibling::span/table/tbody/tr/td[1]/span/label/span";
	
	
	/**
	 * 目录监控；ftp协议下的路径设置
	 */
	
	/**
	 * 目录监控：文件转换设置：ftp协议：
	 */
	public static String ftp_x = "//label[text()='FTP协议']";
	/**
	 * 目录监控：FTP参数：ftp地址：id
	 */
	public static String ftpadd = "ftpaddress";
	/**
	 * 目录监控：FTP参数：端口：id
	 */
	public static String ftpport = "ftport";
	
	/**
	 * 目录监控：FTP参数：用户名：id
	 */
	public static String ftpname = "ftpuser";
	/**
	 * 目录监控：FTP参数：密码：id
	 */
	public static String ftpwd = "ftpassword";
	/**
	 * 目录监控：FTP参数：添加新的ftp地址按钮：
	 */
	public static String ftpad_x = "//span[@class='icon icon-plus']";
	
	
	/**
	 * 目录监控：ftp协议：文件路径设置：待转换源文件存放目录：输入框：id
	 */
	public static String ftpdzhf="convertFilePathftp";
	
	/**
	 * 目录监控：ftp协议：文件路径设置：待转换源文件存放目录：清空按钮
	 */
	public static String ftpdzhfclear_x="//input[@id='convertFilePathftp']/following-sibling::input";
	

	/**
	 * 目录监控：ftp协议：文件路径设置：目标文件存放目录：输入框
	 */
	public static String ftpmbinput = "convertSuccessTargetTextftp";
	
	/**
	 * 目录监控：ftp协议：文件路径设置：目标文件存放目录：清空按钮
	 */
	public static String ftpmbf_x = "//input[@id='clearPathStyle']/following-sibling::input";
	
	/**
	 * 目录监控：ftp协议：文件路径设置：转换成功的源文件存放目录：输入框
	 */
	public static String ftpzhsf = "convertSuccessSourceTextftp";
	/**
	 * 目录监控：ftp协议：文件路径设置：转换成功的源文件存放目录：清空按钮
	 */
	public static String ftpzhsfclear_x = "//input[@id='convertSuccessSourceTextftp']/following-sibling::input";
	/**														         
	 * 目录监控：ftp协议：文件路径设置：转换失败的源文件存放目录：输入框
	 */
	public static String ftpzhff = "convertFailSourceTextftp";
	/**
	 * 目录监控：ftp协议：文件路径设置：转换失败的源文件存放目录：清空按钮
	 */
	public static String ftpzhffclear_x = "//input[@id='convertFailSourceTextftp']/following-sibling::input";

	/**
	 * 目录监控：ftp协议：文件路径设置：转换临时文件存放目录：输入框
	 */
	public static String ftpzhlsf = "convertTempftp";
	/**
	 * 目录监控：ftp协议：文件路径设置：转换临时文件存放目录：清空按钮
	 */
	public static String ftpzhlsfclear_x = "//input[@id='convertTempftp']/following-sibling:/input";
	/**
	 * 目录监控：ftp协议：文件路径设置：转换临时文件存放目录：选择目录
	 */
	public static String ftpzhlsf_x = "////input[@id='convertTempftp']/following-sibling::/span/span";
	
//	/**
//	 * 目录监控：ftp协议：文件路径设置：转换临时文件存放目录：选择目录:点击计算机
//	 */
//	public static String compter_x = "//*[@id='selectsystem']/div/div[1]/div[1]/ul/li[2]";
//	
//	/**
//	 * 目录监控：ftp协议：文件路径设置：转换临时文件存放目录：选择目录:选择磁盘
//	 */
//	public static String selectd_x = "//*[@id='D:\']/td[5]";
//	
//	/**
//	 * 目录监控：文件协议：文件路径设置：转换临时文件存放目录：选择目录:选择磁盘
//	 */
//	public static String selectf_x = "//*[@id='D:\']/td[5]";
		
	/**
	 * 目录监控：ftp/文件协议：转换警报设置：输入数据
	 */
	public static String zhjb = "warnSum";
	
	/**
	 * 目录监控：ftp/文件协议：定时转换设置：关
	 */
	public static String dsoff_x = "//input[@id='isConvertTimer']/following-sibling::span/table/tbody/tr/td[2]";
	
	/**
	 * 目录监控：ftp/文件协议:定时转换设置：开：
	 */
	public static String dsopen_x = "//input[@id='isConvertTimer']/following-sibling::span/table/tbody/tr/td[1]";
	/**
	 * 目录监控：ftp/文件协议:定时转换设置：开：开始时间：
	 */
//	public static String dsstart_x = "startConvertTimer";
	/**
	 * 目录监控：ftp/文件协议:定时转换设置：开：结束时间：
	 */
	
	/**
	 * 目录监控：ftp/文件协议:安全设置：原密码：
	 */
	public static String safoldpwd = "sysOldPassword";
	/**
	 * 目录监控：ftp/文件协议:安全设置：新密码：
	 */
	public static String safnewpwd = "sysNewPassword";
	/**
	 * 目录监控：ftp/文件协议:安全设置：显示密码按钮：
	 */
	public static String showpwd_x = "//span[@class='showpsdint' and @title='显示密码']";
	
	/**
	 * 目录监控：ftp/文件协议:自动启动设置：关
	 */
	public static String zqdoff_x ="//*[@id='filePathSetting']/table/tbody/tr/td[2]/span/table/tbody/tr/td[2]/span/label";
//			"//input[@id='convertanimation']/following-sibling::span/table/tbody/tr/td[2]/span/label/span";
	/**
	 * 目录监控：ftp/文件协议:自动启动设置：开
	 */
	public static String zqdopen_x = "//*[@id='filePathSetting']/table/tbody/tr/td[2]/span/table/tbody/tr/td[1]/span/label";
//			"//input[@id='convertanimation']/following-sibling::span/table/tbody/tr/td[1]/span/label/span";

	
	
	
	
	/**
	 * 数据库监控，定位
	 */
	/**
	 * 文件 转换设置：不在处理
	 */
	public static String sbzzh_x = "//label[text()='不再处理']";
	
//	/**
//	 * 文件转换设置：重新转换
//	 */
//	public static String scxzh_x = "//label[text()='重新转换']";
//	
//	/**
//	 * 文件转换设置：文件协议
//	 */
//	public static String swjxy_x = "//label[text()='文件协议']";
//	
//	/**
//	 * 文件转换设置：FTP协议
//	 */
//	public static String sFTP_x = "//label[text()='FTP协议']";
	

	
	/**
	 * 目录监控：分布式设置：修改当前主机名按钮： id
	 * 
	 */
	
	public static String local= "isAbledLocalname";
	/**
	 * 目录监控：分布式设置：修改当前主机名输入框：id
	 * 
	 */
	
	public static String localip= "localmachinename";
	
	/**
	 * 提示验证：
	 */
	
}

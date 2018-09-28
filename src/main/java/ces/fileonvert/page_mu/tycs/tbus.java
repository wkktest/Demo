package ces.fileonvert.page_mu.tycs;

import Demo.Base.base;
import ces.fileonvert.page_mu.Ac;

public class tbus extends base {

	/**
	 * 目录监控下的业务操作：
	 */
	/**
	 * 点击直接转移按钮
	 */
	public static void click_zjzy() {
		Ac.click_xpath(teles.zjzy_x);
	}
    /**
     * 不在处理
     */
	public static void click_bzcl() {
		Ac.click_xpath(teles.sbzzh_x);
	}
	/**
	 * 点击重新转换按钮
	 */
	public static void click_cxzy() {
		Ac.click_xpath(teles.cxzh_x);
	}

	/**
	 * 输入重新转换的次数
	 * 
	 * @cishu 重新转换的次数
	 */
	public static void input_cxzhcs(String cishu) {
		Ac.clear_id(teles.cxzhc);
		Ac.input_id(teles.cxzhc, cishu);
	}

	/**
	 * 点击文件协议按钮
	 */
	public static void click_wjxy() {
		Ac.click_xpath(teles.wjxy_x);
	}

	/**
	 * 点击ftp协议按钮
	 */
	public static void click_ftp() {
		Ac.click_xpath(teles.ftp_x);
	}
	
	
	
	/**
	 * 目录监控下的业务操作：
	 */
	/**
	 * 目录监控：文件协议：输入待转换源文件目录
	 * 
	 * @param filepath
	 *            待转换源文件目录路径
	 */
	public static void input_dzhf(String filepath) {
		Ac.clear_id(teles.dzhf);
		Ac.input_id(teles.dzhf, filepath);
	}

	/**
	 * 目录监控：文件协议：选择 遍历子目录 按钮
	 * 
	 */
	public static void click_blz() {
		Ac.click_xpath(teles.blzml_x);
	}
	/**
	 * 点击 合并文件按钮
	 */
	public static void click_hbf() {
		Ac.click_xpath(teles.hbwj_x);
	}
	/**
	 * 目录监控：文件协议：点击待转换源文件目录清空按钮
	 */
	public static void clear_dzhf() {
		Ac.clear_xpath(teles.dzhfclear_x);
	}

	/**
	 * 目录监控：文件协议：点击待转换源文件选择目录按钮
	 */
	public static void click_dzhxz() {
		Ac.click_xpath(teles.dzhf_x);
	}
	
    /**
     * 目录监控：文件协议：一键创建转换后目录
     */
	public static void click_yjcj() {
		Ac.click_id(teles.yjcjf);
	}
	
	/**
	 * 目录监控/数据库监控：文件协议：目标文件存放目录：输入框
	 */
	public static void input_mbf(String mvpath) {
		Ac.clear_id(teles.mbinput);
		Ac.input_id(teles.mbinput, mvpath);
	}
	/**
	 * 目录监控/数据库监控：文件协议：目标文件存放目录：点击清空按钮
	 */
	public static void clear_mbf() {
		Ac.click_xpath(teles.mbf_x);
	}
	/**
	 * 目录监控/数据库监控：文件协议：目标文件存放目录：点击选择目录
	 */
	public static void click_mbf() {
		Ac.click_xpath(teles.mbxzf_x);
	}
	/**
	 * 目录监控：文件协议：转换成功的源文件存放目录：输入框
	 * @param ss 转换成功的文件输入的路径
	 */
	public static void input_zhsf(String ss) {
		Ac.clear_id(teles.zhsf);
		Ac.input_id(teles.zhsf,ss );
	}
	/**
	 * 目录监控：文件协议：转换成功的源文件存放目录：点击清空安框
	 */
	public static void clear_zhsf(){
		Ac.clear_xpath(teles.zhsfclear);	
		}
	/**
	 * 目录监控：文件协议：转换成功的源文件存放目录：点击选择目录
	 */
	
	public static void click_zhsfm() {
		Ac.click_xpath(teles.zhsf_x);
	}
	/**
	 * 目录监控：文件协议：转换失败的源文件存放目录：输入
	 */
	public static void input_zhff(String value) {
		Ac.clear_id(teles.zhff);
		Ac.input_id(teles.zhff, value);
	}
	/**
	 * 目录监控：文件协议：转换失败的源文件存放目录：点击清空
	 */
	public static void clear_zhff() {
		Ac.clear_xpath(teles.zhffclear);
	}
	/**
	 * 目录监控：文件协议：转换失败的源文件存放目录：点击选择目录
	 */
	public static void click_zhffm() {
		Ac.click_xpath(teles.zhff_x);
	}
	
	
	/**
	 * 目录监控/数据库监控：文件协议：转换临时的源文件存放目录：输入
	 */
	public static void input_zhlf(String value) {
		Ac.clear_id(teles.zhlsf);
		Ac.input_id(teles.zhlsf, value);
	}
	/**
	 * 目录监控/数据库监控：文件协议：转换临时的源文件存放目录：点击清空
	 */
	public static void clear_zhlf() {
		Ac.clear_xpath(teles.zhlsfclear);
	}
	/**
	 * 目录监控/数据库监控：文件协议：转换临时的源文件存放目录：点击选择目录
	 */
	public static void click_zhlsm() {
		Ac.click_xpath(teles.zhlsf_x);
	}
	/**
	 * 
	 * FTP:ftp地址输入:
	 */
	public static void input_ftpip(String ftpip) {
		Ac.clear_id(teles.ftpadd);
		Ac.input_id(teles.ftpadd, ftpip);
	}
	/**
	 * 
	 * FTP:ftp端口输入:
	 */
	public static void input_ftport(String ftpport) {
		Ac.clear_id(teles.ftpport);
		Ac.input_id(teles.ftpport, ftpport);
	}
	/**
	 * 
	 * FTP:ftp用户名输入:
	 */
	public static void input_ftpname(String ftpuser) {
		Ac.clear_id(teles.ftpname);
		Ac.input_id(teles.ftpname, ftpuser);
	}
	/**
	 * 
	 * FTP:ftp密码输入:
	 */
	public static void input_ftppwd(String ftppwd) {
		Ac.clear_id(teles.ftpwd);
		Ac.input_id(teles.ftpwd, ftppwd);
	}
	/**
	 * ftp协议：待转换源文件存放目录：输入框
	 * @param dzhpath 待转换源文件路径
	 */
	public static void input_ftpdzhyf(String dzhpath) {
		Ac.clear_id(teles.ftpdzhf);
		Ac.input_id(teles.ftpdzhf, dzhpath);
	}
	/**
	 * ftp协议：待转换源文件存放目录：点击清空按钮
	 * 
	 */
	public static void clear_dzhyf() {
		Ac.clear_xpath(teles.ftpdzhfclear_x);
	}
	/**
	 * 
	 */
	/**
	 * ftp协议：目标文件存放目录：输入框
	 * @param mbpath 目标文件路径
	 */
	public static void input_ftpmbf(String mbpath) {
		Ac.clear_id(teles.ftpmbinput);
		Ac.input_id(teles.ftpmbinput, mbpath);
	}
	/**
	 * ftp协议：目标文件存放目录：点击清空按钮
	 * 
	 */
	public static void clear_ftpmbfm() {
		Ac.clear_xpath(teles.ftpmbinput);
	}/**
	 * ftp协议：转换成功的文件存放目录：输入框
	 * @param dzhpath 转换成功的文件路径
	 */
	public static void input_ftpzhcf(String zhcfpath) {
		Ac.clear_id(teles.ftpzhsf);
		Ac.input_id(teles.ftpzhsf, zhcfpath);
	}
	/**
	 * ftp协议：转换成功的文件文件存放目录：点击清空按钮
	 * 
	 */
	public static void clear_ftpzhcf() {
		Ac.clear_xpath(teles.ftpzhsf);
	}
	/**
	 * ftp协议：转换失败的文件存放目录：输入框
	 * @param dzhpath 转换成功的文件路径
	 */
	public static void input_ftpzhff(String zhffpath) {
		Ac.clear_id(teles.ftpzhff);
		Ac.input_id(teles.ftpzhff, zhffpath);
	}
	/**
	 * ftp协议：转换失败的文件文件存放目录：点击清空按钮
	 * 
	 */
	public static void clear_ftpzhff() {
		Ac.clear_xpath(teles.ftpzhff);
	}
	/**
	 * ftp协议：转换临时文件存放目录：输入框
	 * @param dzhpath 待转换源文件路径
	 */
	public static void input_ftplsf(String lspath) {
		Ac.clear_id(teles.ftpzhlsf);
		Ac.input_id(teles.ftpzhlsf, lspath);
	}
	/**
	 * ftp协议：转换临时文件存放目录：点击清空按钮
	 * 
	 */
	public static void clear_ftplsf() {
		Ac.clear_xpath(teles.ftpzhlsfclear_x);
	}
	/**
	 * ftp协议：转换临时文件存放目录：点击选择目录
	 * 
	 */
	public static void click_ftplsm() {
		Ac.clear_xpath(teles.ftpzhlsf_x);
	}
	
	
	

	
	
	
	
	
	
	
	
	/**
	 * 
	 * 文件协议，ftp协议：公共的方法
	 * 转换警报设置：转换警报数量：输入框
	 */
	public static void input_zhjb(String zhjinboshu) {
		Ac.clear_id(teles.zhjb);
		Ac.input_id(teles.zhjb, zhjinboshu);
	}
	/**
	 * 定时转换设置：点击关闭
	 */
	public static void click_dsoff() {
		Ac.click_xpath(teles.dsoff_x);
	}
	/**
	 * 定时转换设置： 点击开启
	 */
	public static void click_dsopen() {
		Ac.click_xpath(teles.dsopen_x);
	}
	/**
	 * 安全设置： 输入原密码
	 */
	public static void input_oldpwd(String oldpwd) {
		Ac.clear_id(teles.safoldpwd);
		Ac.input_id(teles.safoldpwd, oldpwd);
	}
	/**
	 * 安全设置： 输入新密码
	 */
	public static void input_newpwd(String newpwd) {
		Ac.clear_id(teles.safnewpwd);
		Ac.input_id(teles.safnewpwd, newpwd);
	}
	/**
	 * 分布式设置：点击分布式修改ip按钮
	 */
	public static void click_fbupip() {
		Ac.click_id(teles.local);
	}
	/**
	 * 分布式设置：修改IP
	 */
	public static void input_fbadip(String localip) {
		Ac.clear_id(teles.localip);
		Ac.input_id(teles.localip, localip);
	}
	
	/**
	 * 自启动设置：点击关闭
	 */
	public static void click_zqdoff() {
		Ac.click_xpath(teles.zqdoff_x);
	}
	/**
	 * 自启动设置：点击开启
	 */
	public static void click_zqdopen() {
		Ac.click_xpath(teles.zqdopen_x);
	}
}

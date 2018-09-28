package ces.fileonvert.page_test.tycs;

import ces.fileonvert.page_mu.asert;
import ces.fileonvert.page_mu.pub.pubus;
import ces.fileonvert.page_mu.tycs.tbus;

public class tycas {
	// 三级封装，调用二级封装
	/**
	 * 业务逻辑
	 */
	/**
	 * 目录监控：直接转移 :文件协议:遍历子目录： 路径： D:\转换后源文件存放目录\待转换
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param sucesspath
	 *            :转换成功的文件目录
	 * @param failepath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时转换目录
	 * @param count
	 *            :设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 * 
	 */
	public static void case1(String filepath, String mbpath, String sucesspath, String failepath, String lspath,
			String count, String oldpwd, String newpwd) throws InterruptedException {
		// 选择直接转换+文件协议
		tycas.filesett1();
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputwfile(filepath, mbpath, sucesspath, failepath, lspath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.issav();
		Thread.sleep(2000);
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 目录监控：直接转换：文件协议：一件自动创建路径：
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param count
	 *            :转换警报设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 */
	public static void case2(String filepath, String count, String oldpwd, String newpwd) throws InterruptedException {
		// 选择直接转移按钮+文件协议
		tycas.filesett1();
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputwpath(filepath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.issav();
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 目录监控：直接转移 :ftp协议:遍历子目录：
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param sucesspath
	 *            :转换成功的文件目录
	 * @param failepath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时转换目录
	 * @param count
	 *            :设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 */
	public static void case3(String ftpip, String ftpport, String ftpuser, String ftppwd, String filepath,
			String mbpath, String sucesspath, String failepath, String lspath, String count, String oldpwd,
			String newpwd) throws InterruptedException {
		// 选择直接转换+FTP协议
		tycas.filesett2(ftpip, ftpport, ftpuser, ftppwd);
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputspath(filepath, mbpath, sucesspath, failepath, lspath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.isftpconn();
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 目录监控：重复转移 :文件协议:遍历子目录：
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param sucesspath
	 *            :转换成功的文件目录
	 * @param failepath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时转换目录
	 * @param count
	 *            :设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 */
	public static void case4(String cishu, String filepath, String mbpath, String sucesspath, String failepath,
			String lspath, String count, String oldpwd, String newpwd) throws InterruptedException {
		// 选择重复转换+文件协议
		tycas.filesett3(cishu);
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputwfile(filepath, mbpath, sucesspath, failepath, lspath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.issav();
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 目录监控：重复转换：文件协议：一件自动创建路径：
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param count
	 *            :转换警报设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 */
	public static void case5(String cishu, String filepath, String count, String oldpwd, String newpwd)
			throws InterruptedException {
		// 选择重复转换+文件协议
		tycas.filesett3(cishu);
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputwpath(filepath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.issav();
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 目录监控：重复转移 :ftp协议:遍历子目录：
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param sucesspath
	 *            :转换成功的文件目录
	 * @param failepath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时转换目录
	 * @param count
	 *            :设置的正整数
	 * @param oldpwd
	 *            :原先密码
	 * @param newpwd
	 *            :新密码
	 * @throws InterruptedException
	 */
	public static void case6(String cishu, String ftpip, String ftpport, String ftpuser, String ftppwd, String filepath,
			String mbpath, String sucesspath, String failepath, String lspath, String count, String oldpwd,
			String newpwd) throws InterruptedException {
		// 选择重复转换+FTP协议
		tycas.filesett4(cishu, ftpip, ftpport, ftpuser, ftppwd);
		// 选择遍历子目录
		tbus.click_blz();
		// 输入对应的文件路径
		tycas.inputspath(filepath, mbpath, sucesspath, failepath, lspath);
		// 通用设置
		tycas.mtyset(count, oldpwd, newpwd);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.isftpconn();
		// 点击下一步
		pubus.click_butnex();
	}

	/**
	 * 数据库监控：不在处理+文件协议:清空目录设置
	 * 
	 */
	public static void scase1(String count, String oldpwd, String newpwd, String localip) {
		// 选择不在处理，文件协议
		tycas.sfileset1();
		// 清空目录设置
		tycas.sfilepath2();
		// 通用参数设置：
		tycas.styset(count, oldpwd, newpwd, localip);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.issav();
	}

	/**
	 * 数据库监控：不在处理+ftp协议:清空目录设置
	 */
	public static void scase2(String ftpip, String ftpport, String ftpuser, String ftppwd, String count, String oldpwd,
			String newpwd, String localip) {
		// 设置 不在处理+ftp协议
		tycas.sfileset1(ftpip, ftpport, ftpuser, ftppwd);
		// 文件路径设置
		tycas.sfilepath2();
		// 设置数据库监控的通用设置
		tycas.styset(count, oldpwd, newpwd, localip);
		// 点击保存按钮
		pubus.click_s();
		// 提示：保存成功
		pubus.isftpconn();
	}

	
	
	
	
	
	// 二级封装，调用一级封装：tbus,pubus;
	/**
	 * 目录监控：文件转换设置1：直接转换+文件协议
	 */
	public static void filesett1() {
		// 点击直接转换按钮
		tbus.click_zjzy();
		// 点击文件协议按钮
		tbus.click_wjxy();
	}

	/**
	 * 目录监控：文件转换设置2：直接转换+ftp协议
	 * 
	 * @param ftpip
	 *            :ftp的IP地址
	 * @param ftpport
	 *            :ftp的端口
	 * @param ftpuser
	 *            :ftp的用户名
	 * @param ftppwd
	 *            :ftp的密码
	 */
	public static void filesett2(String ftpip, String ftpport, String ftpuser, String ftppwd) {
		// 点击直接转换按钮
		tbus.click_zjzy();
		// 点击fpt协议：
		tbus.click_ftp();
		// 输入ftp信息
		tycas.ftpconn(ftpip, ftpport, ftpuser, ftppwd);
	}

	/**
	 * 目录/数据库监控：文件转换设置3：重新转换+文件协议
	 * 
	 * @param cishu
	 *            :重新转换的次数
	 */
	public static void filesett3(String cishu) {
		// 点击重新转换
		tbus.click_cxzy();
		// 输入重新转换的次数
		tbus.input_cxzhcs(cishu);
		// 点击文件协议
		tbus.click_wjxy();

	}

	/**
	 * 目录/数据库监控：文件转换设置4：重新转换+ftp协议：
	 * 
	 * @param cishu
	 *            :重新转换的次数
	 * @param ftpip
	 *            :ftp的IP地址
	 * @param ftpport
	 *            :ftp的端口
	 * @param ftpuser
	 *            :ftp的用户名
	 * @param ftppwd
	 *            :ftp的密码
	 */
	public static void filesett4(String cishu, String ftpip, String ftpport, String ftpuser, String ftppwd) {
		// 点击重新转换
		tbus.click_cxzy();
		// 输入重新转换的次数
		tbus.input_cxzhcs(cishu);
		// 点击fpt协议：
		tbus.click_ftp();
		// 输入ftp信息
		tycas.ftpconn(ftpip, ftpport, ftpuser, ftppwd);
	}

	/**
	 * 
	 * 目录监控：文件协议：文件路径设置1：输入文件路径 路径格式：D:\1\1
	 * 
	 * @param filepath
	 *            :待转换源文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param sucesspath
	 *            :转换成功的文件目录
	 * @param failepath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时转换目录
	 */
	public static void inputwfile(String filepath, String mbpath, String sucesspath, String failepath, String lspath) {
		// 输入待转换源文件目录
		tbus.input_dzhf(filepath);
		// 输入目标文件目录
		tbus.input_mbf(mbpath);
		// 输入转换成功的文件目录
		tbus.input_zhsf(sucesspath);
		// 输入转换失败的文件目录
		tbus.input_zhff(failepath);
		// 输入临时转换目录
		tbus.input_zhlf(lspath);

	}

	/**
	 * 目录监控：文件协议：文件路径设置2：一件自动生成对应路径
	 * 
	 * @param filepath
	 *            :待转换源文件目录路径 路径格式：D:\1\1
	 */
	public static void inputwpath(String filepath) {
		// 输入待转换源文件路径
		tbus.input_dzhf(filepath);
		// 点击一键自动生成对应路径
		tbus.click_yjcj();
		// 点击确定按钮、
		pubus.clickcent();
	}

	/**
	 * 目录监控：ftp协议：文件路径设置1：手动输入对应路径： 路径格式：/wkk/1
	 * 
	 * @param dzhpath
	 *            :待转换文件目录
	 * @param mbpath
	 *            :目标文件目录
	 * @param zhcfpath
	 *            :转换成功的文件目录
	 * @param zhffpath
	 *            :转换失败的文件目录
	 * @param lspath
	 *            :临时文件目录
	 */
	public static void inputspath(String dzhpath, String mbpath, String zhcfpath, String zhffpath, String lspath) {
		// 输入待转换文件目录
		tbus.input_ftpdzhyf(dzhpath);
		// 输入目标文件目录
		tbus.input_ftpmbf(mbpath);
		// 输入转换成功的文件目录
		tbus.input_ftpzhcf(zhcfpath);
		// 输入转换失败的文件目录：
		tbus.input_ftpzhff(zhffpath);
		// 输入临时文件目录
		tbus.input_ftplsf(lspath);

	}

	/**
	 * 目录监控下：通用设置 转换警报设置 定时任务设置:关闭 安全设置：
	 * 
	 * @param count
	 *            :转换警报设置的正整数
	 * @param oldpwd:原先密码
	 * @param newpwd:新密码
	 * @throws InterruptedException
	 */
	public static void mtyset(String count, String oldpwd, String newpwd) throws InterruptedException {
		// 输入转换警报的数值
		tbus.input_zhjb(count);
		// 点击关闭定时任务：
		tbus.click_dsoff();
		Thread.sleep(2000);
		// 输入安全设置的 原密码；
		// tbus.input_oldpwd(oldpwd);
		// 输入安全设置的新密码：
		// tbus.input_newpwd(newpwd);
		// 选择点击关闭自启动设置：
		// tbus.click_zqdoff();
	}

	/**
	 * 目录监控下：通用设置 转换警报设置 定时任务设置:关闭 安全设置：
	 * 
	 * @param count
	 *            :转换警报设置的正整数
	 * @param oldpwd:原先密码
	 * @param newpwd:新密码
	 */
	public static void styset(String count, String oldpwd, String newpwd, String localip) {
		// 输入转换警报的数值
		tbus.input_zhjb(count);
		// 点击关闭定时任务：
		tbus.click_dsoff();
		// 输入安全设置的 原密码；
		tbus.input_oldpwd(oldpwd);
		// 输入安全设置的新密码：
		tbus.input_newpwd(newpwd);
		// 分布式设置：
		tbus.click_fbupip();
		// 输入当前主机ip
		tbus.input_fbadip(localip);
		// 选择点击关闭自启动设置：
		tbus.click_zqdoff();
	}

	/**
	 * ftp输入信息:
	 * 
	 * @param ftpip
	 *            :ftp的IP地址
	 * @param ftpport
	 *            :ftp的端口
	 * @param ftpuser
	 *            :ftp的用户名
	 * @param ftppwd
	 *            :ftp的密码
	 */
	public static void ftpconn(String ftpip, String ftpport, String ftpuser, String ftppwd) {
		// 输入ftpip地址
		tbus.input_ftpip(ftpip);
		// 输入ftp端口
		tbus.input_ftport(ftpport);
		// 输入ftp用户名
		tbus.input_ftpname(ftpuser);
		// 输入ftp密码
		tbus.input_ftppwd(ftppwd);
	}

	/**
	 * 数据库监控：文件设置：不在处理+文件协议
	 */
	public static void sfileset1() {
		// 点击不在处理
		tbus.click_bzcl();
		// 点击文件协议
		tbus.click_wjxy();
	}

	/**
	 * 数据库监控：文件设置：不在处理+ftp协议
	 */
	public static void sfileset1(String ftpip, String ftpport, String ftpuser, String ftppwd) {
		// 点击不在处理
		tbus.click_bzcl();
		// 点击FTP协议
		tbus.click_ftp();
		// 输入fpt信息
		tycas.ftpconn(ftpip, ftpport, ftpuser, ftppwd);
	}

	/**
	 * 数据库监控：文件协议/ftp协议：输入目标文件名：
	 * 
	 * @param mvpath
	 *            :目标文件路径
	 * @param lspath
	 *            :临时文件目录
	 */
	public static void sfilepath1(String mvpath, String lspath) {
		// 输入目标文件目录
		tbus.input_mbf(mvpath);
		// 输入临时文件目录
		tbus.input_ftplsf(lspath);
	}

	/**
	 * 数据库监控：文件协议/ftp协议：清空目标文件名： 清空目标，临时文件路径
	 */
	public static void sfilepath2() {
		// 输入目标文件目录
		tbus.input_mbf("");
		// 输入临时文件目录
		tbus.input_ftplsf("");
	}

}

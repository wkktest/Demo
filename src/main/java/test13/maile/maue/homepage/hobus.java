package test13.maile.maue.homepage;

import org.openqa.selenium.By;
import org.testng.Assert;

import test13.Action.Ac;
import test13.asset.assrt;
import test13.base.base;

public class hobus extends base {

	/**
	 * 点击 铃铛 提示音按钮
	 * 
	 */

	public static void click_MailSgBtn() {
		Ac.click_xpath(hoele.mailcontacts_x);
	}

	/**
	 * 点击 开启短信提示音
	 */
	public static void click_openSgBtn() {
		if (Ac.return_s_x(hoele.close_closingbtn_x, "class").equals("closingbtn")) {
			Ac.click_id(hoele.singbtn);
		}
	}
	/**
	 * 
	 */

	/**
	 * 点击关闭短信提示音
	 */
	public static void click_closeSgBut() {
		if (Ac.return_s_x(hoele.close_closingbtn_x, "class").equals("closingbtn openingbtn")) {
			Ac.click_id(hoele.singbtn);
		}
	}

	/**
	 * 默认打开提示时,开启所有的功能键:最少开启一个提示音 点击关闭vip提示：
	 * 
	 */
	public static void click_closeVipSg() {
		Ac.click_x(hoele.vip_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭联系人提示：
	 * 
	 */
	public static void click_closeContctSg() {
		Ac.click_x(hoele.contacts_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭陌生人提示：
	 * 
	 */
	public static void click_closeStranSg() {
		Ac.click_x(hoele.stranger_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭代收提示：
	 * 
	 */
	public static void click_closeCollectSg() {
		Ac.click_x(hoele.collection_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭订阅提示：
	 * 
	 */
	public static void click_closeSubsbSg() {
		Ac.click_x(hoele.subscribe_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭账单提示：
	 * 
	 */
	public static void click_closeBillSg() {
		Ac.click_x(hoele.bill_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭服务提示：
	 * 
	 */
	public static void click_closeServSg() {
		Ac.click_x(hoele.service_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭动态提示：
	 * 
	 */
	public static void click_closeTrdSg() {
		Ac.click_x(hoele.trends_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭推广提示：
	 * 
	 */
	public static void click_closeSpdSg() {
		Ac.click_x(hoele.spread_x);
	}

	/**
	 * 默认打开提示时,开启所有的功能键 点击关闭发票提示：
	 * 
	 */
	public static void click_closeInvcSg() {
		Ac.click_x(hoele.invoice_x);
	}

	/**
	 * 铃铛提示音：开启 勿扰模式按钮
	 */
	public static void click_opNodstBtn() {
		if (Ac.return_s_x(hoele.close_nodisturb_x, "class").equals("closingbtn")) {
			Ac.click_i(hoele.nodisturb);
		}
	}

	/**
	 * 铃铛提示音：关闭 勿扰模式按钮
	 */
	public static void click_cloNodstBtn() {
		if (Ac.return_s_x(hoele.open_nodisturb_x, "class").equals("closingbtn openingbtn")) {
			Ac.click_i(hoele.nodisturb);
		}
	}

	/**
	 * 铃铛提示音：勿扰时间：勿扰模式:点击选择按钮：
	 */
	public static void click_DistTpSlt() {
		Ac.click_x(hoele.disturbtype_select_x);
	}

	/**
	 * 铃铛提示音：勿扰时间：勿扰模式:选择当天勿扰模式；
	 */
	public static void select_NowDayTp() {
		Ac.click_x(hoele.disturbtype_today_x);
	}

	/**
	 * 铃铛提示音：勿扰时间：勿扰模式:选择每天12：00至14：00勿扰
	 */
	public static void select_TweHTp() {
		Ac.click_x(hoele.disturbtype_two_x);
	}

	/**
	 * 铃铛提示音:勿扰时间：是否允许vip联系人短信提醒 开启选择按钮
	 */
	public static void click_OpenDistVip() {
		Ac.click_x(hoele.disturbvip_select_x);
	}

	/**
	 * 铃铛提示音:vip联系人提醒：勿扰模式 开启 选择：不允许
	 */
	public static void click_NotDistvip_() {
		Ac.click_x(hoele.disturbvip_yes_x);
	}

	/**
	 * 铃铛提示音:vip联系人提醒：勿扰模式 开启选择：允许
	 */
	public static void click_DoDistVip() {
		Ac.click_x(hoele.disturbvip_no_x);
	}

	/**
	 * 铃铛提示音:点击 详细设置 按钮
	 */
	public static void click_DtSttg() {
		Ac.click_x(hoele.detailsetting_x);
	}

	/**
	 * 铃铛提示音:关闭提示音按钮
	 */
	public static void click_closeCtSg() {
		Ac.click_x(hoele.close_contacts_x);
	}

	// 邮箱账号功能
	/**
	 * 点击邮箱账号右侧下拉框按钮
	 */
	public static void click_MailNmbSl() {

		Ac.click_x(hoele.mailnuber_x);
	}

	/**
	 * 设置头像界面为公共部分
	 */
	/**
	 * 选择当前使用用户当前的手机邮箱
	 */
	public static void select_NowMailNb() {
		if (Ac.return_s_x(hoele.isnowmail_x, "class").equals("infolist")) {
			Ac.click_x(hoele.notnowmail_x);
		}
	}

	/**
	 * 选择当前使用用户的加密邮箱
	 */
	public static void select_PostMailNb() {
		if (Ac.return_s_x(hoele.isnowmail_x, "class").contains("selected")) {
			Ac.click_x(hoele.notnowmail_x);
			log.info("成功选择使用：加密邮箱");
		} else {
			log.error("当前界面：未找到元素：" + hoele.isnowmail_x);
			Assert.fail("当前界面：未找到元素：" + hoele.isnowmail_x);
		}
	}

	/**
	 * 邮箱账号功能：点击；添加别名账号，保护手机隐私按钮
	 */
	public static void click_AdNotherNm() {
		if (assrt.isElementPresent(By.xpath(hoele.hidenub_x))) {
			Ac.click_x(hoele.hidenub_x);
			log.info("成功进入：添加别名账号界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.hidenub_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.hidenub_x);
		}

	}

	/**
	 * 邮箱账号功能：添加靓号账号，从此与众不同按钮
	 */
	public static void click_addGdNm() {
		if (assrt.isElementPresent(By.xpath(hoele.goodnub_x))) {
			Ac.click_x(hoele.goodnub_x);
			log.info("成功进入：添加靓号界面：");
		}
	}

	/**
	 * 邮箱账号功能：点击：账号管理按钮
	 */
	public static void click_acountCp() {
		if (assrt.isElementPresent(By.xpath(hoele.acount_x))) {
			Ac.click_x(hoele.acount_x);
			log.info("成功进入：账号管理界面");
		}
		{
			log.error("未找到元素：请查看是否存在元素：" + hoele.acount_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.acount_x);
		}

	}

	/**
	 * 邮箱账号功能：点击：修改密码按钮
	 */
	public static void click_updPwd() {
		if (assrt.isElementPresent(By.xpath(hoele.updatepwd_x))) {
			Ac.click_x(hoele.updatepwd_x);
			log.info("成功进入:修改密码界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.updatepwd_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.updatepwd_x);
		}
	}

	/**
	 * 邮箱账号功能：点击:更换手机号按钮
	 */
	public static void click_updMob() {
		if (assrt.isElementPresent(By.xpath(hoele.updatemobile_x))) {
			Ac.click_x(hoele.updatemobile_x);
			log.info("成功进入:修改手机号界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.updatemobile_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.updatemobile_x);
		}
	}

	/**
	 * 邮箱账号功能：积分：点击：积分数链接按钮
	 */
	public static void click_soreBn() {
		if (assrt.isElementPresent(By.xpath(hoele.score_x))) {
			Ac.click_x(hoele.score_x);
			log.info("成功进入:显示积分界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.score_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.score_x);
		}
	}

	/**
	 * 邮箱账号功能：积分：点击：兑换按钮
	 */
	public static void click_exchangeBn() {
		if (assrt.isElementPresent(By.xpath(hoele.exchange_x))) {
			Ac.click_x(hoele.exchange_x);
			log.info("成功进入:兑换界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.exchange_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.exchange_x);
		}
	}

	/**
	 * 邮箱账号功能：最近登录 ：点击 ：详情按钮
	 */

	public static void click_lginDtBn() {
		if (assrt.isElementPresent(By.xpath(hoele.logindetail_x))) {
			Ac.click_x(hoele.logindetail_x);
			log.info("成功进入:登录详情界面：");
		} else {
			log.error("未找到元素：请查看是否存在元素：" + hoele.logindetail_x);
			Assert.fail("未找到元素：请查看是否存在元素：" + hoele.logindetail_x);
		}
	}

	// 搜索界面功能
	/**
	 * 搜索：关键词输入框
	 */
	public static void input_key(String value) {
		Ac.clear_id(hoele.inputserch);
		Ac.input_id(hoele.inputserch, value);
	}

	/**
	 * 搜索：点击：语音输入功能按钮
	 */
	public static void click_voice() {
		Ac.click_x(hoele.voice_x);
	}

	/**
	 * 搜索: 点击：选择性下拉框按钮
	 */
	public static void click_Select() {
		Ac.click_x(hoele.search_select);
	}

	/**
	 * 搜素：选择性下拉框：关键词输入框
	 */
	public static void input_sleKey(String value) {
		Ac.clear_id(hoele.keyword_input);
		Ac.input_id(hoele.keyword_input, value);
	}

	/**
	 * 搜素：选择性下拉框：发件人输入框
	 */
	public static void input_sender(String value) {
		Ac.clear_id(hoele.sender_input);
		Ac.input_id(hoele.sender_input, value);
	}

	/**
	 * 搜素：选择性下拉框：收件人输入框
	 */
	public static void input_recPents(String value) {
		Ac.clear_id(hoele.recipients_input);
		Ac.input_id(hoele.recipients_input, value);
	}

	/**
	 * 搜素：选择性下拉框：时间范围选下拉框
	 */
	public static void select_timeBtn() {
		Ac.click_x(hoele.select_time_x);
	}

	/**
	 * 搜素：选择性下拉框：时间范围选下拉框：所有选择元素 不限 :Unlimited_x 三天内 :threeday_x 一周内 :aweek_x
	 * 一月内 :amonth_x 一年内 :ayear_x 自定义 :costom_x 开始时间：input_starttime
	 * 结束时间：input_endtime
	 * 
	 */
	public static void select_time(String select) {
		Ac.click_x(select);
	}

	/**
	 * 搜素：选择性下拉框：时间范围：自定义：输入开始时间
	 * 
	 * @param value：start
	 *            time
	 */
	public static void input_startTime(String value) {
		Ac.clear_id(hoele.input_starttime);
		Ac.input_id(hoele.input_starttime, value);
	}

	/**
	 * 搜素：选择性下拉框：时间范围：自定义：输入结束时间
	 * 
	 * @param value：end
	 *            time
	 */
	public static void input_endTime(String value) {
		Ac.clear_id(hoele.input_endtime);
		Ac.input_id(hoele.input_endtime, value);

	}

	/**
	 * 搜素：选择性下拉框：文件夹：下拉框按钮：
	 */
	public static void select_folder() {
		Ac.click_x(hoele.foder_x);
	}

	/**
	 * 搜素：选择性下拉框：文件夹：下拉框：所以选择元素:hoele. 全部文件夹：allfoder_x 收件箱：inbox_x 草稿箱：drafts_x
	 * 已发送：sended_x 已删除：deleted_x 垃圾邮件：spam_x
	 */
	public static void select_folderTpye(String type) {
		Ac.click_x(type);
	}

	/**
	 * 搜素：选择性下拉框：文件夹：是否选择只搜索以发送按钮 选择 onlyserach
	 * 选择：以发送
	 */
	public static void select_IsOS() {

		if (Ac.return_s_x(hoele.noselect_onlysearch_x, "class").equals("i-chooseMo")) {
			Ac.click_id(hoele.onlysearch);
		}
	}

	/**
	 * 搜素：选择性下拉框：文件夹：是否选择只搜索以发送按钮 选择 onlyserach
	 * 不选择：以发送
	 */
	public static void select_noOS() {
		if (Ac.return_s_x(hoele.select_onlysearch_x, "class").equals("i-chooseMo i-chooseYet")) {
			Ac.click_id(hoele.onlysearch);
		}
	}
	/**
	 * 搜素：选择性下拉框：附件：点击下拉框按钮：
	 */
	public static void click_attchBtn() {
		Ac.click_x(hoele.attch_select_x);
	}
	
	/**
	 * 搜素：选择性下拉框：附近：下拉框：所有元素
	 * 不限:attch_Unlimited
	 * 包含:attch_Contain
	 * 不包含:attch_NotContain
	 */
	public static void select_attchType(String type	) {
		Ac.click_i(type);
	}
	/**
	 * 搜素：选择性下拉框：点击确定按钮
	 *
	*/
	public static void click_cent() {
		Ac.click_x(hoele.btnsure_x);
	}
	/**
	 * 搜素：选择性下拉框：点击取消按钮
	 *
	*/
	public static void click_cancel() {
		Ac.click_x(hoele.btncancle_x);
	}
	
	/**
	 * 搜素：点击搜索按钮
	 */
	public static void click_searBtn() {
		Ac.click_i(hoele.searchbtn);
	}
	
	//主页左侧个人信息
	
	/**
	 * 点击：头像按钮
	 * 
	 */
	public static void click_headimge() {
		Ac.click_i(hoele.userheadsrc);
	}
	/**
	 * 手机号：进入设置界面
	 */
	public static void click_mob() {
		Ac.click_i(hoele.mobilesetting);
	}
	/**
	 * 个人签名：
	 * 分享：
	 */
	public static void click_retting() {
		Ac.click_i(hoele.gretting);
	}
	/**
	 * 个人签名：
	 * 点击分享：微博
	 * 进入微博登录界面
	 */
	public static void click_shareWb() {
		Ac.click_i(hoele.webo);
	}
	
	/**
	 * 个人签名：
	 * 点击分享：告诉朋友
	 * 进入邮箱界面
	 */
	public static void click_shareFd() {
		Ac.click_i(hoele.tellfriend);
	}
	/**
	 * 我的积分
	 */
	public static void click_mysc() {
		Ac.click_x(hoele.myscore_x);
	}
	/**
	 * 兑换 按钮
	 */
	public static void click_scChang() {
		Ac.click_i(hoele.scoreexchange);
	}
	/**
	 * 花费余额：查询按钮
	 */
	public static void click_ChQy() {
		Ac.click_i(hoele.query);
	}
	/**
	 * 花费余额：充值按钮
	 */
	public static void click_CgDt() {
		Ac.click_i(hoele.changedatail);
	}
	
	/**
	 * 签到赚积分按钮
	 */
	public static void click_sdSc() {
		Ac.click_i(hoele.sendscore);
	}
	
	//功能按钮
		/**
		 * 收件箱 按钮
		 */
	public static void click_ibBtn() {
		Ac.click_x(hoele.inboxbtn_x);
	}
	/**
	 * 写信 按钮
	 */
	public static void click_wriBtn() {
       Ac.click_x(hoele.writecompose_x);
	}
	/**
	 * 发短信 按钮
	 */
	public static void click_sdStMg() {
	Ac.click_x(hoele.sendshortmessage_x);
	}
	/**
	 * 上海移动 按钮
	 */
	public static void click_SHMBtn() {
		Ac.click_x(hoele.SHmovement_x);
	}
	/**
	 * 和飞信 按钮
	 */
	public static void click_Fetion() {
		Ac.click_x(hoele.fetion_x);
	}
	/**
	 * 和彩云 按钮
	 */
	public static void click_HCc() {
		Ac.click_x(hoele.hecolorcloude_x);
	}
	/**
	 * 和笔记 按钮
	 */
	public static void click_HNt() {
		Ac.click_x(hoele.henote_x);
	}
	/**
	 * 和通讯录 按钮
	 */
	public static void click_Had() {
		Ac.click_x(hoele.headdr_x);
	}
	
	
	//服务推荐：
	/**
	 * 精品业务 按钮
	 */
	public static void click_boutiq() {
		Ac.click_x(hoele.boutique_x);
	}
	/**
	 * 应用商城按钮
	 */
	public static void click_shoping() {
		Ac.click_x(hoele.shoping_x);
	}
	//主页面中部
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

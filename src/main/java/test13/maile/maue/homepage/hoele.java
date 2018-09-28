package test13.maile.maue.homepage;

public class hoele {
	//左上侧提示音功能
	/**
	 * 点击铃铛提示音 按钮
	 */
	public static String mailcontacts_x= ".//*[@id='mailNotifyIcon']/a/i";
	/**
	 * 铃铛提示音:短信提示音 开关按钮
	 */
	public static String close_closingbtn_x = "//label[@class='closingbtn']";
	public static String open_closingbtn_x = "//label[@class='closingbtn openingbtn']";
	public static String closingbtn_x = "//label[@id='lbl_enable']";
	public static String singbtn = "lbl_enable";
	/**
	 * 铃铛提示音:短信提示音 开启：功能元素
	 */
	//
	public static String vip_x = ".//*[@id='allowed-list']/li/div[text()='VIP']";
	public static String contacts_x= ".//*[@id='allowed-list']/li/div[text()='联系人']";
	public static String stranger_x = ".//*[@id='allowed-list']/li/div[text()='陌生人']";
	public static String collection_x = ".//*[@id='allowed-list']/li/div[text()='代收']";
	public static String subscribe_x = ".//*[@id='allowed-list']/li/div[text()='订阅']";
	public static String bill_x = ".//*[@id='allowed-list']/li/div[text()='账单']";
	public static String service_x = ".//*[@id='allowed-list']/li/div[text()='服务']";
	public static String trends_x = ".//*[@id='allowed-list']/li/div[text()='动态']";
	public static String spread_x = ".//*[@id='allowed-list']/li/div[text()='推广']";
	public static String invoice_x = ".//*[@id='allowed-list']/li/div[text()='发票']";
	
	
	
	/**
	 * 铃铛提示音:勿扰模式 开关按钮
	 */
	public static String nodisturb = "lbl_nodisturbEnable";
	public static String nodisturb_x = "//label[@class='closingbtn']";
	public static String close_nodisturb_x = "//label[@class='closingbtn']";
	public static String open_nodisturb_x = "//label[@class='closingbtn openingbtn']";
	
	/**
	 * 铃铛提示音:勿扰时间：勿扰模式 开启选择按钮
	 */
	public static String disturbtype_select_x = ".//*[@id='nodisturbType']/a/i";
	
	/**
	 * 铃铛提示音:勿扰时间：勿扰模式 开启选择：当天勿扰按钮
	 */
	public static String disturbtype_today_x = ".//*[@id='nodisturbTypeMenu']/div/div/div/div/ul/li/a[text()='当天勿扰']";
	
	
	/**
	 * 铃铛提示音:勿扰时间：勿扰模式 开启选择：每天12：00至14：00勿扰
	 */
	public static String disturbtype_two_x = ".//*[@id='nodisturbTypeMenu']/div/div/div/div/ul/li/a[text()='每天 12:00 到 14:00 勿扰']";
	
	/**
	 * 铃铛提示音:勿扰时间：是否允许vip联系人短信提醒 开启选择提醒按钮
	 */
	public static String disturbvip_select_x = ".//*[@id='nodisturbVip']/a/i[text()='短信提醒']";
	
	/**
	 * 铃铛提示音:vip联系人提醒：勿扰模式 开启选择：不允许
	 */
	public static String disturbvip_yes_x = ".//*[@id='nodisturbVipMenu']/div/div/div/div/ul/li/a[text()='允许']";
	/**
	 * 铃铛提示音:vip联系人提醒：勿扰模式 开启选择：允许
	 */
	public static String disturbvip_no_x = ".//*[@id='nodisturbVipMenu']/div/div/div/div/ul/li/a[text()='不允许']";
	/**
	 * 铃铛提示音:详细设置 按钮
	 */
	public static String detailsetting_x = ".//*[@id='toDetailed']/span[text()='详细设置']";
	/**
	 * 铃铛提示音:关闭提示音按钮
	 */
	public static String close_contacts_x = ".//*[@id='hideNotifyTip']/span[text()='关闭']";
	
	//邮箱账号功能
	/**
	 * 点击邮箱账号右侧下拉框按钮
	 */
	public static String mailnuber_x = ".//*[@id='accountSet']/a/i[2]";
	
	/**
	 * 邮箱账号功能：添加头像 按钮
	 */
	public static String addheadsrc_x = ".//*[@id='accountInfo']/div/div[1]/div[1]/span/a[text()='添加头像']";
	/**
	 * 设置头像界面为公共部分
	 */
	
	
	
	/**
	 * 邮箱账号功能：点击设置发信账号 ：所有元素
	 */
	public static String mabile_x = "//span[text()='150****5819@139.com']";
	public static String postpass_x = "//span[text()='877731476@139.com']";
	/**
	 * 判断是否选择当前手机号码的邮箱:class 是否包含 selected
	 */
	public static String isnowmail_x = ".//div[@class='infos']/p[2]";
	/**
	 * 选择非当前使用的邮件号码
	 */
	public static String notnowmail_x = ".//p[@class='infolist'][1]/a/span[1]";
	/**
	 * 邮箱账号功能：添加别名账号，保护手机隐私按钮
	 */
	public static String hidenub_x = "//a[text()='添加别名帐号，保护手机隐私']";
	/**
	 * 邮箱账号功能：添加靓号账号，从此与众不同按钮
	 */
	public static String goodnub_x = "//span[text()='靓号帐号']";
	
	/**
	 * 邮箱账号功能：账号管理按钮
	 */
	public static String acount_x = "//a[text()='帐号管理']";
	
	/**
	 * 邮箱账号功能：修改密码按钮
	 */
	public static String updatepwd_x = "//a[text()='修改密码']";
	/**
	 * 邮箱账号功能：更换手机号按钮
	 */
	public static String updatemobile_x ="//a[text()='更换手机号']";
	
	/**
	 * 邮箱账号功能：积分：分数链接按钮
	 */
	public static String score_x = "//p[text()='积分：']/a[1]";
	/**
	 * 邮箱账号功能：积分：兑换按钮
	 */
	public static String exchange_x = "//a[text()='兑换']";
	/**
	 * 邮箱账号功能：最近登录 ：详情按钮
	 */
	public static String logindetail_x = ".//*[@id='accountInfo']/div/div/p/a[text()='详情']";
	
	//搜索界面功能
	/**
	 * 搜索关键词输入框
	 * 
	 */
	public static String inputserch = "tb_mailSearch";
	/**
	 * 搜素：语音输入功能按钮
	 */
	public static String voice_x = ".//*[@id='btn_foiceSearch']/i";
	/**
	 * 搜素：选择性下拉框按钮
	 */
	public static String search_select = "searchIcon";
	/**
	 * 搜素：选择性下拉框：关键词输入框
	 */
	public static String keyword_input = "tb_keyWords";
	/**
	 * 搜素：选择性下拉框：发件人输入框
	 */
	public static String sender_input = "tb_from";
	/**
	 * 搜素：选择性下拉框：收件人输入框
	 */
	public static String recipients_input = "tb_to";
	/**
	 * 搜素：选择性下拉框：时间范围选下拉框
	 */
	public static String select_time_x = "//div[@id='select_time']/div/div/i";
	/**
	 * 搜素：选择性下拉框：时间范围选下拉框：所有选择元素
	 */
	public static String Unlimited_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='不限']";
	public static String threeday_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='三天内']";
	public static String aweek_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='一周内']";
	public static String amonth_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='一月内']";
	public static String ayear_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='一年内']";
	
	public static String costom_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='自定义']";
	public static String input_starttime = "start";
	public static String input_endtime = "end";
	
	
	
	/**
	 * 搜素：选择性下拉框：文件夹：下拉框按钮：
	 */
	public static String foder_x = ".//*[@id='select_folder']/div/div/i";
	
	/**
	 * 搜素：选择性下拉框：文件夹：下拉框：所以选择元素
	 */
	public static String allfoder_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='全部文件夹']";
	public static String inbox_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='收件箱']";
	public static String drafts_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='草稿箱']";
	public static String sended_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='已发送']";
	public static String deleted_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='已删除']";
	public static String spam_x = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='垃圾邮件']";
	
	/**
	 * 搜素：选择性下拉框：文件夹：是否选择只搜索以发送按钮
	 */
	
	public static String onlysearch = "onlySearchSended";
	
	public static String select_onlysearch_x = "//span[@class='i-chooseMo i-chooseYet']";
	
	public static String noselect_onlysearch_x = "//span[@class='i-chooseMo']";
	/**
	 * 搜素：选择性下拉框：附件：下拉框按钮：
	 */
	public static String attch_select_x = "//div[@id='select_attach']/div/div/i";
	
	/**
	 * 搜素：选择性下拉框：附近：下拉框：所有元素
	 */
	public static String attch_Unlimited = ".//*[@class='menuPop shadow ']/ul/li/a/span[text()='不限']";
	
	public static String attch_Contain =".//*[@class='menuPop shadow ']/ul/li/a/span[text()='包含']";
	
	public static String attch_NotContain =".//*[@class='menuPop shadow ']/ul/li/a/span[text()='不包含']";
	/**
	 * 搜素：选择性下拉框：确定按钮
	 */
	public static String btnsure_x = ".//*[@id='btn_search']/span[text()='确定']";
	/**
	 * 搜素：选择性下拉框：取消按钮
	 */
	public static String btncancle_x = ".//*[@id='btn_cancel']/span[text()='取消']";
	/**
	 * 搜素：搜索按钮
	 */
	
	public static String searchbtn = "searchBtnIcon";
	
	
	
	//主页左侧个人信息
	/**
	 * 头像按钮
	 * 
	 */
	public static String userheadsrc = "userImg";
	/**
	 * 手机号：进入设置界面
	 */
	public static String mobilesetting = "userName";
	/**
	 * 个人签名：
	 */
	public static String gretting = "greeting";
	
	public static String webo = "sinaShare";
	
	public static String tellfriend = "mailShare";
	/**
	 * 我的积分
	 */
	public static String myscore_x = "myintegral";
	/**
	 * 兑换 按钮
	 */
	public static String scoreexchange = "scoreExchange";
	/**
	 * 花费余额：查询按钮
	 */
	public static String query = "chargeQuery";
	/**
	 * 花费余额：充值按钮
	 */
	public static String changedatail = "chargeDetail";
	/**
	 * 签到赚积分按钮
	 */
	public static String sendscore = "btn_signin";
	
	//功能按钮
	/**
	 * 收件箱 按钮
	 */
	public static String inboxbtn_x = ".//*[@id='navigate']/div/ul/li/a/span[text()='收件箱']";
	
	/**
	 * 写信 按钮
	 */
	public static String writecompose_x = ".//*[@id='compose_new']/a/span[text()='写信']";
	/**
	 * 发短信 按钮
	 */
	public static String sendshortmessage_x = ".//*[@id='smsSend']/span";
	/**
	 * 上海移动 按钮
	 */
	public static String SHmovement_x = ".//*[@id='oneStopmail']/span";
	/**
	 * 和飞信 按钮
	 */
	public static String fetion_x = ".//*[@id='fetion']/span";
	/**
	 * 和彩云 按钮
	 */
	public static String hecolorcloude_x = ".//*[@id='mcloud']/span";
	/**
	 * 和笔记 按钮
	 */
	public static String henote_x = ".//*[@id='note']/span";
	/**
	 * 和通讯录 按钮
	 */
	public static String headdr_x = ".//*[@id='addr']/span";
	/**
	 * 服务推荐：模块：
	 
	 */
//	public static String servicegroom_x = "";
	/**
	 * 精品业务 按钮
	 */
	public static String boutique_x = ".//a[text()='精品业务']";
	/**
	 * 应用商城按钮
	 */
	public static String shoping_x = ".//a[text()='应用商城']";
	
	/**
	 * 有福定制 ：使用 按钮
	 */
//	public static String usebtn_x = "//div[text()='使用']";
	
	
	
	//主页面中部
	
	/**
	 * @TA,直接写邮件 输入框
	 */
	public static String input_writemail_x = ".//textarea[text()='@TA，直接写邮件']";
	/**
	 * 发送按钮
	 */
	public static String sendmailbtn = "sendEmailBtn";
	/**
	 * 未读的邮件和消息 按钮
	 */
	public static String notreadmessage_x = "//*[@id='list_header']/span";
	/**
	 * 邮动态 按钮
	 */
	public static String emailshow_x = ".//*[@id='mailState']/i[1]";
	/**
	 * 邮动态："未读的邮件和消息"没有任何内容
	 */
	
	
	/**
	 * 邮动态：添加待办事项按钮，进入同页面日历
	 */
	public static String add_cander_x = "//a[text()='添加待办事项']";
	/**
	 * 全部标记为已读 按钮
	 */
	public static String readall_x = "//a[text()='全部标为已读']";
	/**
	 * 全部标记为已读后：设置 按钮
	 */
	public static String readallsetting_x = ".//*[@id='currDayTitle']/div/i";
	/**
	 * 设置：包含关键字按钮
	 */
	public static String containkey_x = "//*[@id='related_setting']/div/ul/li[text()='包含关键字']";
	/**
	 * 公共的按钮：设置：包含关键字按钮：开关
	 */
//	public static String settingbut = "notify_enable";
//	public static String closesetsetbut_x = "//label[@class='closingbtn']";
//	public static String opensetsetbut = "//label[@class='closingbtn openingbtn']";
	/**
	 * 设置：添加关键字输入框
	 */
	public static String inputkeyword = "tb_keyword";
	/**
	 * 设置：添加关键字输入框：添加按钮
	 */
	public static String addkeybtn = "tb_addKey";
	/**
	 * 设置：添加关键字输入框：取消按钮
	 * keycancel.gettxt
	 */
	public static String keycancel = ".//*[@id='keyword_list']/li[1]/span";
	
	/**
	 * 设置：vip联系人 按钮
	 */
	public static String viptouch = "//*[@id='related_setting']/div/ul/li[text()='VIP联系人']";
	/**
	 * 设置：vip联系人：开关按钮
	 */
//	public static String setbut = "notify_enable";
//	public static String closesetbut_x = "//label[@class='closingbtn']";
//	public static String opensetbut = "//label[@class='closingbtn openingbtn']";
	/**
	 * 设置：vip联系人：添加vip联系人
	 */
	public static String addviptouch_x = "//span[text()='添加VIP联系人']";
	/**
	 * 设置：只发给我 按钮
	 */
	public static String onlysendme_x = "//*[@id='related_setting']/div/ul/li[text()='只发给我']";
	/**
	 * 设置：只发给我 ：开关按钮
	 */
	
	/**
	 * 设置：@我的 按钮
	 */
	public static String atme_x = "//*[@id='related_setting']/div/ul/li[text()='@我的']";
	/**
	 * 设置：@我的  开关按钮
	 */
	
	/**
	 * 设置：我的标签按钮
	 */
	public static String mynote_x = "//*[@id='related_setting']/div/ul/li[text()='我的标签']";
	/**
	 * 设置：我的标签 开关按钮
	 */
	
	/**
	 * 设置：文件夹管理按钮
	 */
	public static String foldercompan_x = "//*[@id='related_setting']/div/ul/li[text()='文件夹管理']";
	/**
	 * 设置：垃圾邮箱 开关按钮
	 */
	
	/**
	 * 关闭 设置界面 按钮
	 */
	public static String closesetting_x = ".//*[@id='related_setting']/div/i";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

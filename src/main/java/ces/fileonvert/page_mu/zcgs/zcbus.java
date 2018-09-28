package ces.fileonvert.page_mu.zcgs;

import com.sun.jna.platform.win32.WinNT.ACCESS_ACEStructure;

import ces.fileonvert.page_mu.Ac;
import ces.fileonvert.page_mu.asert;
import ces.fileonvert.page_mu.pub.pubus;

public class zcbus {

	/**
	 * 支持格式的业务逻辑1:点击开关按钮
	 */
	/**
	 * 点击开启文档转换pdf按钮
	 */
	public static void click_tp() {
		Ac.click_id(zceles.wdp);
	}

	/**
	 * 点击开启图像转换pdf按钮
	 */
	public static void click_imp() {
		Ac.click_id(zceles.txp);
	}

	/**
	 * 点击开启图形转换pdf按钮
	 */
	public static void click_imap() {
		Ac.click_id(zceles.txxp);
	}

	/**
	 * 点击开启图像转换jpg按钮
	 */
	public static void click_txj() {
		Ac.click_id(zceles.txj);
	}

	/**
	 * 点击开启视频转换flv按钮
	 */
	public static void click_spf() {
		Ac.click_id(zceles.spf);
	}

	/**
	 * 点击视频转换mp4按钮
	 */
	public static void click_spm() {
		Ac.click_id(zceles.spm);
	}

	/**
	 * 点击开启音频转换mp3按钮
	 */
	public static void click_ypm() {
		Ac.click_id(zceles.ypm);
	}

	/**
	 * 点击pdf转换tif按钮
	 */
	public static void click_pdt() {
		Ac.click_id(zceles.pdt);
	}

	/**
	 * 点击图形转换tif按钮
	 * 
	 */
	public static void click_txt() {
		Ac.click_id(zceles.txt);
//		Ac.click_xpath("//*[@id='imageswitchtoTif']");
	}

	/**
	 * 点击文档转换ofd按钮
	 */
	public static void click_to() {
		Ac.click_id(zceles.wdo);
	}

	/**
	 * 点击图像转换ofd按钮
	 */
	public static void click_txo() {
		Ac.click_id(zceles.txo);
	}

	/**
	 * 业务逻辑2：全选所有支持的格式
	 */
	/**
	 * 点击全选按钮：文档转换pdf
	 */
	public static void click_qwp() {
		Ac.click_xpath(zceles.qwp_x);
	}

	/**
	 * 点击全选按钮：图像转换pdf
	 */
	public static void click_qtxp() {
		Ac.click_xpath(zceles.qtxp_x);
	}

	/**
	 * 点击全选按钮：图形转换pdf
	 */
	public static void click_qtxxp() {
		Ac.click_xpath(zceles.qtxxp_x);
	}

	/**
	 * 点击全选按钮：图像转换jpg
	 */
	public static void click_qtxj() {
		Ac.click_xpath(zceles.qtxj_x);
	}

	/**
	 * 点击全选按钮：视频转换flv
	 */
	public static void click_qspf() {
		Ac.click_xpath(zceles.qsf_x);
	}

	/**
	 * 点击全选按钮：视频转换mp4
	 */
	public static void click_qspm() {
		Ac.click_xpath(zceles.qsm_x);
	}

	/**
	 * 点击全选按钮：音频转换mp3
	 */
	public static void click_qypm() {
		Ac.click_xpath(zceles.qym_x);
	}

	/**
	 * 点击全选按钮：pdf转换tif
	 */
	public static void click_qpdt() {
		Ac.click_xpath(zceles.qpt_x);
	}

	/**
	 * 点击全选按钮：图像转换tif
	 */
	public static void click_qtxt() {
		Ac.click_xpath(zceles.qtt_x);
	}

	/**
	 * 点击全选按钮：文档转换ofd
	 */
	public static void click_qwdo() {
		Ac.click_xpath(zceles.qwo_x);
	}

	/**
	 * 点击全选按钮：图像转换ofd
	 */
	public static void click_qtxo() {
		Ac.click_xpath(zceles.qto_x);
	}

	/**
	 * 判断按钮是否开启或者关闭
	 */

	/**
	 * 如果文档转换pdf开启，则关闭
	 */
	public static void offwd() {
		String a = Ac.return_s_i(zceles.wdp, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_tp();
			System.out.println("文档转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("文档转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果文档转换pdf关闭，则开启
	 */
	public static void opentf() {
		String a = Ac.return_s_i(zceles.wdp, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_tp();
			System.out.println("文档转换pdf 按钮已经：点击开启");
		} else {
			System.out.println("文档转换pdf 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换pdf开启，则关闭
	 */
	public static void offtx() {
		String a = Ac.return_s_i(zceles.txp, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_imp();
			System.out.println("图像转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换pdf关闭，则开启
	 */
	public static void opentx() {
		String a = Ac.return_s_i(zceles.txp, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_imp();
			System.out.println("图像转换pdf 按钮已经：点击开启");
		} else {
			System.out.println("图像转换pdf 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图形转换pdf开启，则关闭
	 */
	public static void offtxx() {
		String a = Ac.return_s_i(zceles.txp, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_imap();
			System.out.println("图形转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("图形转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图形转换pdf关闭，则开启
	 */
	public static void opentxx() {
		String a = Ac.return_s_i(zceles.txp, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_imap();
			System.out.println("图形转换pdf 按钮已经：点击开启");
		} else {
			System.out.println("图形转换pdf 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换jpg开启，则关闭
	 */
	public static void offtj() {
		String a = Ac.return_s_i(zceles.txj, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_txj();
			System.out.println("图像转换jpg 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换jpg 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换jpg关闭，则开启
	 */
	public static void opentj() {
		String a = Ac.return_s_i(zceles.txj, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_txj();
			System.out.println("图像转换jpg 按钮已经：点击开启");
		} else {
			System.out.println("图像转换jpg 按钮已经：默认开启");
		}
	}

	/**
	 * 如果视频转换flv开启，则关闭
	 */
	public static void offspf() {
		String a = Ac.return_s_i(zceles.spf, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_spf();
			System.out.println("视频转换flv 按钮已经：点击关闭");
		} else {
			System.out.println("视频转换flv 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果视频转换flv关闭，则开启
	 */
	public static void openspf() {
		String a = Ac.return_s_i(zceles.spf, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_spf();
			System.out.println("视频转换flv 按钮已经：点击开启");
		} else {
			System.out.println("视频转换flv 按钮已经：默认开启");
		}
	}

	/**
	 * 如果视频转换mp4开启，则关闭
	 */
	public static void offspm() {
		String a = Ac.return_s_i(zceles.spm, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_spm();
			System.out.println("视频转换mp4 按钮已经：点击关闭");
		} else {
			System.out.println("视频转换mp4 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果视频转换mp4关闭，则开启
	 */
	public static void openspm() {
		String a = Ac.return_s_i(zceles.spm, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_spm();
			System.out.println("视频转换mp4 按钮已经：点击开启");
		} else {
			System.out.println("视频转换mp4 按钮已经：默认开启");
		}
	}

	/**
	 * 如果音频转换mp3开启，则关闭
	 */
	public static void offypm() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_ypm();
			System.out.println("音频转换mp3 按钮已经：点击关闭");
		} else {
			System.out.println("音频转换mp3 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果音频转换mp3关闭，则开启
	 */
	public static void openypm() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_ypm();
			System.out.println("音频转换mp3 按钮已经：点击开启");
		} else {
			System.out.println("音频转换mp3 按钮已经：默认开启");
		}
	}

	/**
	 * 如果PDF转换TIF开启，则关闭
	 */
	public static void offPT() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_pdt();
			System.out.println("PDF转换TIF 按钮已经：点击关闭");
		} else {
			System.out.println("PDF转换TIF 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果PDF转换TIF关闭，则开启
	 */
	public static void openPT() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_pdt();
			System.out.println("PDF转换TIF 按钮已经：点击开启");
		} else {
			System.out.println("PDF转换TIF 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换TIF开启，则关闭
	 */
	public static void offTT() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_txt();
			System.out.println("图像转换TIF 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换TIF 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换TIF关闭，则开启
	 */
	public static void openTT() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_txt();
			System.out.println("图像转换TIF 按钮已经：点击开启");
		} else {
			System.out.println("图像转换TIF 按钮已经：默认开启");
		}
	}

	/**
	 * 如果文档转换OFD开启，则关闭
	 */
	public static void offWO() {
		String a = Ac.return_s_i(zceles.wdo, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_to();
			System.out.println("文档转换OFD 按钮已经：点击关闭");
		} else {
			System.out.println("文档转换OFD 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果文档转换OFD关闭，则开启
	 */
	public static void openWO() {
		String a = Ac.return_s_i(zceles.wdo, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_to();
			System.out.println("文档转换OFD 按钮已经：点击开启");
		} else {
			System.out.println("文档转换OFD 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换OFD开启，则关闭
	 */
	public static void offTO() {
		String a = Ac.return_s_i(zceles.txo, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_txo();
			System.out.println("图像转换OFD 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换OFD 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换OFD关闭，则开启
	 */
	public static void openTO() {
		String a = Ac.return_s_i(zceles.txo, "value");
		System.out.println(a);
		if (a.contains("0")) {
			zcbus.click_txo();
			System.out.println("图像转换OFD 按钮已经：点击开启");
		} else {
			System.out.println("图像转换OFD 按钮已经：默认开启");
		}
	}

	/**
	 * boolean 类型进行 判断是否开启按钮
	 * 
	 * @return 0为关闭，1开启
	 */
	public static boolean wd() {
		// 默认开启
		// zcbus.offwd();
		String a = Ac.return_s_i(zceles.wdp, "value");
		// System.out.println(a);
		if (a.contains("0")) {
			System.out.println("图像转换pdf 按钮已经关闭：");
			return true;
		} else {
			System.out.println("图像转换pdf 按钮已经开启：");
			return false;
		}
	}

	/**
	 * 判斷是否允許全部概關閉按鈕
	 */
	public static void offbut() {
		String a = Ac.return_text_xpath(zceles.offbut);
		if (a.contains("至少设置一个格式")) {
			// 點擊保存按鈕
			pubus.click_s();
//			// 判斷是否保存成功
//			asert.save_issueces();
//			// 點擊下一步
//			pubus.click_butnex();
		}
	}

}

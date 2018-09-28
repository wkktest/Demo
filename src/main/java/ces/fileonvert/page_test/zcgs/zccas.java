package ces.fileonvert.page_test.zcgs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.sun.jna.platform.win32.WinNT.ACCESS_ACEStructure;

import Demo.Base.base;
import ces.fileonvert.page_mu.Ac;
import ces.fileonvert.page_mu.asert;
import ces.fileonvert.page_mu.pub.pubele;
import ces.fileonvert.page_mu.pub.pubus;
import ces.fileonvert.page_mu.zcgs.zcbus;
import ces.fileonvert.page_mu.zcgs.zceles;
import ces.fileonvert.page_mu.zjm.mubus;

public class zccas extends base {

	/**
	 * test case
	 */
	/**
	 * 全部开启按钮
	 * 
	 * @throws InterruptedException
	 */
	public static void case1() throws InterruptedException {
		zccas.openwdf();
		Thread.sleep(1000);
		zccas.opentf();
		Thread.sleep(1000);
		zccas.opentxxf();
		// Thread.sleep(1000);
		zccas.opentxj();
		Thread.sleep(1000);
		zccas.openspf();
		Thread.sleep(1000);
		zccas.openspm();
		Thread.sleep(1000);
		zccas.openypm();
		Thread.sleep(1000);
		zccas.openpdt();
		Thread.sleep(1000);
		zccas.opentxt();
		Thread.sleep(1000);
		zccas.openwdo();
		Thread.sleep(1000);
		zccas.opentxo();
		Thread.sleep(1000);
		// 点击保存按钮
		pubus.click_s();
		// 判断是否保存成功
		asert.save_issueces();
		Thread.sleep(1000);
		// 点击下一步按钮
		pubus.click_butnex();
		// Thread.sleep(5000);
	}

	/**
	 * 驗證：是否可以全部關閉按鈕，是否提示：至少開啓一個
	 * 
	 * @throws InterruptedException
	 */
	public static void case2() throws InterruptedException {
		// zccas.offwdp();
		// Thread.sleep(1000);
		// zccas.offtf();
		// Thread.sleep(1000);
		// zccas.offtxxf();
		// Thread.sleep(1000);
		// zccas.offtxj();
		// Thread.sleep(1000);
		// zccas.offspf();
		// Thread.sleep(1000);
		// zccas.offspm();
		// Thread.sleep(1000);
		// zccas.offypm();
		
//		Thread.sleep(2000);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		WebElement s = driver.findElement(By.cssSelector("#image2pdfDiv"));
//		System.out.println("++++++++++++++++++:::" + s.getText());
//		
//		WebElement sss = driver.findElement(By.xpath("//div[@class='thumb' and contains(@style,'top: 0px;')]"));
//		System.out.println(sss.getText());
//	
//		WebElement a = driver.findElement(By.xpath("//div[@class='thumb' and contains(@style,'top: 430px;')]"));
//		System.out.println(a);
//
//		Actions ac = new Actions(driver);
//		ac.dragAndDrop(sss, a);
//	
//		System.out.println("---------------------------------------------------- ");

		
		
		
		
		Thread.sleep(5000);
		zccas.offpdt();
		Thread.sleep(2000);
		zccas.offtxt();
		Thread.sleep(1000);
		zccas.offwdo();
		Thread.sleep(1000);
		zccas.offtxo();
		Thread.sleep(1000);
		zcbus.offbut();
		Thread.sleep(2000);
		// 判斷是否保存成功
		asert.save_issueces();
		Ac.wait_until(5, pubele.saveshow_x);
		// 點擊下一步
		pubus.click_butnex();

	}

	/**
	 * 測試开启 文档转换ofd按钮
	 * 
	 * @throws InterruptedException
	 */
	public static void case3() throws InterruptedException {
		Thread.sleep(1000);
		// 点击配置中心按钮，进入配置中心设置界面：
		mubus.click_pz();
		// 点击支持格式按钮，进入支持格式配置界面：
		mubus.click_zcgs();
		// 直接判断是否开启按钮：文档转换pdf
		zccas.openwdf();
		// // boolean 类型判断是否开启按钮
		// cas.offwd1();
		// 点击保存按钮
		pubus.click_s();
		Thread.sleep(1000);
		// 验证提示：
		pubus.issav();
	}

	/**
	 * 开启 ，关闭 支持格式 按钮的 业务操作：
	 */
	/**
	 * 如果文档转换pdf关闭，则开启
	 */
	public static void offwd1() {
		// 判断v v为true ：关闭；false：开启；
		boolean v = zcbus.wd();
		if (v) {
			// 点击 文档转换pdf 按钮
			zcbus.click_tp();
		}
	}

	/**
	 * 如果文档转换pdf开启，则关闭
	 */
	public static void offwdp() {
		String a = Ac.return_s_i(zceles.wdp, "value");
		System.out.println(a);
		// 1为 开启按钮
		if (a.contains("1")) {
			zcbus.click_tp();
			System.out.println("文档转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("文档转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换pdf开启，则关闭
	 */
	public static void offtf() {
		String s = Ac.return_s_i(zceles.txp, "value");
		if (s.contains("1")) {
			zcbus.click_imp();
			System.out.println("图形转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("图形转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图形转换pdf开启，则关闭
	 */
	public static void offtxxf() {
		String s = Ac.return_s_i(zceles.txxp, "value");
		System.out.println(s);
		if (s.contains("1")) {
			zcbus.click_imap();
			System.out.println("图形转换pdf 按钮已经：点击关闭");
		} else {
			System.out.println("图形转换pdf 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换JPG开启，则关闭
	 */
	public static void offtxj() {
		String a = Ac.return_s_i(zceles.txj, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_txj();
			System.out.println("图像转换JPG 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换JPG 按钮已经：默认关闭");
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
	 * 如果视频转换mp4开启，则关闭
	 */
	public static void offspm() {
		String a = Ac.return_s_i(zceles.spm, "value");
		System.out.println("mmmmmmm" + a);
		if (a.contains("1")) {
			zcbus.click_spm();
			System.out.println("视频转换mp4 按钮已经：点击关闭");
		} else {
			System.out.println("视频转换mp4 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果音频转换mp3开启，则关闭
	 */
	public static void offypm() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		System.out.println("yyyyyy" + a);
		if (a.contains("1")) {
			zcbus.click_ypm();
			System.out.println("音频转换mp3 按钮已经：点击关闭");
		} else {
			System.out.println("音频转换mp3 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果pdf转换tif开启，则关闭
	 */
	public static void offpdt() {
		String a = Ac.return_s_i(zceles.pdt, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_pdt();
			System.out.println("pdf转换tif 按钮已经：点击关闭");
		} else {
			System.out.println("pdf转换tif 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换tif开启，则关闭
	 */
	public static void offtxt() {
		String a = Ac.return_s_i(zceles.txt, "value");
		System.out.println("tttttttt" + a);
		if (a.contains("1")) {
			zcbus.click_txt();
			System.out.println("图像转换tif 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换tif 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果文档转换ofd开启，则关闭
	 */
	public static void offwdo() {
		String a = Ac.return_s_i(zceles.wdo, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_to();
			System.out.println("文档转换ofd 按钮已经：点击关闭");
		} else {
			System.out.println("文档转换ofd 按钮已经：默认关闭");
		}
	}

	/**
	 * 如果图像转换ofd开启，则关闭
	 */
	public static void offtxo() {
		String a = Ac.return_s_i(zceles.txo, "value");
		System.out.println(a);
		if (a.contains("1")) {
			zcbus.click_txo();
			System.out.println("图像转换ofd 按钮已经：点击关闭");
		} else {
			System.out.println("图像转换ofd 按钮已经：默认关闭");
		}
	}

	// 开启按钮
	/**
	 * 如果文档转换pdf关闭，则开启
	 */
	public static void openwdf() {
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
	 * 如果图像转换pdf关闭，则开启
	 */
	public static void opentf() {
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
	 * 如果图形转换pdf关闭，则开启
	 */
	public static void opentxxf() {
		String a = Ac.return_s_i(zceles.txxp, "value");
		if (a.contains("0")) {
			zcbus.click_imap();
			System.out.println("图形转换pdf 按钮已经：点击开启");
		} else {
			System.out.println("图形转换pdf 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换JPG关闭，则开启
	 */
	public static void opentxj() {
		String a = Ac.return_s_i(zceles.txj, "value");
		if (a.contains("0")) {
			zcbus.click_txj();
			System.out.println("图像转换JPG 按钮已经：点击开启");
		} else {
			System.out.println("图像转换JPG 按钮已经：默认开启");
		}
	}

	/**
	 * 如果视频转换flv关闭，则开启
	 */
	public static void openspf() {
		String a = Ac.return_s_i(zceles.spf, "value");
		if (a.contains("0")) {
			zcbus.click_spf();
			System.out.println("视频转换flv 按钮已经：点击开启");
		} else {
			System.out.println("视频转换flv 按钮已经：默认开启");
		}
	}

	/**
	 * 如果视频转换mp4关闭，则开启
	 */
	public static void openspm() {
		String a = Ac.return_s_i(zceles.spm, "value");
		if (a.contains("0")) {
			zcbus.click_spm();
			System.out.println("视频转换mp4 按钮已经：点击开启");
		} else {
			System.out.println("视频转换mp4 按钮已经：默认开启");
		}
	}

	/**
	 * 如果音频转换mp3关闭，则开启
	 */
	public static void openypm() {
		String a = Ac.return_s_i(zceles.ypm, "value");
		if (a.contains("0")) {
			zcbus.click_ypm();
			System.out.println("音频转换mp3 按钮已经：点击开启");
		} else {
			System.out.println("音频转换mp3 按钮已经：默认开启");
		}
	}

	/**
	 * 如果pdf转换tif关闭，则开启
	 */
	public static void openpdt() {
		String a = Ac.return_s_i(zceles.pdt, "value");
		if (a.contains("0")) {
			zcbus.click_pdt();
			System.out.println("pdf转换tif 按钮已经：点击开启");
		} else {
			System.out.println("pdf转换tif 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换tif关闭，则开启
	 */
	public static void opentxt() {
		String a = Ac.return_s_i(zceles.txt, "value");
		if (a.contains("0")) {
			zcbus.click_txt();
			System.out.println("图像转换tif 按钮已经：点击开启");
		} else {
			System.out.println("图像转换tif 按钮已经：默认开启");
		}
	}

	/**
	 * 如果文档转换ofd关闭，则开启
	 */
	public static void openwdo() {
		String a = Ac.return_s_i(zceles.wdo, "value");
		if (a.contains("0")) {
			zcbus.click_to();
			System.out.println("文档转换ofd 按钮已经：点击开启");
		} else {
			System.out.println("文档转换ofd 按钮已经：默认开启");
		}
	}

	/**
	 * 如果图像转换ofd关闭，则开启
	 */
	public static void opentxo() {
		String a = Ac.return_s_i(zceles.txo, "value");
		if (a.contains("0")) {
			zcbus.click_txo();
			System.out.println("图像转换ofd 按钮已经：点击开启");
		} else {
			System.out.println("图像转换ofd 按钮已经：默认开启");
		}
	}

}

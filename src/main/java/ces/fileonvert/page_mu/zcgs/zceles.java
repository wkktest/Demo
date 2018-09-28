package ces.fileonvert.page_mu.zcgs;

public class zceles {
	// 生成pdf
	/**
	 * 文件转换pdf
	 */
	public static String wdp = "docswitchtoPdf";
	/**
	 * 全选按钮：文件转换pdf
	 */
	public static String qwp_x = "//input[@id='textToPdfAll']/following-sibling::span/table";
	/**
	 * 分別选择支持格式：
	 */

	/**
	 * 图像转换pdf
	 */
	public static String txp = "picswitchtoPdf";
	/**
	 * 全选按钮：图像转换pdf
	 */
	public static String qtxp_x = "//*[@id='image2pdfDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";

	/**
	 * 图形转换pdf
	 */
	public static String txxp = "shapeswitchtoPdf";
	/**
	 * 全选按钮：图形转换pdf
	 */
	public static String qtxxp_x = "//*[@id='shap2pdfDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";

	// 生气jpg
	/**
	 * 图像转换jpg
	 */
	public static String txj = "picswitchtoJpg";
	/**
	 * 全选按钮：图像转换jpg
	 */
	public static String qtxj_x = "//*[@id='image2jpgDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";
	// 生成flv
	/**
	 * 视频转flv
	 */
	public static String spf = "videoswitchtoFlv";
	/**
	 * 全选按钮：视频转换flv
	 */
	public static String qsf_x = "//*[@id='video2flvDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";

	// 生成mp4
	/**
	 * 视频转mp4
	 */
	public static String spm = "videoswitchtoMp4";
	/**
	 * 全选按钮：视频转换mp4
	 */
	public static String qsm_x = "//*[@id='video2mp4Div']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";
	
	// 生成mp3
	/**
	 * 音频转mp3
	 */
	public static String ypm = "videoswitchtoMp3";
	/**
	 * 全选按钮：音频转mp3
	 */
	public static String qym_x = "//*[@id='voice2mp3Div']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";
	// 生成tif
	/**
	 * pdf转tif
	 */
	public static String pdt = "pdfswitchtoTif";
	/**
	 * 全选按钮：pdf转tif
	 */
	public static String qpt_x = "//*[@id='pdf2tifDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";
	/**
	 * 图像转tif
	 * 
	 */
	public static String txt = "imageswitchtoTif";
	/**
	 * 全选按钮：图像转tif
	 */
	public static String qtt_x = "//*[@id='image2tifDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";

	// 生成ofd
	/**
	 * 文档转ofd
	 */
	public static String wdo = "textswitchtoOfd";
	/**
	 * 全选按钮：文档转ofd
	 */
	public static String qwo_x = "//*[@id='txt2ofdDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";
	/**
	 * 图像转ofd
	 */
	public static String txo = "imageswitchtoOfd";
	/**
	 * 全选按钮：文档转ofd
	 */
	public static String qto_x = "//*[@id='image2ofdDiv']/li[1]/span[2]/span/table/tbody/tr/td/span[@data-value='all']/span";

	
//	/**
//	 * 判断元素是否存在定位：
//	 */
//	/**
//	 * 当此元素存在时，说明按钮已关闭：文档转换pdf
//	 */
////	public static String wdpoff = "//*[@id='txt2pdfDiv']/li[1]/span[contains(@style,'none')]";
//	public static String wdpoff = "docswitchtoPdf";
//	/**
//	 * 当此元素存在时，说明按钮已开启：文档转换pdf
//	 */
//	public static String wdpopen = "//*[@id='txt2pdfDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：图像转换pdf
//	 */
//	public static String txpoff = "//*[@id='image2pdfDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：图像转换pdf
//	 */
//	public static String txpopen = "//*[@id='image2pdfDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：图形转换pdf
//	 */
//	public static String txxpoff = "//*[@id='shap2pdfDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：图形转换pdf
//	 */
//	public static String txxpopen = "//*[@id='shap2pdfDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：图像转换jpg
//	 */
//	public static String txjoff = "//*[@id='image2jpgDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：图像转换jpg
//	 */
//	public static String txjopen = "//*[@id='image2jpgDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：视频转换flv
//	 */
//	public static String spfoff = "//*[@id='video2flvDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：视频转换flv
//	 */
//	public static String spfopen = "//*[@id='video2flvDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：视频转换mp4
//	 */
//	public static String spmoff = "//*[@id='video2mp4Div']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：视频转换mp4
//	 */
//	public static String spmopen = "//*[@id='video2mp4Div']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：音频转换mp3
//	 */
//	public static String ypmoff = "//*[@id='voice2mp3Div']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：视频转换mp3
//	 */
//	public static String ypmopen = "//*[@id='voice2mp3Div']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：pdf转换tif
//	 */
//	public static String pdtoff = "//*[@id='pdf2tifDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启: pdf转换tif
//	 */
//	public static String pdtopen = "//*[@id='pdf2tifDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：图像转换tif
//	 */
//	public static String txtoff = "//*[@id='image2tifDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：图像转换tif
//	 */
//	public static String txtopen = "//*[@id='image2tifDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：文档转换ofd
//	 */
//	public static String wdooff = "//*[@id='txt2ofdDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：文档转换ofd
//	 */
//	public static String wdoopen = "//*[@id='txt2ofdDiv']/li[1]/span[contains(@style,'block')]";
//
//	/**
//	 * 当此元素存在时，说明按钮已关闭：图像转换ofd
//	 */
//	public static String txooff = "//*[@id='image2ofdDiv']/li[1]/span[contains(@style,'none')]";
//	/**
//	 * 当此元素存在时，说明按钮已开启：图像转换ofd
//	 */
//	public static String txoopen = "//*[@id='image2ofdDiv']/li[1]/span[contains(@style,'block')]";
//
//	
	
	/**
	 * 判断是否全选所有格式的元素 定位：
	 */
	
/**
 * 判斷是否提示 最少打開一個按鈕
 */
	public static String offbut = "//span[@class='icon icon-control coral-control-info icon-notification2']/following-sibling::span";
	
	
	
	
	
	
}

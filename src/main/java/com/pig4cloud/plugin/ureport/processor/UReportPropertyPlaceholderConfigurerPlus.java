package com.pig4cloud.plugin.ureport.processor;

import com.bstek.ureport.UReportPropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * @author lengleng
 * @date 2020/7/25
 * <p>
 * 重写默认的 PropertyPlaceholder
 */
public class UReportPropertyPlaceholderConfigurerPlus extends UReportPropertyPlaceholderConfigurer {

	public UReportPropertyPlaceholderConfigurerPlus() {
		Properties properties = new Properties();
		properties.setProperty("ureport.disableFileProvider", "true");
		properties.setProperty("ureport.fileStoreDir", "");
		properties.setProperty("ureport.debug", "false");
		properties.setProperty("ureport.disableHttpSessionReportCache", "false");
		this.setProperties(properties);
	}
}

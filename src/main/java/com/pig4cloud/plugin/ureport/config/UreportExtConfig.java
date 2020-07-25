package com.pig4cloud.plugin.ureport.config;

import com.bstek.ureport.UReportPropertyPlaceholderConfigurer;
import com.bstek.ureport.provider.report.ReportProvider;
import com.pig4cloud.plugin.oss.OssProperties;
import com.pig4cloud.plugin.oss.service.OssTemplate;
import com.pig4cloud.plugin.ureport.processor.UReportPropertyPlaceholderConfigurerPlus;
import com.pig4cloud.plugin.ureport.provider.DfsReportProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lengleng
 * @date 2020/7/25
 * <p>
 * 增强默认Ureport 行为
 */
@ConditionalOnClass(OssTemplate.class)
@Configuration(proxyBeanMethods = false)
public class UreportExtConfig {

	@Bean
	public ReportProvider dfsReportProvider(OssTemplate ossTemplate, OssProperties properties) {
		return new DfsReportProvider(ossTemplate, properties);
	}

	@Bean
	public UReportPropertyPlaceholderConfigurer uReportPropertyPlaceholderConfigurerPlus() {
		return new UReportPropertyPlaceholderConfigurerPlus();
	}
}

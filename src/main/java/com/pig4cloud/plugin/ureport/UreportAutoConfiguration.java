package com.pig4cloud.plugin.ureport;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lengleng
 * @date 2020/7/25
 * <p>
 * ureport 配置类
 */
@Configuration(proxyBeanMethods = false)
@ImportResource(UreportAutoConfiguration.CONTEXT)
public class UreportAutoConfiguration {

	static final String CONTEXT = "classpath:ureport-console-context.xml";

	@Bean
	public ServletRegistrationBean<UReportServlet> buildUreportServlet() {
		return new ServletRegistrationBean<>(new UReportServlet(), "/ureport/*");
	}

}

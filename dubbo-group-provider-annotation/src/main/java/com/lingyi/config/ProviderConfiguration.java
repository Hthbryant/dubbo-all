package com.lingyi.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 咕噜科
 * ClassName: ProviderConfiguration
 * date: 2022-12-20 1:41
 * Description:
 * version 1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.lingyi.service")
@PropertySource("classpath:dubbo-provider.properties")
public class ProviderConfiguration {
}

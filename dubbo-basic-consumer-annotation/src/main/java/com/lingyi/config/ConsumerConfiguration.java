package com.lingyi.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 咕噜科
 * ClassName: ConsumerConfiguration
 * date: 2022-12-20 1:56
 * Description:
 * version 1.0
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.lingyi.controller")
@PropertySource("classpath:dubbo-consumer.properties")
@ComponentScan(value = {"com.lingyi.controller"})
public class ConsumerConfiguration {
}

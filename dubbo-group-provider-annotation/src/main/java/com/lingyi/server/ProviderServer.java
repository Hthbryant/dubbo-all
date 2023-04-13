package com.lingyi.server;

import com.lingyi.config.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 咕噜科
 * ClassName: ProviderServer
 * date: 2022-12-20 0:30
 * Description:
 * version 1.0
 */
public class ProviderServer {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.in.read(); // 按任意键退出
    }

}

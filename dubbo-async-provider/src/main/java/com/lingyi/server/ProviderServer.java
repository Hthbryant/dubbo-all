package com.lingyi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 咕噜科
 * ClassName: ProviderServer
 * date: 2022-12-20 0:30
 * Description:
 * version 1.0
 */
public class ProviderServer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

}

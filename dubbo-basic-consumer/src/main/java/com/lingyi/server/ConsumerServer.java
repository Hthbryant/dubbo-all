package com.lingyi.server;

import com.lingyi.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 咕噜科
 * ClassName: ConsumerServer
 * date: 2022-12-20 1:00
 * Description:
 * version 1.0
 */
public class ConsumerServer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();
        // 获取远程服务代理
        HelloService helloService = context.getBean(HelloService.class);
        String hello = helloService.hello("dubbo"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }

}

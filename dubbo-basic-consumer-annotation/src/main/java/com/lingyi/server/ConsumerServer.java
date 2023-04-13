package com.lingyi.server;

import com.lingyi.config.ConsumerConfiguration;
import com.lingyi.controller.HelloController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 咕噜科
 * ClassName: ConsumerServer
 * date: 2022-12-20 1:00
 * Description:
 * version 1.0
 */
public class ConsumerServer {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        // 获取远程服务代理
        HelloController controller = context.getBean(HelloController.class);
        System.out.println(controller.hello("dubbo"));
        System.in.read();
    }

}

package com.lingyi.server;

import com.lingyi.service.HelloAsyncService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CompletableFuture;

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
        HelloAsyncService helloService = context.getBean(HelloAsyncService.class);
        long start = System.currentTimeMillis();
        //String doSync1 = helloService.doSync1();
        //String doSync2 = helloService.doSync2();
        CompletableFuture<String> future1 = helloService.doAsync1();
        CompletableFuture<String> future2 = helloService.doAsync2();
        long end = System.currentTimeMillis();
        System.out.println("end - start = " + (end - start));
        future1.whenComplete((result,throwable)->{
            if (throwable != null) {
                throwable.printStackTrace();
            } else {
                System.out.println("result = " + result);
            }
        });
        future2.whenComplete((result,throwable)->{
            if (throwable != null) {
                throwable.printStackTrace();
            } else {
                System.out.println("result = " + result);
            }
        });
    }

}

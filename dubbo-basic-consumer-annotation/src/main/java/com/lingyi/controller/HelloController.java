package com.lingyi.controller;

import com.lingyi.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author 咕噜科
 * ClassName: controller
 * date: 2022-12-20 1:53
 * Description:
 * version 1.0
 */
@Component
public class HelloController {

    @Reference
    private HelloService helloService;

    public String hello (String name) {
        return helloService.hello(name);
    }

}

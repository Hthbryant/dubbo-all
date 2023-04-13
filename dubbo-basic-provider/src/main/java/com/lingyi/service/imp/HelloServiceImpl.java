package com.lingyi.service.imp;

import com.lingyi.service.HelloService;

/**
 * @author 咕噜科
 * ClassName: HelloServiceImpl
 * date: 2022-12-20 0:24
 * Description:
 * version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("服务端被调用");
        return "hello - " + name;
    }
}

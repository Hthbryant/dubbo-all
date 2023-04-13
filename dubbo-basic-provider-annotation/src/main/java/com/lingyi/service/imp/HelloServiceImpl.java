package com.lingyi.service.imp;

import com.lingyi.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 咕噜科
 * ClassName: HelloServiceImpl
 * date: 2022-12-20 0:24
 * Description:
 * version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello - " + name +" (annotation)";
    }
}

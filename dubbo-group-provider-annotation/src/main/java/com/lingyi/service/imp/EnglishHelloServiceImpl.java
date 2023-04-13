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
@Service(group = "english")
public class EnglishHelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "group hello - " + name +" (annotation)";
    }
}

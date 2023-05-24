package com.lingyi.service.Impl;

import com.lingyi.service.Log;

/**
 * @author 咕噜科
 * ClassName: Log4j
 * date: 2023-05-24 23:30
 * Description:
 * version 1.0
 */
public class Log4j implements Log {
    @Override
    public void printLog(String msg) {
        System.out.println("log4j info " + msg);
    }
}

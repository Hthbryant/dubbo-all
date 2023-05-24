package com.lingyi.service.Impl;

import com.lingyi.service.Log;

/**
 * @author 咕噜科
 * ClassName: Logback
 * date: 2023-05-24 23:31
 * Description:
 * version 1.0
 */
public class Logback implements Log {
    @Override
    public void printLog(String msg) {
        System.out.println("logback info " + msg);
    }
}

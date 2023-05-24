package com.lingyi.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author 咕噜科
 * ClassName: Log
 * date: 2023-05-24 23:29
 * Description:
 * version 1.0
 */
@SPI("logback")
public interface Log {

    public void printLog (String msg);

}

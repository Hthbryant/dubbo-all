package com.lingyi.service;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author 咕噜科
 * ClassName: LogMain
 * date: 2023-05-24 23:31
 * Description:
 * version 1.0
 */
public class LogMain {

    public static void main(String[] args) {
        ExtensionLoader<Log> extensionLoader = ExtensionLoader.getExtensionLoader(Log.class);
        Log log = extensionLoader.getDefaultExtension();
        log.printLog("dubbo");
    }

}

package com.lingyi.protocol.impl;

import com.lingyi.protocol.Protocol;
import org.apache.dubbo.common.URL;

/**
 * @author 咕噜科
 * ClassName: dubboProtocol
 * date: 2023-05-25 0:24
 * Description:
 * version 1.0
 */
public class dubboProtocol implements Protocol {
    @Override
    public void communicate(URL url) {
        System.out.println("dubbo Protocol start...");
    }
}

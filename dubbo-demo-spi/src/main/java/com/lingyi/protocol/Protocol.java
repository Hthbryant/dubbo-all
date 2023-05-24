package com.lingyi.protocol;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author 咕噜科
 * ClassName: Protocol
 * date: 2023-05-25 0:23
 * Description:
 * version 1.0
 */
@SPI("dubbo")
public interface Protocol {

    @Adaptive
    public void communicate(URL url);

}

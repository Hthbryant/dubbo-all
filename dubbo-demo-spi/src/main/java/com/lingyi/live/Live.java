package com.lingyi.live;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author 咕噜科
 * ClassName: Live
 * date: 2023-05-25 0:05
 * Description:
 * version 1.0
 */
@SPI("mobile")
public interface Live {

    public void liveSale(URL url);

}

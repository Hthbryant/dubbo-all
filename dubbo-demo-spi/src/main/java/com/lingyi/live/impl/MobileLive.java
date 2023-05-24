package com.lingyi.live.impl;

import com.lingyi.live.Live;
import com.lingyi.protocol.Protocol;
import org.apache.dubbo.common.URL;

/**
 * @author 咕噜科
 * ClassName: MobileLive
 * date: 2023-05-25 0:08
 * Description:
 * version 1.0
 */
public class MobileLive implements Live {

    private Protocol protocol;

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public void liveSale(URL url) {
        protocol.communicate(url);
        System.out.println("手机直播带货");
    }
}

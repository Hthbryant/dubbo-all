package com.lingyi.wrapper;

import com.lingyi.live.Live;
import org.apache.dubbo.common.URL;

/**
 * @author 咕噜科
 * ClassName: ShouLianLiveWrapper
 * date: 2023-05-25 0:06
 * Description:
 * version 1.0
 */
public class ShouLianLiveWrapper implements Live {

    private Live live;

    public ShouLianLiveWrapper(Live live) {
        this.live = live;
    }

    @Override
    public void liveSale(URL url) {
        live.liveSale(url);
        System.out.println("开启瘦脸。。。。");
    }
}

package com.lingyi.wrapper;

import com.lingyi.live.Live;
import org.apache.dubbo.common.URL;

/**
 * @author 咕噜科
 * ClassName: BeautyLiveWrapper
 * date: 2023-05-24 23:47
 * Description:
 * version 1.0
 */
public class BeautyLiveWrapper implements Live {

    private Live live;

    public BeautyLiveWrapper(Live live) {
        this.live = live;
    }

    @Override
    public void liveSale(URL url) {
        live.liveSale(url);
        System.out.println("开启美颜。。。。");
    }
}

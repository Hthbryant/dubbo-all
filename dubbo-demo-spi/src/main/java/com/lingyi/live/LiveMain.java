package com.lingyi.live;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author 咕噜科
 * ClassName: LiveMain
 * date: 2023-05-25 0:09
 * Description:
 * version 1.0
 */
public class LiveMain {

    public static void main(String[] args) {
        ExtensionLoader<Live> extensionLoader = ExtensionLoader.getExtensionLoader(Live.class);
        Live live = extensionLoader.getDefaultExtension();
        URL url = URL.valueOf("rmi://localhost:");
        live.liveSale(url);
    }

}

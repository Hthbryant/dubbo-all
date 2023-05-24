package com.lingyi.filter;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: FilterMain
 * date: 2023-05-25 0:37
 * Description:
 * version 1.0
 */
public class FilterMain {

    public static void main(String[] args) {
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = URL.valueOf("dubbo://localhost?type=cache");
        List<Filter> filters = extensionLoader.getActivateExtension(url, "type", "consumer");
        filters.forEach(Filter::doFilter);
    }

}

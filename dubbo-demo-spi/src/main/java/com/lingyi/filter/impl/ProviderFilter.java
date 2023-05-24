package com.lingyi.filter.impl;

import com.lingyi.filter.Filter;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author 咕噜科
 * ClassName: ProviderFilter
 * date: 2023-05-25 0:13
 * Description:
 * version 1.0
 */
@Activate(group = {"provider"})
public class ProviderFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("ProviderFilter start。。。");
    }
}

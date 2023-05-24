package com.lingyi.filter.impl;

import com.lingyi.filter.Filter;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author 咕噜科
 * ClassName: ConsumerFilter
 * date: 2023-05-25 0:14
 * Description:
 * version 1.0
 */
@Activate(group = {"consumer"})
public class ConsumerFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("ConsumerFilter start....");
    }
}

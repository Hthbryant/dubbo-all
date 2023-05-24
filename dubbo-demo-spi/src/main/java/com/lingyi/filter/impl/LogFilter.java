package com.lingyi.filter.impl;

import com.lingyi.filter.Filter;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author 咕噜科
 * ClassName: LogFilter
 * date: 2023-05-25 0:20
 * Description:
 * version 1.0
 */
@Activate(group = {"provider","consumer"},value = "log")
public class LogFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("logFilter start....");
    }
}

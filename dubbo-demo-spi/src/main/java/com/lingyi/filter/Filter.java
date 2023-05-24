package com.lingyi.filter;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author 咕噜科
 * ClassName: Filter
 * date: 2023-05-25 0:14
 * Description:
 * version 1.0
 */
@SPI
public interface Filter {

    public void doFilter();

}

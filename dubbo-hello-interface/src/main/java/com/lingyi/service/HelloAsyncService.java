package com.lingyi.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author 咕噜科
 * ClassName: HelloAsyncService
 * date: 2023-04-14 1:19
 * Description:
 * version 1.0
 */
public interface HelloAsyncService {

    String doSync1();
    String doSync2();

    CompletableFuture<String> doAsync1();
    CompletableFuture<String> doAsync2();
}

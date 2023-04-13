package com.lingyi.service.imp;

import com.lingyi.service.HelloAsyncService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author 咕噜科
 * ClassName: HelloAsyncServiceImpl
 * date: 2023-04-13 23:47
 * Description:
 * version 1.0
 */
public class HelloAsyncServiceImpl implements HelloAsyncService {
    @Override
    public String doSync1() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "doSync1";
    }

    @Override
    public String doSync2() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "doSync2";
    }

    @Override
    public CompletableFuture<String> doAsync1() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "doAsync1";
        });

        return future;
    }

    @Override
    public CompletableFuture<String> doAsync2() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "doAsync2";
        });

        return future;
    }
}

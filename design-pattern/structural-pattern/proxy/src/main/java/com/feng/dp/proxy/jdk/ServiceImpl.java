package com.feng.dp.proxy.jdk;

/**
 * @author guoqf
 * @date 2021/12/14 14:01
 */
public class ServiceImpl implements Service {
    public void doService() {
        System.out.println("Real doService in ServiceImpl");
    }
}

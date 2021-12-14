package com.feng.dp.proxy.stat;

/**
 * @author guoqf
 * @date 2021/12/14 13:39
 */
public class ServiceProxy implements Service {

    private Service realService;

    public ServiceProxy(Service realService) {
        this.realService = realService;
    }

    public void doService() {
        System.out.println("Before real doService in ServiceProxy");
        realService.doService();
        System.out.println("After real doService in ServiceProxy");
    }
}

package com.feng.dp.proxy.stat;

/**
 * @author guoqf
 * @date 2021/12/14 13:41
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Service realService = new ServiceImpl();
        Service proxyService = new ServiceProxy(realService);
        proxyService.doService();

    }
}

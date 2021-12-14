package com.feng.dp.proxy.jdk;

/**
 * @author guoqf
 * @date 2021/12/14 14:15
 */
public class ProxyTest {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Service proxyService = JdkProxyFactory.createProxy(service);
        proxyService.doService();
    }
}

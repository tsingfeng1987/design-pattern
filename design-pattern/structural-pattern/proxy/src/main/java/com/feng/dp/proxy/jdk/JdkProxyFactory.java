package com.feng.dp.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author guoqf
 * @date 2021/12/14 14:08
 */
public class JdkProxyFactory {

    public static <T> T createProxy(T target) {
        Class<?> tClass = target.getClass();
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), tClass.getInterfaces(), new ProxyInvocationHandler(target));
    }
}

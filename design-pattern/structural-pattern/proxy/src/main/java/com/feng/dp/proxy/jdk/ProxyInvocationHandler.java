package com.feng.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author guoqf
 * @date 2021/12/14 14:02
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object realObj;

    public ProxyInvocationHandler(Object realObj) {
        this.realObj = realObj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before real object's method called, to call real object[" + realObj + "]");
        Object invokeResult = method.invoke(realObj, args);
        System.out.println("After real object's method called, invokeResult is [" + invokeResult+"]");

        return invokeResult;
    }

}

package com.feng.dp.proxy.stat;

/**
 * @author guoqf
 * @date 2019/9/27
 */
public class Client {
    public static void main(String[] args) {
        ISubject realSubject = new RealSubject();
        ISubject proxy = new RealSubjectProxy(realSubject);
        proxy.createTask("task1");
    }
}

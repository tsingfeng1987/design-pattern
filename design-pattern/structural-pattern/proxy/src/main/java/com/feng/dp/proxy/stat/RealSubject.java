package com.feng.dp.proxy.stat;


/**
 * @author guoqf
 * @date 2019/9/27
 */
public class RealSubject implements ISubject {

    public void createTask(String taskName) {
        System.out.println(String.format("To invoke createTask for task[%s] in RealSubject", taskName));
    }
}

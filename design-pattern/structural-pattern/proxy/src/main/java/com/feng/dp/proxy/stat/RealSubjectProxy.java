package com.feng.dp.proxy.stat;

/**
 * @author guoqf
 * @date 2019/9/27
 */
public class RealSubjectProxy implements ISubject {

    private ISubject target;

    public RealSubjectProxy(ISubject target) {
        this.target = target;
    }

    public void createTask(String taskName) {
        System.out.println(String.format("Before target[%s] invoke createTask for task[%s]", target, taskName));

        target.createTask(taskName);

        System.out.println(String.format("After target[%s] invoke createTask for task[%s]", target, taskName));
    }
}

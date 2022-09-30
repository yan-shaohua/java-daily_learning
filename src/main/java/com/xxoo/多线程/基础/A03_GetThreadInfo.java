package com.xxoo.多线程.基础;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 13:55
 * @Description: TODO
 */
public class A03_GetThreadInfo {

    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();


        //获取线程的唯一标识
        long id = main.getId();
        System.out.println("id:"+id);

        //获取线程的名字
        String name = main.getName();
        System.out.println("name:"+name);

        //获取优先级，默认为5；最大级为10；最小为1
        int priority = main.getPriority();
        System.out.println("priority:"+priority);

        //显示是否处于活动状态
        boolean isAlive = main.isAlive();
        System.out.println("是否活着:"+isAlive);


        //显示是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程:"+isDaemon);

        //显示线程是否被中断
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否被中断:"+isInterrupted);
    }

}

package com.xxoo.多线程.基础;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class A04_00_ThreadState {

    /**
     * 1. NEW：线程刚刚创建，还没有启动
     * 2. RUNNABLE：可运行状态，由线程调度器可以安排执行包括READY和RUNNING两种细分状态
     * 3. WAITING：等待被唤醒
     * 4. TIMED WAITING：隔一段时间后自动唤醒
     * 5. BLOCKED：被阻塞，正在等待锁
     * 6. TERMINATED：线程结束
     */
    public static void main(String[] args) throws Exception {

        //===============================================================
        Thread t1 = new Thread(() -> {
            System.out.println("2:" + Thread.currentThread().getState());
            for (int i = 0; i < 10; i++) {
                //SleepHelper.sleepSeconds(1);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(i + " ");
            }
            System.out.println();
        });
        System.out.println("1:" + t1.getState());
        t1.start();
        t1.join();
        System.out.println("3:" + t1.getState());


        //===============================================================
        Thread t2 = new Thread(() -> {
            try {
                //让t2线程阻塞，等待别人叫醒
                LockSupport.park();
                System.out.println("t2 go on!");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //启动t2线程
        t2.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("4:" + t2.getState());


        //叫醒
        LockSupport.unpark(t2);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("5:" + t2.getState());


        //===============================================================
        final Object o = new Object();
        Thread t3 = new Thread(() -> {
            synchronized (o) {
                System.out.println("t3得到了锁");
            }
        });

        new Thread(() -> {
            synchronized (o) {
                //SleepHelper.sleepSeconds(5);

            }
        }).start();

        //SleepHelper.sleepSeconds(1);

        t3.start();
        //SleepHelper.sleepSeconds(1);
        System.out.println("6:" + t3.getState());


    }
}

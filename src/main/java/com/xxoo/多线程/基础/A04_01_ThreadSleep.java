package com.xxoo.多线程.基础;

import java.util.Scanner;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 10:36
 * @Description: 程序启动后，输入一个数字，如:输入10然后每6秒钟递减一次并输出，到0时停止。
 */
public class A04_01_ThreadSleep {

    /**
     * 睡眠阻塞
     * static void sleep(long ms)
     * 该方法会让运行这个方法的线程处于阻塞状态指定的毫秒，当超时后，线程会自动回到RUNNABLE状态，等待再次获取时间片就可以运行。
     *
     * 注：sleep()🈶️两种情况，无锁和有锁
     * 无锁：sleep就是正在执行的线程主动让出CPU，CPU去执行其他线程，在sleep指定的时间过后，线程会自动回到RUNNABLE状态，等待再次获取时间片就可以运行。
     * 有锁：当前线程进入了同步锁，sleep方法并不会释放锁，即使当前线程使用sleep方法让出了CPU，但其他被同步锁挡住的线程也无法执行
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = Integer.parseInt(scanner.nextLine());
        for(int i=num;i>0;i--) {
            System.out.println(i);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("结束.");

    }
}

package com.xxoo.多线程.entry;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 10:49
 * @Description: TODO
 */
public class YeiledDemo implements Runnable {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 60; i++) {
                System.out.println(Thread.currentThread().getName() + " *  " + i);
                Thread.yield();
            }
        }
    }
}

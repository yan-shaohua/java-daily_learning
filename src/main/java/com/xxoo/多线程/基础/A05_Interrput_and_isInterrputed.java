package com.xxoo.多线程.基础;

/**
 * @Author yanshaohua
 * @Date 2022/9/22 10:57
 * @Description: TODO
 */
public class A05_Interrput_and_isInterrputed {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            for (;;) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is interrputed!");
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });

        t.start();

        Thread.sleep(1);

        t.interrupt();
    }
}

package com.xxoo.多线程.基础;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 10:53
 * @Description:  join方法可以协调线程之间的同步运行
 */
public class A04_03_ThreadJoin {

    public static boolean isFinish = false;

    public static void main(String[] args) {

        //download线程
        final Thread download = new Thread() {
            @Override
            public void run() {
                System.out.println("down:开始下载图片...");
                for(int i=1;i<=100;i++) {
                    System.out.println("down:已下载"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("down:图片下载完毕!");
                isFinish = true;
            }
        };

        //show线程
        Thread show = new Thread() {
            @Override
            public void run() {
                System.out.println("show:开始显示图片...");

                // 先等在下载线程将图片下载完毕
                try {
                    // 当show线程调用download线程的join方法后就进入了阻塞状态，直到download线程结束才会解除阻塞。
                    download.join();
                } catch (InterruptedException e) {}

                if(!isFinish) {
                    throw new RuntimeException("图片加载失败!");
                }
                System.out.println("show:显示图片完毕!");
            }
        };

        //启动线程
        download.start();
        show.start();

    }

}

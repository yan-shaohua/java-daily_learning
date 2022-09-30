package com.xxoo.多线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yanshaohua
 * @Date 2022/9/27 15:00
 * @Description: TODO
 */
public class ThreadNotSafeDemo {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(16);
    static SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss");

    public String date(int seconds) {
        // 创建不同的date
        Date date = new Date(1000 * seconds);
        return dateFormat.format(date);
    }



    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            threadPool.submit(() -> {
                String date = new ThreadNotSafeDemo().date(finalI);
                System.out.println(date);
            });
        }
        threadPool.shutdown();
    }
}

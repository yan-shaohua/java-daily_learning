package com.xxoo.多线程.基础;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yanshaohua
 * @Date 2022/9/29 10:24
 * @Description: TODO
 */
public class A02_04_ThreadPoolExecutors_Create_Thread {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPool threadPool = new ThreadPool();
        for(int i =0;i<5;i++){
            //为线程池分配任务
            executorService.submit(threadPool);
        }
        //关闭线程池
        executorService.shutdown();
    }


}



class ThreadPool implements Runnable {

    @Override
    public void run() {
        for(int i = 0 ;i<10;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}

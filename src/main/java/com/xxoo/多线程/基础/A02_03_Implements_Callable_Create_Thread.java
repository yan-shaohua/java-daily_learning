package com.xxoo.多线程.基础;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 14:12
 * @Description: TODO
 */
public class A02_03_Implements_Callable_Create_Thread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum += i;
            }
        }
        return sum;
    }

}



class Implements_Callable {
    public static void main(String[] args) {

        //执行Callable方式，需要FutureTask实现，用于接收运算结果
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new A02_03_Implements_Callable_Create_Thread());
        new Thread(futureTask).start();
        //接收线程运算后的结果
        try {
            Integer sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
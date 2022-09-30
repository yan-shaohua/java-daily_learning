package com.xxoo.多线程.基础;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 14:12
 * @Description: TODO
 */
public class A02_02_Implements_Runable_Create_Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("implements Runable");
    }

}





class Implements_Runable {
    public static void main(String[] args) {

        A02_02_Implements_Runable_Create_Thread ir = new A02_02_Implements_Runable_Create_Thread();
        Thread t2 = new Thread(ir);
        t2.start();


    }
}
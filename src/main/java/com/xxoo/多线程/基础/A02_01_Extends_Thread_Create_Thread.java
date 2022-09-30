package com.xxoo.多线程.基础;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 14:12
 * @Description: TODO
 */
public class A02_01_Extends_Thread_Create_Thread extends Thread{

    @Override
    public void run() {
        System.out.println("extends Thread");
    }

}




class Extends_Thread {
    public static void main(String[] args) {

        A02_01_Extends_Thread_Create_Thread t = new A02_01_Extends_Thread_Create_Thread();
        t.start();

    }
}
package com.xxoo.设计模式.单例;

/**
 * 懒汉式（lazy loading）：虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Single02 {

    private static volatile Single02 INSTANCE;

    private Single02(){}

    public static Single02 getInstance(){
        if (INSTANCE == null) {
            //双重检查
            synchronized (Single02.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Single02();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i=0; i<50; i++) {
            new Thread(()->{
                System.out.println(Single02.getInstance().hashCode());
            }).start();
        }
    }



}

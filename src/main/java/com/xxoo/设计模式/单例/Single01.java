package com.xxoo.设计模式.单例;

/**
 * 饿汉式（Spring默认）：JVM保证线程安全，不管用到与否，都会初始化到内存中
 */
public class Single01 {

    private static final Single01 INSTANCE = new Single01();

    private Single01(){}

    public static Single01 getInstance(){
        return Single01.INSTANCE;
    }


    public static void main(String[] args) {
        Single01 single01 = Single01.getInstance();
        Single01 single02 = Single01.getInstance();
        System.out.println("single01 : single02 = " + (single01 == single02));
    }



}

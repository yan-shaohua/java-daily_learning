package com.xxoo.设计模式.单例模式;

/**
 * 静态内部类方式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Single03 {

    private Single03(){}

    private static class Single03Test{
        private static final Single03 INSTANCE = new Single03();
    }

    public static Single03 getInstance(){
        return Single03Test.INSTANCE;
    }


    public static void main(String[] args) {
        for(int i=0; i<50; i++) {
            new Thread(()->{
                System.out.println(Single03.getInstance().hashCode());
            }).start();
        }
    }



}

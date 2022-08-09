package com.xxoo.设计模式.单例模式;

/**
 * 枚举方式：不仅可以解决线程同步，还可以防止反序列化
 */
public enum Single04 {

    INSTANCE;

    public static void main(String[] args) {
        for(int i=0; i<50; i++) {
            new Thread(()->{
                System.out.println(Single04.INSTANCE.hashCode());
            }).start();
        }
    }



}

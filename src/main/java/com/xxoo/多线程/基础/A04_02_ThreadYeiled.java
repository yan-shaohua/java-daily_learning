package com.xxoo.多线程.基础;


import com.xxoo.多线程.entry.YeiledDemo;

/**
 * @Author yanshaohua
 * @Date 2022/9/28 10:44
 * @Description: 向调度程序提示当前线程愿意让步
 */
public class A04_02_ThreadYeiled {

    /**
     * 当遇到yeiled()方法时，当前线程会先释放CPU，进入就绪状态，等待执行，在有锁状态下，同sleep()一样，不会释放锁。
     * 注意：不会进入阻塞状态
     * 如：有一个玩具，自己玩完以后放下，它可以让弟弟妹妹去抢，自己也可以去抢，最后谁抢到就谁玩
     *
     * 现象：稍微减缓线程的运行，达到所有线程都能执行到的效果
     */
    public static void main(String[] args) {
        YeiledDemo d = new YeiledDemo();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
    }

}



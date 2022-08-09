package com.xxoo.设计模式.观察者模式;

/**
 * @Author yanshaohua
 * @Date 2022/8/9 18:40
 * @Description: 实体观察者类
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }


}

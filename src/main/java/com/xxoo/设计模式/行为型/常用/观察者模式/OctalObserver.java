package com.xxoo.设计模式.行为型.常用.观察者模式;

/**
 * @Author yanshaohua
 * @Date 2022/8/9 18:43
 * @Description: 实体观察者类
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }

}

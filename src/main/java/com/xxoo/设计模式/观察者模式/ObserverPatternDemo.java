package com.xxoo.设计模式.观察者模式;

/**
 * @Author yanshaohua
 * @Date 2022/8/9 18:45
 * @Description: TODO
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }


}

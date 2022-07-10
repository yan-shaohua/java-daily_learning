package com.xxoo.设计模式.装饰器模式;

/**
 * @Author yanshaohua
 * @Date 2022/7/10 11:11
 * @Description: 圆
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

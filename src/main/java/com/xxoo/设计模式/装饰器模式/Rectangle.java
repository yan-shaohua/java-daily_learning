package com.xxoo.设计模式.装饰器模式;

/**
 * @Author yanshaohua
 * @Date 2022/7/10 11:10
 * @Description: 矩形
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

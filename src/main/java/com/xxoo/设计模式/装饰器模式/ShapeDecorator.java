package com.xxoo.设计模式.装饰器模式;

/**
 * @Author yanshaohua
 * @Date 2022/7/10 11:13
 * @Description: 实现了 Shape 接口的抽象装饰类
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

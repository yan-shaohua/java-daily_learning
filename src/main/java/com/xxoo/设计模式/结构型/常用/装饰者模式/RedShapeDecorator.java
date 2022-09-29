package com.xxoo.设计模式.结构型.常用.装饰者模式;

/**
 * @Author yanshaohua
 * @Date 2022/7/10 11:17
 * @Description: TODO
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }


    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }


}

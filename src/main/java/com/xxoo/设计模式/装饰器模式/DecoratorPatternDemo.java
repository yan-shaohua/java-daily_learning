package com.xxoo.设计模式.装饰器模式;

/**
 * @Author yanshaohua
 * @Date 2022/7/10 11:25
 * @Description: TODO
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
//        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
//        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}

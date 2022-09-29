package com.xxoo.设计模式.行为型.常用.策略模式;

/**
 * @Author yanshaohua
 * @Date 2022/8/9 20:26
 * @Description: TODO
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}

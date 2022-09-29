package com.xxoo.设计模式.行为型.常用.策略模式;

/**
 * @Author yanshaohua
 * @Date 2022/8/9 20:24
 * @Description: TODO
 */
public class OperationAdd implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}

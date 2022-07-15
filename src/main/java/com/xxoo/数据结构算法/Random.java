package com.xxoo.数据结构算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/27 20:52
 * @Description: TODO
 */
public class Random {


    public static void main(String[] args) {

        // [0-1):返回一个0-1左闭右开等概率的double类的小数
        double ans = Math.random();
        System.out.println("ans = " + ans);



        System.out.println("================================");
        int testTimes = 1000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random() < 0.75) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);



        System.out.println("================================");
        count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random() * 8 < 6) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);
        System.out.println((double) 6 / (double) 8);



        System.out.println("================================");
        int k = 9;
        int[] counts = new int[9];      //counts[0]表示0出现的次数、counts[1]表示1出现的次数
        for(int i = 0; i<testTimes; i++){
            int answer = (int) (Math.random() * k);    //返回左闭右闭[0-8]范围内的数
            counts[answer]++;
        }
        for(int i=0; i<k; i++){
            System.out.println(i + "这个数出现了" + counts[i] + "次");
        }









    }


}

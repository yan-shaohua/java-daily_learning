package com.xxoo.数据结构算法;

/**
 * 打印二进制
 */
public class PrintBinary {


    public static void print(int num){

        // i = 31; 代表int类型的范围内的数占32位（4字节）
        for(int i = 31; i >= 0; i--){
            // num=4        0000 0000 0000 0000 0000 0000 0000 0010
            // i=31  1<<31  1000 0000 0000 0000 0000 0000 0000 0000
            // i=30  1<<30  0100 0000 0000 0000 0000 0000 0000 0000
            // i=2   1<<2   0000 0000 0000 0000 0000 0000 0000 0010
            System.out.print(  (num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();

    }


    public static void main(String[] args){
        int num = 2;
        print(num);


        System.out.println("---------------左移---------------");
        //test << n  = test * n
        int test = 2;
        print(test);
        print(test << 1);
        print(test << 4);
        print(test << 10);
        print(test << 40);


        System.out.println("----------------右移--------------");
        int test1 = 2;
        print(test1);
        print(test1 >> 1);
        print(test1 >> 4);
        print(test1 >> 10);
        print(test1 >> 40);



        System.out.println("------------------------------");
        // -a = ~a + 1
        int a = 5;
        int b = -a;
        int c  = (~a + 1);
        int d  = ~a;  // 取反
        print(a);   // 00000000000000000000000000000101
        print(b);   // 11111111111111111111111111111011
        print(c);   // 11111111111111111111111111111011
        print(d);   // 11111111111111111111111111111010
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);



    }





}

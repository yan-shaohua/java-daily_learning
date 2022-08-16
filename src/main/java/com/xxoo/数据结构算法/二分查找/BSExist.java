package com.xxoo.数据结构算法.二分查找;

import com.xxoo.数据结构算法.排序算法.SelectionSort;

import java.util.Scanner;

import static com.xxoo.数据结构算法.Comp.lenRandomValueRandom;

/**
 * @Author yanshaohua
 * @Date 2022/8/16 23:21
 * @Description: 有序数组中找到num
 */
public class BSExist {

    //arr保证有序
    public static String find(int[] arr, int num) {
        if (arr.length == 0 || arr == null) {
            return "数组为空";
        }

        int L = 0;
        int R = arr.length - 1;

        //arr[0...N-1]    arr[L...R]
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {
                return num + "找到了";
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return "出错了";
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxLen = 50;
        int maxValue = 1000;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr = lenRandomValueRandom(maxLen, maxValue);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            SelectionSort.selectionSort(arr);
            System.out.println("请输入您要查找的数字，按回车结束！");

            int nextInt = sc.nextInt();

            String s = find(arr, nextInt);
            System.out.println(s);

            continue;

        }
    }


}
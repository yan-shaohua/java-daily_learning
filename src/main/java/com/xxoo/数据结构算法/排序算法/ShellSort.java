package com.xxoo.数据结构算法.排序算法;/*
 *@author: yanshaohua
 *@Time: 2022/6/27  17:21
 *@description:
 */

public class ShellSort {
    private static void shellSort(int[] arr) {
        int n = arr.length;
        int h = 1;
        while (h<n/3) { //动态定义间隔序列
            h = 3*h +1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && (arr[j] < arr[j - h]); j -= h) {
                    int temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j-h]= temp;
                }
            }
            h /=3;
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,4,7,23,54,9,39,5,76,88};
        SortCommon.printArr(arr);
        shellSort(arr);
        SortCommon.printArr(arr);
    }




}


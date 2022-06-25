package com.xxoo.数据结构算法.排序算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/25 16:54
 * @Description: TODO
 */
public class SortCommon {

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

}

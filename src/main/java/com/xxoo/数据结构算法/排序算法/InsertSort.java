package com.xxoo.数据结构算法.排序算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/25 21:35
 * @Description: 插入排序
 */
public class InsertSort {


    public static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        // 0 ~ 0范围内有序
        // 0 ~ 1范围内有序
        // 0 ~ 2范围内有序
        // 0 ~ n-1范围内有序
        for(int i=1; i<arr.length; i++){
            while(i - 1 >= 0 && arr[i-1] > arr[i]){
                SortCommon.swap(arr,i-1,i);
                i--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,4,7,23,54,9,39,5,76,88};
        SortCommon.printArr(arr);
        insertSort(arr);
        SortCommon.printArr(arr);
    }
}

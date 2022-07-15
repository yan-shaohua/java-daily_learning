package com.xxoo.数据结构算法.排序算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/25 21:35
 * @Description: 插入排序
 */
public class InsertSort {


    public static void insertSort1(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        // 0 ~ 0 范围内有序已经确定
        // 0 ~ 1 范围内有序
        // 0 ~ 2 范围内有序
        // 0 ~ n-1 范围内有序
        for(int i=1; i<arr.length; i++){
            int newNumIndex = i;
            while(newNumIndex - 1 >= 0 && arr[newNumIndex-1] > arr[newNumIndex]){
                SortCommon.swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }



    public static void insertSort2(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i=1; i<arr.length; i++){
            for(int j= i-1; j >= 0 && arr[j] > arr[j + 1]; j--){
                SortCommon.swap(arr,j,j+1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,4,7,23,54,9,39,5,76,88};
        SortCommon.printArr(arr);
        //insertSort1(arr);
        insertSort2(arr);
        SortCommon.printArr(arr);
    }
}

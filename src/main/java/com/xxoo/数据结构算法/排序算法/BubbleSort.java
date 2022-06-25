package com.xxoo.数据结构算法.排序算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/25 16:53
 * @Description: 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        // 0 ~ N-1
        // 0 ~ N-2
        int N = arr.length;
        for(int i=N-1; i>=0; i--){

            for(int j=1; j<=i; j++){
                if(arr[j-1] > arr[j]){
                    SortCommon.swap(arr,j-1,j);
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = {6,4,7,23,54,9,39,5,76,88};
        SortCommon.printArr(arr);
        bubbleSort(arr);
        SortCommon.printArr(arr);
    }





}

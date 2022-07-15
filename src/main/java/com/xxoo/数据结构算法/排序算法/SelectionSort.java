package com.xxoo.数据结构算法.排序算法;

/**
 * @Author yanshaohua
 * @Date 2022/6/25 16:07
 * @Description: 选择排序
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ N-1 范围内取最小值放在0位置上
        // 1 ~ N-1 范围内取最小值放在1位置上
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;

            // i ~ N-1 取最小值放在i位置上
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            SortCommon.swap(arr, i, minValueIndex);
        }
    }


    public static void main(String[] args) {
        int[] arr = {6, 4, 7, 23, 54, 9, 39, 5, 76, 88};
        SortCommon.printArr(arr);
        selectionSort1(arr);
        SortCommon.printArr(arr);
    }


    // 0 ~ N-1 取最小值放在0位置上
    // 1 ~ N-1 取最小值放在1位置上
    public static void selectionSort1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int newNumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                newNumIndex = arr[j] < arr[newNumIndex] ? j : newNumIndex;
            }

            int tmp = arr[newNumIndex];
            arr[newNumIndex] = arr[i];
            arr[i] = tmp;
        }


        for (int i = 0; i < arr.length - 1; i++) {           //外层循环控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {     //内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }


}



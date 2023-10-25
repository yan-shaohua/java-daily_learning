package com.xxoo.common;

import com.xxoo.集合系列.List.ArrayList.ArrayListTest;

import java.util.*;

/**
 * @Author yanshaohua
 * @Date 2023/9/1 01:22
 * @Description: 返回指定范围内指定数量的随机数   count：返回的随机数的总数  min：随机数的最小数  max：随机数的最大数
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
        List<Integer> randomNumbers = generateRandomNumbers(30, 0, 200);
        System.out.println(randomNumbers);
    }

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        if (count > (max - min + 1) || max < min) {
            throw new IllegalArgumentException("Invalid range or count");
        }

        List<Integer> result = new ArrayList<>();
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();
        while (result.size() < count) {
            int randomNumber = random.nextInt(max - min + 1) + min; // 生成在指定范围内的随机整数
            if (!generatedNumbers.contains(randomNumber)) { // 检查是否已经包含该随机数
                generatedNumbers.add(randomNumber);
                result.add(randomNumber);
            }
        }

        return result;
    }




}

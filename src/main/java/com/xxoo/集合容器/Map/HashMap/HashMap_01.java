package com.xxoo.集合容器.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_01 {
    public static void main(String[] args) {
        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "Spring Mvc");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Spring Boot");
        // 遍历
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    }

}

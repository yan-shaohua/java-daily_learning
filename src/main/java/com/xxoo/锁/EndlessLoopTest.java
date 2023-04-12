package com.xxoo.锁;

/**
 * @Author yanshaohua
 * @Date 2023/3/16 14:55
 * @Description: 死锁代码
 */
public class EndlessLoopTest {

    public void test() {
        int random = (int) (Math.random() * 1000);
        while (random < 100) {
            random = random * 10;
        }
        System.out.println(random);
    }


    public static void main(String[] args) {
        EndlessLoopTest loopTest = new EndlessLoopTest();
        for (int i = 0; i < 5000; i++){
            loopTest.test();
        }

    }
}

package com;

public class P124 {
    public static void main(String[] args) {
        //100以内所有的质数
        int count=0;
        long start=System.currentTimeMillis();
        lable:for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue lable;
                }
            }
            //执行到此步骤的，都是质数
            count++;
        }
        long end=System.currentTimeMillis();
        System.out.println(count);
        System.out.println((end-start));
    }
}

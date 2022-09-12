package com;

public class P118 {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
        //100以内所有的质数
        boolean isflag = true;
        long start=System.currentTimeMillis();
        for (int i = 2; i <= 100; i++) {
//            boolean isflag = true;
//            for (int j = 2; j <i; j++) {
            for (int j = 2; j <=Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isflag = false;
                    break;
                }
            }
            if (isflag == true) {
                System.out.println(i);
            }
            isflag = true;
        }
        long end=System.currentTimeMillis();
        System.out.println((end-start));
    }
}

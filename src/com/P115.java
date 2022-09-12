package com;

import java.util.Scanner;

public class P115 {
    public static void main(String[] args) {
        /*
         * 从键盘读入不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
         * */
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        //while(true){
        for (; ; ) {
            System.out.println("请输入整数：");
            int j = sc.nextInt();
            if (j == 0) {
                break;
            } else if (j > 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("正数：" + count1 + ";负数：" + count2);

    }
}

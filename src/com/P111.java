package com;

import java.util.Scanner;

public class P111 {
    public static void main(String[] args) {
        //输入两个正整数，求它们最大公约数和最小公倍数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int num2 = sc.nextInt();
        //获取最大公约数
        //获取两个数中的较小值
        int min = (num1 <= num2) ? num1 : num2;
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
        //获取最小公倍数
        //获取两个数中的较大值
        int max = (num1 <= num2) ? num2 : num1;
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                break;
            }
        }
        //打印1-100之间所有奇数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-100之间所有奇数的和:" + sum);

        //打印1-100之间所有是7的倍数的整数的个数及总和
        int sum1 = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum1 += i;
                count++;
            }
        }
        System.out.println("个数："+count+";总和："+sum1);

        //输出所有的水仙花数，
        for(int i=100;i<1000;i++){
            int x=i%10;
            int y=i%100/10;
            int z=i/100;
            if (i==x*x*x+y*y*y+z*z*z){
                System.out.println(i);
            }

        }
    }
}

package com;

public class P114 {
    public static void main(String[] args) {
        /*do-while 至少执行一次循环体*/
        //遍历100以内的偶数,并计算所有偶数的和及偶数的个数
        int num = 1;
        int sum=0;
        int count=0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                count+=1;
                sum+=num;
            }
            num++;
        } while (num <= 100);
        System.out.println("总个数："+count+";"+"总和为："+sum);
    }
}

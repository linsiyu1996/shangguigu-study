package com;

/*
 * 方法的形参的传递机制：值传递
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 * 2.值传递机制：
 *  如果参数是基本数据类型，此时实参赋给形参的是，实参真实存储的数据值。
 *  如果参数是引用数据类型，此时实参赋给形参的是，实参存储数据的地址值。
 * */
public class P209 {
    public static void main(String[] args) {
        //交换两个变量的值的操作
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //交换两个变量的值的操作
//        int temp = m;
//        m = n;
//        n = temp;
        P209 test =new P209();
        test.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);
    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}

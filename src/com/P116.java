package com;

public class P116 {
    public static void main(String[] args) {
        /*
        *嵌套循环
        * 将一个循环结构a声明在另一个循环体中，就构成了嵌套循环
        * */
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");

    }
}

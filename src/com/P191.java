package com;
//3.1 编写一个10行8列的矩形
//3.2计算10行8列的矩形的面积
//3.3  编写一个m行n列的矩形,计算矩形的面积
public class P191 {
    public static void main(String[] args) {
        P191 test=new P191();
        System.out.println("矩形面积为："+test.method(3,4));
    }
    public int method(int m,int n){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }

}

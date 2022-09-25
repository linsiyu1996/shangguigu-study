package com;

/*
 * 1.方法的重载（overload）
 * 概念:在同一个类中，允许存在一个类以上的同名方法，只要它们的参数个数或者参数类型不同即可
 *   ”两同一不同“：同一个类，相同方法名
 *               参数列表不同：参数个数不同，参数类型不同
 * 特点：与返回值类型无关，只看参数列表，且参数列表必须不同。（参数个数或者参数类型）。调用时，根据方法参数列表的不同来区别
 * 2.示例：
 * 返回两个整数的和
 * int add(int x,int y){return x+y;}
 * 返回三个整数的和
 * int add(int x,int y，int z){return x+y+z;}
 * 返回两个小数的和
 * double add(double x,double y){return x+y;}
 * 3.判断是否是重载：
 * 跟方法的权限修饰符，返回值类型，形参变量名，方法体都没有关系
 * 4.在通过对象调用方法的时候，如何确定某一个指定的方法：
 * 方法名--》参数列表
 * */
public class P203 {
    public static void main(String[] args) {
        P203 test=new P203();
        test.getSum(1,2);
    }

    //如下的方法都构成重载
    public void getSum(int x, int y) {
        System.out.println("1:"+(x + y));
    }

    public void getSum(double i, double j) {
        System.out.println("2:"+(i + j));
    }

    public void getSum(String a, String b) {
        System.out.println("3:"+(a + b));
    }

    public void getSum(String a, int b) {
    }

    public void getSum(int a, String b) {

    }

//    public int getSum(int x, int y) {
//        return 0;
//    }
}

package com;

public class P147 {
    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        int[] arr=new int[]{1,2,3};
        //静态初始化
        int[][]arr1=new int[][]{{1,2,3},{6,7,5}};
        String[][] arr2=new String[3][2];
        String[][] arr3=new String[3][];
        int[] arr4[]=new int[][]{{1,2,3},{1,3,4}};
        int[] arr5[]={{22,34,2},{23,3}};
        //2.如何调用数组指定位置的元素
        System.out.println(arr1[0][1]);//2
        //3.如何获取数组的长度
        System.out.println(arr4.length);//2
        //4.如何遍历二维数组
        for (int i=0;i<arr4.length;i++){
            for (int j=0;j<arr4[i].length;j++){
                System.out.println(arr4[i][j]);
            }
        }
        //5.数组元素的默认初始值
        /*二维数组分为外层数组元素，内层数组元素
        int[][] arr=new int[4][3]
        外层元素： arr[0],arr[1]等
        内层元素： arr[0][0],arr[1][2]等
        针对于初始化方式一：比如 int[][] arr=new int[4][3]
        外层元素的初始化值：地址值
        内存元素的初始化值：与一维数组的初始化情况相同
        针对于初始化方式二：比如  int[][] arr=new int[4][]
        外层元素的初始化值为：null
        内层元素的初始化值为：不能调用，否则报错NullPointerException
        */
        int[][] arr6=new int[4][3];
        System.out.println(arr6[0]);//[I@1b6d3586
        System.out.println(arr6[0][0]);//0
        System.out.println(arr6);//[[I@4554617c
        System.out.println("******************");
        double[][] arr7=new double[4][];
        System.out.println(arr7[1]);//null
        System.out.println(arr7[1][1]);//NullPointerException
        //6)二维数组的内存解析
    }
}

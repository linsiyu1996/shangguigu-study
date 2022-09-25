package com;

public class P152 {
    public static void main(String[] args) {
        //1.写出一维数组初始化的两种方式
        int[] arr1=new int[2];
        int[] arr2;
        arr2=new int[]{1,2};
        //2.写出二维数组初始化的两种方式
        int[][] arr3=new int[2][3];
        int[][] arr4=new int[3][];
        //3.如何遍历如下的二维数组
        int[][] arr=new int[][]{{1,3,4},{4,5},{6,7,8}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        //不同类型的一维数组的默认初始值各位多少？
        //int：0,boolean：false;浮点型：0.0；引用类型：null；char：0
        //5.一维数组的内存解析
        String[] strs=new String[5];
        strs[2]="Tom";
        strs=new String[3];

    }
}

package com;

public class P170 {
    public static void main(String[] args) {
        /*
        * 数组中常见的异常
        * 1.数组角标越界异常：ArrayIndexOutOfBoundsException
        * 2.空指针异常：NullPointerException
        * */
        // 1.数组角标越界异常：ArrayIndexOutOfBoundsException
        int[] arr=new int[]{1,2,3,4,5};//[0,4]
//        for (int i=0;i<=arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[-2]);
        //2.空指针异常：NullPointerException
        //情况1
//        int[] arr1=new int[]{1,2,3};
//        arr1=null;
//        System.out.println(arr1[0]);
        //情况2
//        int[][] arr2=new int[4][];
//        System.out.println(arr2[0]);//null
//        System.out.println(arr2[0][0]);
        //情况3
        String[] arr3=new String[]{"aa","bb","cc"};
        arr3[0]=null;
        System.out.println(arr3[0].toString());
    }
}

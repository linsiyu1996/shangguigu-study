package com;
import java.util.Arrays;
public class P169 {
    public static void main(String[] args) {
        /*
        * java.util.Arrays
        * */
        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,2,4,3};
        boolean isEquals=Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
        //2.String.toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));
        //3.void fill(int[] a,int val)：指定值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4.void sort(int[] a):对数组进行排序。
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //5.int binarySearch(int[] a,int key)
        int[] arr3=new int[]{34,25,-4,5,2,7,98,-45,66,25,-99};
        int index=Arrays.binarySearch(arr3,66);
        if(index>=0) {
            System.out.println(index);
        }else {
            System.out.println("没找到");
        }
    }
}

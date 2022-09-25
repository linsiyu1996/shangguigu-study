package com;

public class P165 {
    public static void main(String[] args) {
        //排序算法的分类：内部排序和外部排序
        /*十大内部排序算法：
        *选择排序：直接选择排序，堆排序
        * 交换排序：冒泡排序，快速排序
        * 插入排序：直接插入排序，折半插入排序，希尔排序
        * 归并排序
        * 桶式排序
        * 基数排序
        * */
        //数组的冒泡排序
        int[] arr=new int[]{34,25,-4,5,2,7,98,-45,66,25,-99};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //快速排序

    }
}

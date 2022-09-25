package com;
import java.util.Arrays;
public class P172 {
    public static void main(String[] args) {
        //1.使用冒泡排序，实现如下的数组从小到大排序
        int[] arr=new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //2.如何反转上面的数组。请代码实现
        int[] arr1=new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i=0;i<arr1.length/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-1-i];
            arr1[arr1.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr1));
        //3.复制上述数组，得到一个新的数组
        int[] arr2=new int[]{34,5,22,-98,6,-76,0,-3};
        int[] arr3=new int[arr2.length];
        for (int i=0;i<arr3.length;i++){
            arr3[i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        //使用线性查找，从上述数组中查找22是否存在，存在则返回所在位置的索引，不存在则输出提示信息
        int dest=22;
        boolean isFlag=true;
        for (int i=0;i<arr2.length;i++){
            if (arr[i]==dest){
                System.out.println("指定元素所在的索引为："+i);
                isFlag=false;
                break;
            }
        }
        if (isFlag){
            System.out.println("指定元素没有找到");
        }
        //5.数组中常见的异常有哪些？
        //数组角标越界异常
        //空指针异常
    }
}

package com;

public class P161 {
    public static void main(String[] args) {
        String[] arr = new String[]{"jj", "dd", "bb", "mm", "gg", "nn", "yy"};
        //数组的复制(区别于数组变量的赋值：arr1=arr)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        //数组的反转
//        //方法1：
//        for (int i=0;i<arr.length/2;i++){
//            String temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
//        //方法2：
//        for (int i=0,j=arr.length-1;i<j;i++,j--){
//            String temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        //数组的查找
        //线性查找
        String dest = "bb";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定元素:"+dest+"，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("很遗憾，没有找到！");
        }
        //二分法查找
        //前提，所要查找的数组必须有序。
        int[] arr2=new int[]{-98,-34,2,24,34,54,66,78,99,134,678};
        int dest1=34;
        int head=0;//初始的首索引
        int end=arr2.length-1;//初始的末索引
        boolean isFlag1=true;
        while(head<=end){
            int mid=(head+end)/2;
            if(dest1==arr2[mid]){
                System.out.println("找到了指定元素:"+dest+"，位置为：" + mid);
                isFlag1=false;
                break;
            }else if (arr2[mid]>dest1){
                end=mid-1;
            }else {//arr2[mid]<dest1
                head=mid+1;
            }
        }
        if (isFlag1){
            System.out.println("很遗憾，没有找到！");
        }
    }
}

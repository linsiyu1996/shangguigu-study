package com;

public class P160 {
    public static void main(String[] args) {
        /*
        * 使用简单数组
        * （1）创建一个类，在main（）方法中声明两个变量arr1，arr2，他们是int[]类型的数组；
        * （2）使用大括号{}，把arr1初始化8个素数2, 3, 5, 7, 11, 13, 17, 19。
        * （3）显示arr1的内容
        * （4）赋值arr2变量等于arr1，修改arr2中的偶索引元素，使其等于索引值
        * 思考：arr1和arr2是什么关系？//arr1和aar2的地址值相同，都指向了堆空间的唯一的数组实体
        * 拓展：修改题目，实现arr2对arr1数组复制
        * */
        int[] arr1, arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //显示arr1内容
        System.out.print("arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //赋值arr2变量等于arr1
        //不能称为数组的复制
        arr2 = arr1;
        //修改arr2中的偶索引元素，使其等于索引值
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
        }
        //显示arr1和arr2内容
        System.out.print("arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("arr2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();
        /*
        * 拓展：修改题目，实现arr2对arr1数组复制
        * */

        int[] arr3, arr4;
        arr3 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //显示arr1内容
        System.out.print("arr3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
        System.out.println();
        //赋值arr2变量等于arr1
        //数组的复制
        arr4=new int[arr3.length];
        for (int i=0;i<arr4.length;i++){
            arr4[i]=arr3[i];
        }
        //修改arr2中的偶索引元素，使其等于索引值
        for (int i = 0; i < arr4.length; i++) {
            if (i % 2 == 0) {
                arr4[i] = i;
            }
        }
        //显示arr1和arr2内容
        System.out.print("arr3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
        System.out.println();
        System.out.print("arr4:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + "  ");
        }

    }
}

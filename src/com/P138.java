package com;
/*
* 1、数组的特点：
* 1）数组是有序排列的
* 2）数组属于引用数据类型变量，数组的元素既可以是基本数据类型，也可以是引用数据类型
* 3）创建数组对象在内存中开辟一整块连续的空间
* 4）数组的长度一旦确定后，就不能修改
* 2、一维数组的使用
* 1）一维数组的声明和初始化
* 2）如何调用数组的指定位置元素
* 3）如何获取数组的长度
* 4）如何遍历数组
* 5）数组元素的默认初始化值
*       》数组元素是整型：0
*       》数组元素是布尔类型：false
*       》数组元素是浮点型：0.0
*       》数组元素是char型：0或’\u0000‘
*
*       》数组类型是引用数据类型：null
* 6）数组的内存解析
* */
public class P138 {
    public static void main(String[] args) {
        //1)一维数组的声明和初始化
        int num;//声明
        num=10;//初始化
        int id=1001;//声明+初始化

        int[] ids;//声明
        //1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=new int[]{1001,1002,1003,1004};
        //1.2动态初始化；数组的初始化和数组元素的赋值操作分开进行
        String[] names=new String[5];

        //2）如何调用数组的指定位置元素
        //数组的角标（或索引）从0开始，到数组的长度-1结束
        names[0]="小明";
        names[1]="小兰";
        names[2]="小黄";
        names[3]="小红";
        names[4]="小新";
        //3）如何获取数组的长度
        //属性：length
        System.out.println(names.length);
        System.out.println(ids.length);
        //4）如何遍历数组
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        //5）数组元素的默认初始化值
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //6)数组的内存解析
    }
}

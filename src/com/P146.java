package com;

import java.util.Scanner;

public class P146 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入学生数:");
        int num= sc.nextInt();
        System.out.println("请输入"+num+"个成绩：");
        int grade1= sc.nextInt();
        int grade2= sc.nextInt();
        int grade3= sc.nextInt();
        int grade4= sc.nextInt();
        int grade5= sc.nextInt();
        int[] arr= new int[num];
//        arr=new int[]{1001,1002,1003,1004};
        arr[0]=grade1;
        arr[1]=grade2;
        arr[2]=grade3;
        arr[3]=grade4;
        arr[4]=grade5;
        int grade_max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>grade_max){
                grade_max=arr[i];
            }
        }
        System.out.println("最高分是："+grade_max);
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=grade_max-10){
                System.out.println("第"+i+"个学生成绩等级是：A");
            } else if (arr[i]>=grade_max-20) {
                System.out.println("第"+i+"个学生成绩等级是：B");
            }else if (arr[i]>=grade_max-30) {
                System.out.println("第"+i+"个学生成绩等级是：C");
            }else {
                System.out.println("第"+i+"个学生成绩等级是：D");
            }
        }
    }
}

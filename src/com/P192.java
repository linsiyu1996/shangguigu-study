package com;

public class P192 {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            //给数组元素赋值
            stu[i] = new Student();
            stu[i].number = i + 1;
            //(int)(Math.random()*(max-min+1)+min)
            stu[i].state = (int) (1 + Math.random() * (6 - 1 + 1));
            stu[i].socre = (int) (Math.random() * (100 + 1));

        }
        for (int i = 0; i < stu.length; i++) {
            stu[i].stuinfo(3);
        }
        for (int i=0;i<stu.length;i++){
            for (int j=0;j<stu.length-1-i;j++){
                if(stu[j].socre>stu[j+1].socre){
                    //如果需要换序，交换的是数组元素，student对象
                    Student temp=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;
                }
            }
        }
    }
}

class Student {
    int number;
    int state;
    int socre;

    public void stuinfo(int deststate) {
        if (state == deststate) {
            System.out.println("学号：" + number + ",年级：" + state + ",成绩：" + socre);
        }
    }

}
package com;

public class P122 {
    public static void main(String[] args) {
        /*
        break：结束当前循环
        continue：结束当次循环
         */
        lable:for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 4 == 0) {
//                break;//1,2,3  默认跳出包裹此关键字最近的一层循环
//                continue;//1,2,3,5,6,7,9,10
//                break lable;//结束指定标识的一层循环结构
//                continue lable;//结束指定标识的一层循环结构当次循环
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

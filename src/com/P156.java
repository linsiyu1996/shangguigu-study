package com;

public class P156 {
    public static void main(String[] args) {
        //问题1:arr数组中所有元素的和
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("arr数组中所有元素的和为：" + sum);
        //问题：使用二维数组打印一个10行杨辉三角
        int[][] arr1 = new int[10][];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i + 1];
            arr1[i][0] =arr1[i][i] =1;
            if (i>1){
                for (int j=1;j<arr1[i].length-1;j++){
                    arr1[i][j] = arr1[i - 1][j - 1] + arr1[i - 1][j];
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

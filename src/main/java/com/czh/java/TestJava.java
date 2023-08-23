package com.czh.java;

public class TestJava {
    public static void main(String[] args) {
//        Integer i =128;
//        Integer i2 = 128;
//        Integer j =127;
//        Integer j2 = 127;
//        System.out.println(i == i2);
//        System.out.println(j == j2);


        //输出等腰三角形
        int n = 5;//定义等要三角形的总行数
        //输出总行数
        for(int i = 1;i <= n; i++) {
            //输出每行空格   呈递减状态
            for(int j = 1;j <= n - i; j++) {
                System.out.print(" ");
            }
            //输出每行*，递增状态
            //第一行1个*   第二行3个* 第n行2n-1个*
            for(int k = 1; k <= 2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();//每行输出后加换行
        }


    }
}

//编号：L1-013
//题目：计算阶乘和
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805127389495296
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-29
//指导老师：吴光生-新余学院

/* 
题目描述：
对于给定的正整数N，需要你计算 S=1!+2!+3!+...+N!。
*/

/* 
输入格式：
输入在一行中给出一个不超过10的正整数N。
*/

/* 
输出格式：
在一行中输出S的值。
*/

/*
输入样例:
3
*/

/* 
输出样例:
9
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
利用递归的思想，将录入的数从1开始放如递归中。
*/

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;// 创建一个变量表示结果

        // 索引从1开始，录入数结束
        for (int i = 1; i <= number; i++) {
            result = result + add(i);
        }
        System.out.println(result);
    }

    // 递归挨个相乘
    public static int add(int a) {
        if (a == 1) {
            return 1;
        }
        return add(a - 1) * a;
    }

}

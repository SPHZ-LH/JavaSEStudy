//编号：L1-010
//题目：比较大小
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805132040978432
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-13
//指导老师：吴光生-新余学院

/* 
题目描述：
本题要求将输入的任意3个整数从小到大输出。
*/

/* 
输入格式：
输入在一行中给出3个整数，其间以空格分隔。
*/

/* 
输出格式：
在一行中将3个整数从小到大输出，其间以“->”相连。
*/

/*
输入样例:
4 2 8
*/

/* 
输出样例:
2->4->8
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
利用sort方法可以快速排序
*/

import java.util.Arrays;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        // 利用循环给每个数组进行赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays快速排序
        Arrays.sort(arr);
        // 遍历打印
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + "->");
            }
        }
    }
}

//编号：L1-004
//题目：计算摄氏温度
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805142086336512
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-28
//指导老师：吴光生-新余学院

/* 
题目描述：
给定一个华氏温度F，本题要求编写程序，计算对应的摄氏温度C。计算公式：C=5×(F−32)/9。题目保证输入与输出均在整型范围内。
*/

/* 
输入格式：
输入在一行中给出一个华氏温度。
*/

/* 
输出格式：
在一行中按照格式“Celsius = C”输出对应的摄氏温度C的整数值。
*/

/*
输入样例:
150
*/

/* 
输出样例:
Celsius = 65
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Celsius = " + 5 * (number - 32) / 9);
    }
}

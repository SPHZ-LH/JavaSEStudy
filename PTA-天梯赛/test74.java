//编号：L1-074
//题目：两小时学完C语言
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1386335159927652353
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-09
//指导老师：吴光生-新余学院

/* 
题目描述：
知乎上有个宝宝问：“两个小时内如何学完 C 语言？”当然，问的是“学完”并不是“学会”。
假设一本 C 语言教科书有 N 个字，这个宝宝每分钟能看 K 个字，看了 M 分钟。还剩多少字没有看？
*/

/* 
输入格式：
输入在一行中给出 3 个正整数，分别是 N（不超过 400 000），教科书的总字数；K（不超过 3 000），
是宝宝每分钟能看的字数；M（不超过 120），是宝宝看书的分钟数。
题目保证宝宝看完的字数不超过 N。
*/

/* 
输出格式：
在一行中输出宝宝还没有看的字数。
*/

/*
输入样例:
100000 1000 72
*/

/* 
输出样例:
28000
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

import java.util.Scanner;

public class test74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zongshu = sc.nextInt();
        int sulv = sc.nextInt();
        int count = sc.nextInt();
        System.out.println(zongshu - sulv * count);
    }
}

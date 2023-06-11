//编号：L1-077
//题目：大笨钟的心情
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1386335159927652356
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-09
//指导老师：吴光生-新余学院

/* 
题目描述：
有网友问：未来还会有更多大笨钟题吗？笨钟回复说：看心情……
本题就请你替大笨钟写一个程序，根据心情自动输出回答。
*/

/* 
输入格式：
输入在一行中给出 24 个 [0, 100] 区间内的整数，依次代表大笨钟在一天 24 小时中，每个小时的心情指数。

随后若干行，每行给出一个 [0, 23] 之间的整数，代表网友询问笨钟这个问题的时间点。
当出现非法的时间点时，表示输入结束，这个非法输入不要处理。题目保证至少有 1 次询问。
*/

/* 
输出格式：
对每一次提问，如果当时笨钟的心情指数大于 50，就在一行中输出 心情指数 Yes，否则输出 心情指数 No。
*/

/*
输入样例:
80 75 60 50 20 20 20 20 55 62 66 51 42 33 47 58 67 52 41 20 35 49 50 63
17
7
3
15
-1
*/

/* 
输出样例:
52 Yes
20 No
50 No
58 Yes
*/

// 代码长度限制
// 16 KB
// Java (javac)
// 时间限制
// 600 ms
// 内存限制
// 64 MB
// 其他编译器
// 时间限制
// 400 ms
// 内存限制
// 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
首先利用集合或者数组将数据存入，索引为存入的顺序，然后输入索引进行比较
*/

import java.util.ArrayList;
import java.util.Scanner;

public class test77 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            list.add(sc.nextInt());
        }

        // 利用while循环，当索引不符合条件时，循环结束
        while (true) {
            int count = sc.nextInt();
            // 索引的条件是[0,23]
            if (count >= 0 && count <= 23) {
                Integer number = list.get(count);
                if (number > 50) {
                    System.out.println(number + " Yes");
                } else {
                    System.out.println(number + " No");
                }
            } else {// 索引条件不符合直接结束循环
                break;
            }
        }
    }
}

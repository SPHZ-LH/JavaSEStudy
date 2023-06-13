//编号：L1-044
//题目：稳赢
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805086365007872
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-11
//指导老师：吴光生-新余学院

/* 
题目描述：
大家应该都会玩“锤子剪刀布”的游戏：两人同时给出手势，胜负规则如图所示：
现要求你编写一个稳赢不输的程序，根据对方的出招，给出对应的赢招。但是！为了不让对方输得太惨，你需要每隔K次就让一个平局。
*/

/* 
输入格式：
输入首先在第一行给出正整数K（≤10），即平局间隔的次数。随后每行给出对方的一次出招：
ChuiZi代表“锤子”、JianDao代表“剪刀”、Bu代表“布”。End代表输入结束，这一行不要作为出招处理。
*/

/* 
输出格式：
对每一个输入的出招，按要求输出稳赢或平局的招式。每招占一行。
*/

/*
输入样例:
2
ChuiZi
JianDao
Bu
JianDao
Bu
ChuiZi
ChuiZi
End
*/

/* 
输出样例:
Bu
ChuiZi
Bu
ChuiZi
JianDao
ChuiZi
Bu
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
我多次尝试用Scanner都发现超时，因此使用BufferedReader。
利用while循环，当录入的是End时结束可以使用equals或者startsWith
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test44 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int number = 0;
        while (true) {
            String str = br.readLine();
            number++;

            // startsWith是检验字符串开始时的字符
            if (str.startsWith("E")) {
                return;
            }

            
            if (number % (count + 1) == 0) {
                System.out.println(str);
            } else if (str.startsWith("C")) {
                System.out.println("Bu");
            } else if (str.startsWith("J")) {
                System.out.println("ChuiZi");
            } else {
                System.out.println("JianDao");
            }
        }
    }
}

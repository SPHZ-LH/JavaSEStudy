//编号：L1-078
//题目：吉老师的回归
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1386335159927652357
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-04
//指导老师：吴光生-新余学院

/* 
题目描述：
曾经在天梯赛大杀四方的吉老师决定回归天梯赛赛场啦！
为了简化题目，我们不妨假设天梯赛的每道题目可以用一个不超过 500 的、
只包括可打印符号的字符串描述出来，如：Problem A: Print "Hello world!"。
众所周知，吉老师的竞赛水平非常高超，你可以认为他每道题目都会做（事实上也是……）。
因此，吉老师会按照顺序看题并做题。但吉老师水平太高了，所以签到题他就懒得做了（浪费时间），
具体来说，假如题目的字符串里有 qiandao 或者 easy（区分大小写）的话，吉老师看完题目就会跳过这道题目不做。
现在给定这次天梯赛总共有几道题目以及吉老师已经做完了几道题目，请你告诉大家吉老师现在正在做哪个题，或者吉老师已经把所有他打算做的题目做完了。
提醒：天梯赛有分数升级的规则，如果不做签到题可能导致团队总分不足以升级，一般的选手请千万不要学习吉老师的酷炫行为！
*/

/* 
输入格式：
输入第一行是两个正整数 N,M (1≤M≤N≤30)，表示本次天梯赛有 N 道题目，吉老师现在做完了 M 道。
接下来 N 行，每行是一个符合题目描述的字符串，表示天梯赛的题目内容。吉老师会按照给出的顺序
看题——第一行就是吉老师看的第一道题，第二行就是第二道，以此类推。

输出格式：
在一行中输出吉老师当前正在做的题目对应的题面（即做完了 M 道题目后，吉老师正在做哪个题）。如果吉老师已经把所有他打算做的题目做完了，输出一行 Wo AK le。
*/

/*
输入样例1:
5 1
L1-1 is a qiandao problem.
L1-2 is so...easy.
L1-3 is Easy.
L1-4 is qianDao.
Wow, such L1-5, so easy.
*/

/* 
输出样例1:
L1-4 is qianDao.
*/

/*
输入样例2:
5 4
L1-1 is a-qiandao problem.
L1-2 is so easy.
L1-3 is Easy.
L1-4 is qianDao.
Wow, such L1-5, so!!easy.
*/

/* 
输出样例2:
Wo AK le
*/
//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
键盘录入，然后进行比较字符串是否符合要求，
*/

import java.util.Scanner;

public class test78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;// 定义一个变量表示不能跳过的题目
        sc.nextLine();// 此处消除键盘录入的缓冲区
        for (int i = 0; i < number; i++) {
            String str = sc.nextLine();
            // 检验键盘录入的字符串是否符合要求
            if (str.contains("qiandao") || str.contains("easy")) {
                continue;// 符合结束此次循环，进行下一次循环
            } else {
                count++;
            }

            // 当不能跳过的题目大于完成的题目时，打印字符串，并且结束main方法
            if (count > num) {
                System.out.println(str);
                return;
            }
        }
        System.out.println("Wo AK le");
    }
}

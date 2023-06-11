//编号：L1-041
//题目：寻找250
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805089657536512
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-03
//指导老师：吴光生-新余学院

/* 
题目描述：
对方不想和你说话，并向你扔了一串数…… 而你必须从这一串数字中找到“250”这个高大上的感人数字。
*/

/* 
输入格式：
输入在一行中给出不知道多少个绝对值不超过1000的整数，其中保证至少存在一个“250”。
*/

/* 
输出格式：
在一行中输出第一次出现的“250”是对方扔过来的第几个数字（计数从1开始）。
题目保证输出的数字在整型范围内。
*/

/*
输入样例:
888 666 123 -233 250 13 250 -222
*/

/* 
输出样例:
5
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
利用whill循环，再将每个字符与需要查询的字符进行比较。
*/
import java.util.Scanner;

public class test41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            String str = sc.next();
            if (str.equals("250")) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}

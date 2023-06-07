//编号：L1-008
//题目：求整数段和
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805135224455168
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-28
//指导老师：吴光生-新余学院

/* 
题目描述：
给定两个整数A和B，输出从A到B的所有整数以及这些数的和。
*/

/* 
输入格式：
输入在一行中给出2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔。
*/

/* 
输出格式：
首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。
最后在一行中按Sum = X的格式输出全部数字的和X。
*/

/*
输入样例:
-3 8
*/

/* 
输出样例:
   -3   -2   -1    0    1
    2    3    4    5    6
    7    8
Sum = 30
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
利用循环遍历输出，创建一个布尔值，当遍历五次的倍数循环结束，输出结果时不换行，反之亦然
*/
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hmNumber = sc.nextInt();
        int endNumber = sc.nextInt();
        int result = 0;// 创建一个变量表示数字的和
        int count = 1;// 创建一个变量表示打印数字的次数
        boolean flag = true;// 定义一个布尔变量表示打印最终值前是否需要换行

        // 从第一个录入的数开始遍历到第二个录入的数
        for (int i = hmNumber; i <= endNumber; i++, count++) {
            // 每次循环初始值定义为需要换行
            flag = true;
            System.out.printf("%5d", i);// 每个数字占5个字符宽度，向右对齐。
            result = result + i;// 每次累加数字的和

            // 如果当打印了五次数字换行
            if (count % 5 == 0) {
                System.out.println();
                flag = false;// 当换行了布尔改为false
            }
        }

        if (flag) {
            System.out.println();
        }
        System.out.println("Sum = " + result);
    }
}

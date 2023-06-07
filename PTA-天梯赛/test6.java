//编号：L1-006
//题目：连续因子
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805138600869888
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-28
//指导老师：吴光生-新余学院

/* 
题目描述：
一个正整数 N 的因子中可能存在若干连续的数字。
例如 630 可以分解为 3×5×6×7，其中 5、6、7 就是 3 个连续的数字。
给定任一正整数 N，要求编写程序求出最长连续因子的个数，并输出最小的连续因子序列。
*/

/* 
输入格式：
输入在一行中给出一个正整数 N（1<N<2^31）。
*/

/* 
输出格式：
首先在第 1 行输出最长连续因子的个数；然后在第 2 行中按 因子1*因子2*……*因子k 的
格式输出最小的连续因子序列，其中因子按递增顺序输出，1 不算在内。
*/

/*
输入样例:
630
*/

/* 
输出样例:
3
5*6*7
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
利用二分查找思路，提高代码运行效率，判断输入的值是否为素数。
判断nun1是否为num2的因子，只需要判断余数是否为零足以，是则为因子。
*/

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int putNumber = sc.nextInt();
        double sqrt = Math.sqrt(putNumber);// 利用二分查找思想提高运行效率
        boolean flag = judgment(putNumber, sqrt);// 判断是否为素数
        if (!flag) {
            int max = 0; // 定义一个变量用于比较连续因子的长度
            int HM = 1;// 定义一个变量表示最长的因子式开始值

            // 外循环确定内循环连续因子的开始值，循环次数
            for (int i = 2; i <= sqrt; i++) {
                int count = 0;// 定义一个变量表示内循环连续因子的长度,外循环一次重新计数
                int result = 1;// 定义一个变量表示内循环连续因子的总值，外循环一次重新计数

                // 内循环确定连续函数的结束值与长度
                for (int j = i; putNumber % (result * j) == 0; j++) {
                    count++;// 内循环一次连续因子长度加1
                    result = result * j;// 内循环一次总值变大一次
                }

                // 循环一次判断是否为当前最长因子式
                if (max < count) {
                    max = count;
                    HM = i;
                }
            }
            System.out.println(max);
            for (int i = HM; i < HM + max; i++) {
                if (i == (HM + max - 1)) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "*");
                }
            }
        } else {
            System.out.println(1);
            System.out.println(putNumber);
        }
    }

    private static boolean judgment(int putNumber, double sqrt) {
        for (int i = 2; i < sqrt; i++) {// 素数是除去1和本身的数
            if (putNumber % i == 0) {
                return false;// 除去1和本身有其他因子，返回false
            }
        }
        return true;
    }
}

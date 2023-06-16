//编号：L1-028
//题目：判断素数
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805106325700608
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-16
//指导老师：吴光生-新余学院

/* 
题目描述：
本题的目标很简单，就是判断一个给定的正整数是否素数。
*/

/* 
输入格式：
输入在第一行给出一个正整数N（≤ 10），随后N行，每行给出一个小于2^31的需要判断的正整数。
*/

/* 
输出格式：
对每个需要判断的正整数，如果它是素数，则在一行中输出Yes，否则输出No。
*/

/*
输入样例:
2
11
111
*/

/* 
输出样例:
Yes
No
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：200 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

import java.util.Scanner;

public class test28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (decide(sc.nextInt())) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }

    // 定义一个方法判断是否为素数
    public static boolean decide(int number) {
        // 最小的素数为2
        if (number < 2) {
            return false;
        } else {
            // 利用二分查找判断，提高运行效率
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
//编号：L1-025
//题目：正整数A+B
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805110318678016
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-08
//指导老师：吴光生-新余学院

/* 
题目描述：
题的目标很简单，就是求两个正整数A和B的和，其中A和B都在区间[1,1000]。稍微有点麻烦的是，输入并不保证是两个正整数。
*/

/* 
输入格式：
输入在一行给出A和B，其间以空格分开。问题是A和B不一定是满足要求的正整数，有时候可能是超出范围的数字、负数、带小数点的实数、甚至是一堆乱码。
注意：我们把输入中出现的第1个空格认为是A和B的分隔。题目保证至少存在一个空格，并且B不是一个空字符串。
*/

/* 
输出格式：
如果输入的确是两个正整数，则按格式A + B = 和输出。如果某个输入不合要求，则在相应位置输出?，显然此时和也是?。
*/

/*
输入样例1:
123 456
*/

/* 
输出样例1:
123 + 456 = 579
*/

/*
输入样例2:
22. 18
*/

/* 
输出样例2:
? + 18 = ?
*/

/*
输入样例3:
-100 blabla bla...33
*/

/* 
输出样例3:
? + ? = ?
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
本题需要的条件比较多，利用正则表达式可以快速挑选出符合条件的字符串
*/

import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "([1-9]\\d{0,2}|1000)";
        /*
         * ([1-9]\\d{0,2}|1000) 表示匹配 1-999 中的任意一个数字，或者匹配数字 1000
         * [1-9] 表示匹配 1-9 中的任意一个数字
         * \\d{0,2} 表示匹配 0 个到 2 个数字
         * | 表示或者
         * 1000 表示匹配数字 1000
         */
        String s = sc.nextLine();

        /*
         * 注意：我们把输入中出现的第1个空格认为是A和B的分隔。
         * 题目保证至少存在一个空格，并且B不是一个空字符串。
         */
        String[] split = s.split(" ", 2);
        // 将字符串分为两份

        boolean flag1 = split[0].matches(str);
        boolean flag2 = split[1].matches(str);

        // 进行分类讨论
        method(split, flag1, flag2);
    }

    private static void method(String[] split, boolean flag1, boolean flag2) {
        if (flag1 && flag2) {
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (flag1 && !flag2) {
            int num1 = Integer.parseInt(split[0]);
            System.out.println(num1 + " + ? = ?");
        } else if (flag2 && !flag1) {
            int num2 = Integer.parseInt(split[1]);
            System.out.println("? + " + num2 + " = ?");
        } else {
            System.out.println("? + ? = ?");
        }
    }
}

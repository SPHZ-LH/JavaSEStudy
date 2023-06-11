//编号：L1-037
//题目：念数字
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805094485180416
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-31
//指导老师：吴光生-新余学院

/* 
题目描述：
真的是简单题哈 —— 给定两个绝对值不超过100的整数A和B，要求你按照“A/B=商”的格式输出结果。
*/

/* 
输入格式：
输入在第一行给出两个整数A和B（−100≤A,B≤100），数字间以空格分隔。
*/

/* 
输出格式：
在一行中输出结果：如果分母是正数，则输出“A/B=商”；如果分母是负数，则要用括号把分母括起来输出；
如果分母为零，则输出的商应为Error。输出的商应保留小数点后2位。
*/

/*
输入样例1:
-1 2
*/

/* 
输出样例1:
-1/2=-0.50
*/

/*
输入样例2:
1 -3
*/

/* 
输出样例2:
1/(-3)=-0.33
*/

/*
输入样例3:
5 0
*/

/* 
输出样例3:
5/0=Error
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
本题考验的时键盘录入的基本数据类型之间的转换
*/
import java.util.Scanner;

public class test37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 键盘录入的数需要时double类型，如若是int类型运算时小数部分会省略
        double fensi = sc.nextDouble();
        double fenmu = sc.nextDouble();
        double replace = fensi / fenmu;
        if (fenmu > 0) {
            System.out.print((int) (fensi) + "/" + (int) (fenmu) + "=");
            System.out.printf("%.2f", replace);
        } else if (fenmu < 0) {
            System.out.print((int) (fensi) + "/(" + (int) (fenmu) + ")=");
            System.out.printf("%.2f", replace);
        } else {
            System.out.println((int) (fensi) + "/" + (int) (fenmu) + "=Error");
        }
    }
}

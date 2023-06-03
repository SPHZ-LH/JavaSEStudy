//编号：L1-002 
//题目：打印沙漏
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805145370476544
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-28
//指导老师：吴光生-新余学院

/* 
题目描述：
本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印

*****
 ***
  *
 ***
*****
所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。
给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
*/

/* 
输入格式：
输入在一行给出1个正整数N（≤1000）和一个符号，中间以空格分隔。
*/

/* 
输出格式：
首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。
*/

/*
输入样例:
19 *
*/

/* 
输出样例:
*****
 ***
  *
 ***
*****
2
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 输入符号数量
        char c = scanner.next().charAt(0); // 输入符号

        int rows = 1; // 初始沙漏形状的行数
        int maxStars = 1; // 初始每行最多的符号数量
        int result = 1;// 初始最多可以设置的符号数量
        // 计算沙漏形状的行数和每行最多的符号数量
        while (result <= n) {
            rows++;
            maxStars = 2 * rows - 1;
            result = result + maxStars * 2;
        }
        result = result - maxStars * 2;// 最多可以设置的符号数量
        rows--;// 沙漏形状的行数
        maxStars = 2 * rows - 1;// 每行最多的符号数量

        // 输出沙漏形状
        for (int i = rows; i >= 1; i--) {
            int stars = maxStars; // 当前行的符号数量
            int spaces = rows - i; // 当前行前面的空格数量

            // 输出前面的空格
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 输出符号
            for (int j = 0; j < stars; j++) {
                System.out.print(c);
            }

            // 符号每次减2
            if (maxStars - 2 >= 1) {
                maxStars = maxStars - 2;
            }

            System.out.println(); // 换行
        }

        // 第一行不用输入，直接从第二行开始
        for (int i = 2; i <= rows; i++) {
            // 第一次没有运行，符号直接从3个开始
            maxStars = maxStars + 2;
            int stars = maxStars; // 当前行的符号数量
            int spaces = rows - i; // 当前行前面的空格数量

            // 输出前面的空格
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 输出符号
            for (int j = 0; j < stars; j++) {
                System.out.print(c);
            }

            System.out.println(); // 换行
        }

        System.out.println(n - result); // 输出剩余符号数量
    }
}
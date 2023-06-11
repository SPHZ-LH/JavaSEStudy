//编号：L1-062
//题目：幸运彩票
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1111914599412858883
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-03
//指导老师：吴光生-新余学院

/* 
题目描述：
彩票的号码有 6 位数字，若一张彩票的前 3 位上的数之和等于后 3 位上的数之和，
则称这张彩票是幸运的。本题就请你判断给定的彩票是不是幸运的。
*/

/* 
输入格式：
输入在第一行中给出一个正整数 N（≤ 100）。随后 N 行，每行给出一张彩票的 6 位数字。
*/

/* 
输出格式：
对每张彩票，如果它是幸运的，就在一行中输出 You are lucky!；否则输出 Wish you good luck.。
*/

/*
输入样例:
2
233008
123456
*/

/* 
输出样例:
You are lucky!
Wish you good luck.
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
键盘录入，分别窃取前3个字符串和后3个字符串，然后将字符串挨个转换成整数类型进行相加
*/
import java.util.Scanner;

public class test62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            String str = sc.next();
            extracted(str);// 引用方法，重复利用代码
        }

    }

    private static void extracted(String str) {
        // 利用substring截取前3个字符串，和后3个字符串
        String hmStr = str.substring(0, 3);
        String endStr = str.substring(3);

        // 将字符串转换成字符数组
        char[] hmArr = hmStr.toCharArray();
        char[] endArr = endStr.toCharArray();
        int hm = 0;// 创建一个变量表示前3个字符的和
        int end = 0;// 创建一个变量表示后3个字符的和
        for (int i = 0; i < hmArr.length; i++) {
            int c = hmArr[i] - '0';// 将字符转变为int类型
            hm = hm + c;
        }
        for (int i = 0; i < endArr.length; i++) {
            int c = endArr[i] - '0';
            end = end + c;
        }
        if (hm == end) {
            System.out.println("You are lucky!");
        } else {
            System.out.println("Wish you good luck.");
        }
    }
}

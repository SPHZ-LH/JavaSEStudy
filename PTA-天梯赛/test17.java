//编号：L1-017
//题目：到底有多二
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805121500692480
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-01
//指导老师：吴光生-新余学院

/* 
题目描述：
一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。
如果这个数是负数，则程度增加0.5倍；如果还是个偶数，则再增加1倍。
例如数字-13142223336是个11位数，其中有3个2，并且是负数，也是偶数，
则它的犯二程度计算为：3/11×1.5×2×100%，约为81.82%。
本题就请你计算一个给定整数到底有多二。
*/

/* 
输入格式：
输入第一行给出一个不超过50位的整数N。
*/

/* 
输出格式：
在一行中输出N犯二的程度，保留小数点后两位。
*/

/*
输入样例:
-13142223336
*/

/* 
输出样例:
81.82%
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
根据题意需要输入不超过50位的整数，那么nextInt()与nextLong()不太适合，
因此本题采用将录入字符串的方式。将题目要求一个一个写成方法，最后将多种
情况进行分类讨论。
*/
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lenStr = str.length();// 计算字符串的长度
        int bit = bit(str);// 计算整数的长度
        double parity = parity(str);// 计算是否为偶数的返回值
        int num = num(str, lenStr);// 计算字符串包含2的个数
        if (flag(str)) {// 如果为负数
            double result = ((double) (num) / (double) (bit)) * 1.5 * parity * 100;
            System.out.printf("%.2f%%", result);
        } else {// 如果为正数
            double result = ((double) (num) / (double) (bit)) * parity * 100;
            System.out.printf("%.2f%%", result);
        }
    }

    // 因为要多次判断整数是否为负数，因此写成方法方便引用
    private static boolean flag(String str) {
        return str.charAt(0) == '-';
    }

    // 计算字符串中包含多少个2
    private static int num(String str, int lenStr) {
        int count = 0;// 定义一个遍历表示2的数量
        // 判断是否为负数
        if (flag(str)) {
            // 如果为负数，循环从1开始
            for (int i = 1; i < lenStr; i++) {
                // 字符串中每包含一个2，count就递增一次
                if (str.charAt(i) == '2') {
                    count++;
                }
            }
            return count;
        } else {
            // 如果为正数，循环从0开始
            for (int i = 0; i < lenStr; i++) {
                // 字符串中每包含一个2，count就递增一次
                if (str.charAt(i) == '2') {
                    count++;
                }
            }
            return count;
        }
    }

    // 判断是否为偶数
    private static double parity(String str) {
        // (str.length() - 1)表示字符串的索引
        // (str.charAt(str.length() - 1)表示字符串最后一个字符
        // (str.charAt(str.length() - 1) - '0')表示将字符串最后一个字符转变为整数类型
        if ((str.charAt(str.length() - 1) - '0') % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    // 判断整数的长度(不是字符串的长度)
    private static int bit(String str) {
        if (flag(str)) {
            return str.length() - 1;
        } else {
            return str.length();
        }
    }
}

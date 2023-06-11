//编号：L1-032
//题目：Left-pad
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805100684361728
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-11
//指导老师：吴光生-新余学院

/* 
题目描述：
根据新浪微博上的消息，有一位开发者不满NPM（Node Package Manager）的做法，收回了自己的开源代码，其中包括一个叫left-pad的模块，就是这个模块把javascript里面的React/Babel干瘫痪了。
这是个什么样的模块？就是在字符串前填充一些东西到一定的长度。例如用*去填充字符串GPLT，使之长度为10，调用left-pad的结果就应该是******GPLT。Node社区曾经对left-pad紧急发布了一个替代，被严重吐槽。下面就请你来实现一下这个模块。
*/

/* 
输入格式：
输入在第一行给出一个正整数N（≤10^4）和一个字符，分别是填充结果字符串的长度和用于填充的字符，中间以1个空格分开。第二行给出原始的非空字符串，以回车结束。
*/

/* 
输出格式：
在一行中输出结果字符串。
*/

/*
输入样例1:
15 _
I love GPLT
*/

/* 
输出样例1:
____I love GPLT
*/

/*
输入样例2:
4 *
this is a sample for cut
*/

/* 
输出样例2:
 cut
*/

// 代码长度限制
// 16 KB
// 时间限制
// 400 ms
// 内存限制
// 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
此题需要比较长度和输入的字符串的长度。
1：需要填补，利用循环打印字符
2：不需要填补，利用截取
*/
import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();// 需要的长度
        String s = sc.next();// 需要填补的符号
        sc.nextLine();// 用于消除缓冲区
        String str = sc.nextLine();// 输入字符串
        int len = str.length();// 输入字符串的长度
        if (count > len) {
            for (int i = 0; i < count - len; i++) {
                System.out.print(s);
            }
            System.out.println(str);
        } else if (count <= len) {
            String substring = str.substring(len - count);
            System.out.println(substring);
        }
    }
}

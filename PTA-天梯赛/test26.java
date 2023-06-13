//编号：L1-026
//题目：I Love GPLT
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805108934557696
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-13
//指导老师：吴光生-新余学院

/* 
题目描述：
这道超级简单的题目没有任何输入。

你只需要把这句很重要的话 —— “I Love GPLT”——竖着输出就可以了。

所谓“竖着输出”，是指每个字符占一行（包括空格），即每行只能有1个字符和回车。
*/

/*
输入样例:
无
*/

/* 
输出样例:
I
 
L
o
v
e
 
G
P
L
T
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
正如题目所言，此题很简单，之间遍历字符串即可
*/
public class test26 {
    public static void main(String[] args) {
        String str = "I Love GPLT";
        // 将字符串改为字符数组
        char[] arr = str.toCharArray();
        // 遍历字符数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

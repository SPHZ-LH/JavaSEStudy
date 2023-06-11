//编号：L1-023
//题目：输出GPLT
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805113036587008
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-02
//指导老师：吴光生-新余学院

/* 
题目描述：
给定一个长度不超过10000的、仅由英文字母构成的字符串。请将字符重新调整顺序，
按GPLTGPLT....这样的顺序输出，并忽略其它字符。当然，四种字符（不区分大小写）
的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按GPLT的顺序打印，
直到所有字符都被输出。
*/

/* 
输入格式：
输入在一行中给出一个长度不超过10000的、仅由英文字母构成的非空字符串。
*/

/* 
输出格式：
在一行中按题目要求输出排序后的字符串。题目保证输出非空。
*/

/*
输入样例:
pcTclnGloRgLrtLhgljkLhGFauPewSKgt
*/

/* 
输出样例:
GPLTGPLTGLTGLGLL
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：150 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
本题对时间有要求，录入首选BufferedReader，录入的效率比Scanner高,
录入字符串,将单个字符进行比较,最后打印。
*/
import java.io.*;
                                     

public class test23 {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String str = bu.readLine().toUpperCase();
        int len = str.length();

        // 记录GPLT大小写字符的字符个数
        int gIndex = 0;
        int pIndex = 0;
        int lIndex = 0;
        int tIndex = 0;

        // 每当出现一次大小写字符个数+1;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == 'G' || c == 'g') {
                gIndex++;
            } else if (c == 'P' || c == 'p') {
                pIndex++;
            } else if (c == 'L' || c == 'l') {
                lIndex++;
            } else if (c == 'T' || c == 't') {
                tIndex++;
            }
        }

        // 将需要打印的字符进行总和，并且进行遍历
        int result = gIndex + pIndex + lIndex + tIndex;
        for (int i = 0; i < result; i++) {
            if (i < gIndex) {
                System.out.print("G");
            }

            if (i < pIndex) {
                System.out.print("P");
            }

            if (i < lIndex) {
                System.out.print("L");
            }

            if (i < tIndex) {
                System.out.print("T");
            }
        }
    }
}
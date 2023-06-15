//编号：L1-007
//题目：念数字
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805136889593856
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-30
//指导老师：吴光生-新余学院

/* 
题目描述：
输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出fu字。十个数字对应的拼音如下：

0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu
*/

/* 
输入格式：
输入在一行中给出一个整数，如：1234。

提示：整数包括负数、零和正数。
*/

/* 
输出格式：
在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如
yi er san si。
*/

/*
输入样例:
-600
*/

/* 
输出样例:
fu liu ling ling
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
创建长度为11的字符串数组，将拼音挨个对应字符串数组的索引，将索引为10的字符串赋值为fu。
将录入的字符串转化为字符数组，将字符数组挨个转化为int类型。最后遍历数组
*/
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 因为要考虑负数，创建长度为11的字符串数组
        String[] arr = new String[11];
        arr[0] = "ling";
        arr[1] = "yi";
        arr[2] = "er";
        arr[3] = "san";
        arr[4] = "si";
        arr[5] = "wu";
        arr[6] = "liu";
        arr[7] = "qi";
        arr[8] = "ba";
        arr[9] = "jiu";
        arr[10] = "fu";
        String str = sc.next();

        // 将录入的字符串转化为字符数组
        char[] charIndex = str.toCharArray();
        for (int i = 0; i < charIndex.length; i++) {

            // 判断字符是否为'-'
            if (charIndex[i] == '-') {
                charIndex[i] = ':';// ':'对应的ASCll码值为58
            }
            int c = charIndex[i] - '0';// 将字符转换为数字

            // 最后遍历
            if (i == charIndex.length - 1) {
                System.out.println(arr[c]);
            } else {
                System.out.print(arr[c] + " ");
            }
        }
    }
}

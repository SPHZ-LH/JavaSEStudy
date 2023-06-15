//编号：L1-046
//题目：整除光棍
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805084284633088
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-14
//指导老师：吴光生-新余学院

/*
题目描述：
这里所谓的“光棍”，并不是指单身汪啦~ 说的是全部由1组成的数字，比如1、11、111、1111等。
传说任何一个光棍都能被一个不以5结尾的奇数整除。比如，111111就可以被13整除。 现在，你
的程序要读入一个整数x，这个整数一定是奇数并且不以5结尾。然后，经过计算，输出两个数字：
第一个数字s，表示x乘以s是一个光棍，第二个数字n是这个光棍的位数。这样的解当然不是唯一的,
题目要求你输出最小的解。

提示：一个显然的办法是逐渐增加光棍的位数，直到可以整除x为止。但难点在于，s可能是个非常
大的数 —— 比如，程序输入31，那么就输出3584229390681和15，因为31乘以3584229390681的
结果是111111111111111，一共15个1。
*/

/*
输入格式：
输入在一行中给出一个不以5结尾的正奇数x（<1000）。
*/

/*
输出格式：
在一行中输出相应的最小的s和n，其间以1个空格分隔。
*/

/*
输入样例：
31
*/

/* 
输出样例1：
3584229390681 15
 */

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
此题的涉及的数超出了int与long的取值范围，因此选用BigInteger
键盘录入一个数，该数需要整除光棍整数，无法确定什么时候循环次数
因此选择while循环
*/

import java.math.BigInteger;
import java.util.Scanner;

public class test46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number = sc.nextBigInteger();
        // 设定光棍整数从1开始
        BigInteger result = new BigInteger("1");
        int count = 1;// 光棍整数的位数
        while (true) {
            // 获取光棍整数的商和余数
            BigInteger[] bi = result.divideAndRemainder(number);
            // 余数不为0，循环继续
            if (!(bi[1].equals(new BigInteger("0")))) {
                // 光棍整数长度加1
                result = result.multiply(new BigInteger("10")).add(new BigInteger("1"));
                count++;
            } else {
                // 否则，打印商和位数，循环结束
                System.out.println(bi[0] + " " + count);
                break;
            }
        }
    }
}

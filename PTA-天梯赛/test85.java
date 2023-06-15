//编号：L1-085
//题目：试试手气
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1518581694528933888
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-11
//指导老师：吴光生-新余学院

/* 
题目描述：
我们知道一个骰子有 6 个面，分别刻了 1 到 6 个点。下面给你 6 个骰子的初始状态，即它们朝上一面的点数，让你一把抓起摇出另一套结果。假设你摇骰子的手段特别精妙，每次摇出的结果都满足以下两个条件：

1、每个骰子摇出的点数都跟它之前任何一次出现的点数不同；
2、在满足条件 1 的前提下，每次都能让每个骰子得到可能得到的最大点数。
那么你应该可以预知自己第 n 次（1≤n≤5）摇出的结果。
*/

/* 
输入格式：
输入第一行给出 6 个骰子的初始点数，即 [1,6] 之间的整数，数字间以空格分隔；第二行给出摇的次数 n（1≤n≤5）。
*/

/* 
输出格式：
在一行中顺序列出第 n 次摇出的每个骰子的点数。数字间必须以 1 个空格分隔，行首位不得有多余空格。
*/

/*
输入样例:
3 6 5 4 1 4
3

*/

/* 
输出样例:
6 5 6 6 6 6
5 4 4 5 5 5
4 3 3 3 4 3
*/

/* 
样例解释：
这 3 次摇出的结果依次为：

6 5 6 6 6 6
5 4 4 5 5 5
4 3 3 3 4 3 
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
此题我想到的是既然数据不能重复，那么使用的HashSet集合，将每次投掷的数放入集合中。
因为要同时投掷6个骰子，先将问题简化成投掷1个骰子。
*/

import java.util.HashSet;
import java.util.Scanner;

public class test85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer>[] hs = new HashSet[6];
        for (int j = 1; j < hs.length + 1; j++) {
            hs[j] = new HashSet<>();
        }
        int[] dice = new int[6];
        for (int i = 1; i < dice.length + 1; i++) {
            dice[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            // 将返回的值继续放入方法中
            for (int j = 1; j <= 6; j++) {
                dice[j] = dice(hs[j], dice[j]);
            }
        }
        System.out.println(dice[1] + " " + dice[2] + " " + dice[3] + " " + dice[4] + " " + dice[5] + " " + dice[6]);
    }

    // 一个筛子，投掷一次
    public static int dice(HashSet<Integer> hashSet, int count) {
        // 每次投掷的数放入Set集合中
        hashSet.add(count);
        // 每次投掷的数从6开始递减
        for (int i = 6; i > 0; i--) {
            // 假设投掷出来的数之前不存在
            boolean flag = false;
            // 对之前的投掷的数进行遍历
            for (Integer s : hashSet) {
                // 如果存在，flag变为ture，遍历结束
                if (s == i) {
                    flag = true;
                    break;
                }
            }

            // 不存在，返回i；
            if (!flag) {
                return i;
            }
        }
        return -1;// 循环结束也不存在，返回-1；
    }
}

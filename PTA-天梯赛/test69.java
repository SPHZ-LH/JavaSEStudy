//编号：L1-069
//题目：胎压监测
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/1336215880692482052
//题解提供者：李昊 （仅供学习交流）
//日期：2023-06-05
//指导老师：吴光生-新余学院

/*
题目描述：
小轿车中有一个系统随时监测四个车轮的胎压，如果四轮胎压不是很平衡，则可能对行车造成严重的影响。
让我们把四个车轮 —— 左前轮、右前轮、右后轮、左后轮 —— 顺次编号为 1、2、3、4。本题就请你编写一个监测程序，随时监测四轮的胎压，并给出正确的报警信息。报警规则如下：
如果所有轮胎的压力值与它们中的最大值误差在一个给定阈值内，并且都不低于系统设定的最低报警胎压，则说明情况正常，不报警；
如果存在一个轮胎的压力值与它们中的最大值误差超过了阈值，或者低于系统设定的最低报警胎压，则不仅要报警，而且要给出可能漏气的轮胎的准确位置；
如果存在两个或两个以上轮胎的压力值与它们中的最大值误差超过了阈值，或者低于系统设定的最低报警胎压，则报警要求检查所有轮胎。
*/

/*
输入格式：
输入在一行中给出 6 个 [0, 400] 范围内的整数，依次为 1~4 号轮胎的胎压、最低报警胎压、以及胎压差的阈值。
*/

/*
输出格式：
根据输入的胎压值给出对应信息：
如果不用报警，输出 Normal；
如果有一个轮胎需要报警，输出 Warning: please check #X!，其中 X 是出问题的轮胎的编号；
如果需要检查所有轮胎，输出 Warning: please check all the tires!。
*/

/*
输入样例1：
242 251 231 248 230 20

输出样例1：
Normal

输入样例2：
242 251 232 248 230 10

输出样例2：
Warning: please check #3!

输入样例3：
240 251 232 248 240 10

输出样例3：
Warning: please check all the tires!
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

/*
解题思路：
利用循环，将每个数进行比对，观察是否符合题意
*/

import java.util.Scanner;

public class test69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
        int critical = sc.nextInt();// 最低值
        int relative = sc.nextInt();// 相对
        int count = 0;// 记录出现异常的个数
        int index = -1;// 记录出现异常的位置
        int max = max(arr);// 该方法查询最大值的索引
        for (int i = 0; i < arr.length; i++) {

            // 观察每个数是否符合题意
            if ((arr[i] < critical) || ((arr[max] - arr[i]) > relative)) {
                index = i + 1;// 加1是为了确定该数的位置
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Normal");
        } else if (count == 1) {
            System.out.println("Warning: please check #" + index + "!");
        } else if (count >= 2) {
            System.out.println("Warning: please check all the tires!");
        }
    }

    private static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
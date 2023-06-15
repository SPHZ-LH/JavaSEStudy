//编号：L1-040
//题目：最佳情侣身高差
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805090748055552
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-10
//指导老师：吴光生-新余学院

/* 
题目描述：
专家通过多组情侣研究数据发现，最佳的情侣身高差遵循着一个公式：（女方的身高）×1.09 =（男方的身高）。
如果符合，你俩的身高差不管是牵手、拥抱、接吻，都是最和谐的差度。
下面就请你写个程序，为任意一位用户计算他/她的情侣的最佳身高。
*/

/* 
输入格式：
输入第一行给出正整数N（≤10），为前来查询的用户数。随后N行，每行按照“性别 身高”的格式给出前来
查询的用户的性别和身高，其中“性别”为“F”表示女性、“M”表示男性；“身高”为区间 [1.0, 3.0] 之间的实数。
*/

/* 
输出格式：
对每一个查询，在一行中为该用户计算出其情侣的最佳身高，保留小数点后2位。
*/

/*
输入样例:
2
M 1.75
F 1.8
*/

/* 
输出样例:
1.61
1.96
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

import java.util.Scanner;

public class test40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        for (int i = 0; i < index; i++) {
            String gender = sc.next();
            double height = sc.nextDouble();
            if (gender.equals("F") && (height <= 3 && height >= 1)) {
                System.out.printf("%.2f\n", height * 1.09);
            } else if (gender.equals("M") && (height <= 3 && height >= 1)) {
                System.out.printf("%.2f\n", height / 1.09);
            }
        }
    }
}

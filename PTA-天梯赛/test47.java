//编号：L1-047 
//题目：装睡
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805083282194432
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-12
//指导老师：吴光生-新余学院

/* 
题目描述：
你永远叫不醒一个装睡的人 —— 但是通过分析一个人的呼吸频率和脉搏，你可以发现谁在装睡！医生告诉我们，
正常人睡眠时的呼吸频率是每分钟15-20次，脉搏是每分钟50-70次。
下面给定一系列人的呼吸频率与脉搏，请你找出他们中间有可能在装睡的人，即至少一项指标不在正常范围内的人。
*/

/* 
输入格式：
输入在第一行给出一个正整数N（≤10）。随后N行，每行给出一个人的名字（仅由英文字母组成的、长度不超过3个
字符的串）、其呼吸频率和脉搏（均为不超过100的正整数）。
*/

/* 
输出格式：
按照输入顺序检查每个人，如果其至少一项指标不在正常范围内，则输出其名字，每个名字占一行。
*/

/*
输入样例:
4
Amy 15 70
Tom 14 60
Joe 18 50
Zoe 21 71
*/

/* 
输出样例:
Tom
Zoe
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
键盘录入，条件取反打印
*/
import java.util.Scanner;

public class test47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String name = sc.next();
            int huxi = sc.nextInt();
            int maibo = sc.nextInt();
            if ((!(15 <= huxi && huxi <= 20)) || (!(50 <= maibo && maibo <= 70))) {
                System.out.println(name);
            }
        }
    }
}

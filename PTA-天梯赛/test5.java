//编号：L1-005
//题目：考试座位号
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805140211482624
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-05-28
//指导老师：吴光生-新余学院

/* 
题目描述：
每个 PAT 考生在参加考试时都会被分配两个座位号，一个是试机座位，一个是考试座位。
正常情况下，考生在入场时先得到试机座位号码，入座进入试机状态后，系统会显示该考
生的考试座位号码，考试时考生需要换到考试座位就座。但有些考生迟到了，试机已经结
束，他们只能拿着领到的试机座位号码求助于你，从后台查出他们的考试座位号码。
*/

/* 
输入格式：
输入第一行给出一个正整数 N（≤1000），随后 N 行，每行给出一个考生的信息：
准考证号 试机座位号 考试座位号。其中准考证号由 16 位数字组成，座位从 1 到 N 编号。
输入保证每个人的准考证号都不同，并且任何时候都不会把两个人分配到同一个座位上。

考生信息之后，给出一个正整数 M（≤N），随后一行中给出 M 个待查询的试机座位号码，以空格分隔。
*/

/* 
输出格式：
对应每个需要查询的试机座位号码，在一行中输出对应考生的准考证号和考试座位号码，中间用 1 个空格分隔。
*/

/*
输入样例:
4
3310120150912233 2 4
3310120150912119 4 1
3310120150912126 1 3
3310120150912002 3 2
2
3 4
*/

/* 
输出样例:
3310120150912002 2
3310120150912119 1
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：200 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
通过BufferedReader来键盘录入，比Scanner的运行效率高很多。
创建考试安排对象，因为运行限制时间苛刻，不能用private修饰(最为重要)，直接赋值运行效率最高。
创建对应的数组，将试机座位当作数组索引，最后打印数组索引。
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seatNumber = Integer.parseInt(br.readLine());
        seat[] arr = new seat[seatNumber];
        for (int i = 0; i < seatNumber; i++) {
            // 将字符串进行分割，形成多个字符串数组
            String[] input = br.readLine().split(" ");
            String id = input[0];
            int tempPlace = Integer.parseInt(input[1]);// 将1索引的字符串数组进行装箱
            int place = Integer.parseInt(input[2]);// 将2索引的字符串数组进行装箱
            arr[tempPlace - 1] = new seat();// 将试机座位作为(索引-1)进行无参构造
            arr[tempPlace - 1].id = id;// 直接赋值
            arr[tempPlace - 1].place = place;// 直接赋值
        }

        int findNumber = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");// 将要查询的索引进行分割

        // 最后遍历，没啥好说的了
        for (int i = 0; i < findNumber; i++) {
            int tempPlace = Integer.parseInt(split[i]) - 1;
            System.out.print(arr[tempPlace].id);
            System.out.print(" ");
            System.out.println(arr[tempPlace].place);
        }
    }

}

class seat {
    String id;
    int place;

    public seat() {
    }

}

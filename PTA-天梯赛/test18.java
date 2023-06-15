//编号：L1-018
//题目：大笨钟
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805119944605696
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-12
//指导老师：吴光生-新余学院

/* 
题目描述：
微博上有个自称“大笨钟V”的家伙，每天敲钟催促码农们爱惜身体早点睡觉。不过由于笨钟自己作息也不是很规律
，所以敲钟并不定时。一般敲钟的点数是根据敲钟时间而定的，如果正好在某个整点敲，那么“当”数就等于那个整
点数；如果过了整点，就敲下一个整点数。另外，虽然一天有24小时，钟却是只在后半天敲1~12下。例如在23:00
敲钟，就是“当当当当当当当当当当当”，而到了23:01就会是“当当当当当当当当当当当当”。在午夜00:00到中午
12:00期间（端点时间包括在内），笨钟是不敲的。

下面就请你写个程序，根据当前时间替大笨钟敲钟。
*/

/* 
输入格式：
输入第一行按照hh:mm的格式给出当前时间。其中hh是小时，在00到23之间；mm是分钟，在00到59之间。
*/

/* 
输出格式：
根据当前时间替大笨钟敲钟，即在一行中输出相应数量个Dang。如果不是敲钟期，则输出：

Only hh:mm.  Too early to Dang.
其中hh:mm是输入的时间。
*/

/*
输入样例1:
19:05
*/

/* 
输出样例1:
DangDangDangDangDangDangDangDang
*/

/*
输入样例2:
07:05
*/

/* 
输出样例2:
Only 07:05.  Too early to Dang.
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
此题可以不通过Date对象获取时间，直接使用字符串截取小时和分钟，然后进行分类讨论。
*/

import java.text.ParseException;
import java.util.Scanner;

public class test18 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 将录入的时间进行分割，形成小时类和分钟类
        String[] arr = str.split(":");
        // 将小时类字符串转变为int类型
        int hour = Integer.parseInt(arr[0]);
        // 将分钟类字符串转变为int类型
        int mins = Integer.parseInt(arr[1]);

        /*
         * 进行分类讨论
         * 0 <= hour && hour <= 11 表示00：00~11：59
         * hour == 12 && mins == 0 表示12：00
         */
        if ((0 <= hour && hour <= 11) || (hour == 12 && mins == 0)) {
            System.out.println("Only " + str + ".  Too early to Dang.");
            // 讨论是否要进一
        } else if (mins == 0) {
            for (int j = 0; j < hour - 12; j++) {
                System.out.print("Dang");
            }
        } else if (mins != 0) {
            for (int j = 0; j < hour + 1 - 12; j++) {
                System.out.print("Dang");
            }
        }
    }
}

//编号：L1-042
//题目：日期格式化
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805088529268736
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-10
//指导老师：吴光生-新余学院

/* 
题目描述：
世界上不同国家有不同的写日期的习惯。比如美国人习惯写成“月-日-年”，而中国人习惯写成“年-月-日”。
下面请你写个程序，自动把读入的美国格式的日期改写成中国习惯的日期。
*/

/* 
输入格式：
输入在一行中按照“mm-dd-yyyy”的格式给出月、日、年。题目保证给出的日期是1900年元旦至今合法的日期。
*/

/* 
输出格式：
在一行中按照“yyyy-mm-dd”的格式给出年、月、日。
*/

/*
输入样例:
03-15-2017
*/

/* 
输出样例:
2017-03-15
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test42 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Date d = sdf.parse(str);
        String format = sdf1.format(d);
        System.out.println(format);
    }
}

//编号：L1-027
//题目：出租
//标签：
//难度：L1
//原题链接：https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805107638517760
//题解提供者：李昊-新余学院 （仅供学习交流）
//日期：2023-06-13
//指导老师：吴光生-新余学院

/* 
题目描述：
下面是新浪微博上曾经很火的一张图：

一时间网上一片求救声，急问这个怎么破。其实这段代码很简单，index数组就是arr数组的下标，
index[0]=2 对应 arr[2]=1，index[1]=0 对应 arr[0]=8，index[2]=3 对应 arr[3]=0，以此类推…… 很容易得到电话号码是18013820100。

本题要求你编写一个程序，为任何一个电话号码生成这段代码 —— 事实上，只要生成最前面两行就可以了，后面内容是不变的。
*/

/* 
输入格式：
输入在一行中给出一个由11位数字组成的手机号码。
*/

/* 
输出格式：
为输入的号码生成代码的前两行，其中arr中的数字必须按递减顺序给出。
*/

/*
输入样例:
18013820100
*/

/* 
输出样例:
int[] arr = new int[]{8,3,2,1,0};
int[] index = new int[]{3,0,4,3,1,0,2,4,3,4,4};
*/

//运行限制：
//代码长度限制：16 KB
//时间限制：400 ms
//内存限制: 64 MB

//由于类名为Main，运行前将本文件名修改为Main.java

/*
解题思路：
将输入的电话号码的数字进行统计，查看出现的数字，将此数据放入TreeSet集合当中，
并且重新定义排序的顺序。将字符串进行分流，改变字符的数据类型，放入数组中。
最后将数组转变为字符串。
String->char->int->integer->int[]->String
*/

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class test27 {
    public static void main(String[] args) {
        // 创建TreeSet集合，并且重新定义排列顺序，从大到小
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            // 将字符串中的字符转变为int类型，并且添加进ts集合当中
            int num = str.charAt(i) - '0';
            ts.add(num);
        }

        // 利用Strem流将集合中的integer类型转变为int[]
        int[] arr = ts.stream().mapToInt(value -> value).toArray();
        // 电话号码是11位，之间创建11位的数组
        int[] index = new int[11];
        // 外循环表示循环的次数
        for (int i = 0; i < index.length; i++) {
            // index数组的索引位置对应电话号码的数字
            int num = str.charAt(i) - '0';
            // 遍历电话号码的数字对应arr数组的索引
            for (int j = 0; j < arr.length; j++) {
                // arr[j]表示arr数组中的元素
                // j代表arr数组的索引
                // i代表index数组的索引
                if (arr[j] == num) {
                    index[i] = j;
                }
            }
        }

        // 最后遍历打印
        System.out.println("int[] arr = " + toString(arr));
        System.out.println("int[] index = " + toString(index));
    }

    // 将数组进行遍历打印
    public static String toString(int[] a) {
        // 创建可变数组
        StringBuilder s = new StringBuilder();
        s.append("new int[]{");
        for (int i = 0;; i++) {
            s.append(a[i]);
            if (i == a.length - 1) {
                return s.append("};").toString();
            }
            s.append(",");
        }
    }
}

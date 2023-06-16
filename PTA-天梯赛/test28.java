//��ţ�L1-028
//��Ŀ���ж�����
//��ǩ��
//�Ѷȣ�L1
//ԭ�����ӣ�https://pintia.cn/problem-sets/994805046380707840/exam/problems/994805106325700608
//����ṩ�ߣ����-����ѧԺ ������ѧϰ������
//���ڣ�2023-06-16
//ָ����ʦ�������-����ѧԺ

/* 
��Ŀ������
�����Ŀ��ܼ򵥣������ж�һ���������������Ƿ�������
*/

/* 
�����ʽ��
�����ڵ�һ�и���һ��������N���� 10�������N�У�ÿ�и���һ��С��2^31����Ҫ�жϵ���������
*/

/* 
�����ʽ��
��ÿ����Ҫ�жϵ��������������������������һ�������Yes���������No��
*/

/*
��������:
2
11
111
*/

/* 
�������:
Yes
No
*/

//�������ƣ�
//���볤�����ƣ�16 KB
//ʱ�����ƣ�200 ms
//�ڴ�����: 64 MB

//��������ΪMain������ǰ�����ļ����޸�ΪMain.java

import java.util.Scanner;

public class test28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (decide(sc.nextInt())) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }

    // ����һ�������ж��Ƿ�Ϊ����
    public static boolean decide(int number) {
        // ��С������Ϊ2
        if (number < 2) {
            return false;
        } else {
            // ���ö��ֲ����жϣ��������Ч��
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
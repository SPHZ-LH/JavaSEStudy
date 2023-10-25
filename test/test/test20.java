package test;

import java.util.Random;

public class test20 {
    public static void main(String[] args) {

        char[] arr = new char[52];

        for (int i = 0; i < arr.length; i++) {

            if (i <= 25) {

                arr[i] = (char) (97 + i);

            } else {

                arr[i] = (char) (65 + i - 26);

            }

        }

        Random r = new Random();

        String result = "";

        for (int i = 0; i < 4; i++) {

            int number = r.nextInt(arr.length);

            result = result + arr[number];

        }

        int digit = r.nextInt(10);

        result = result + digit;

        System.out.print(result);

    }
}
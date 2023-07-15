import java.util.Random;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        String result =new String(arr);
        System.out.println(result); 
    }
}
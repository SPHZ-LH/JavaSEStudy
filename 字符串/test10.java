import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        String newStr = sb.reverse().toString();
        char[] arr = newStr.toCharArray();
        int number=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                break;
            }
            number++;
        }
        System.out.println(number);
    }
}

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String result ="";
        for (int i = str.length()-1; i >= 0; i--) {
            result =result +str.charAt(i);
        }
        return result;
    }
}

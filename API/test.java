import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            method(str);
        }
    }

    public static void method(String str) {
        char c = str.charAt(str.length() - 1);
        if (c > '0' && c < '9') {
            return;
        }
        Pattern p = Pattern.compile("PTA");
        Matcher m = p.matcher(str);
        if (c == '?') {
            if (m.find()) {
                System.out.println("Yes!");
            } else {
                System.out.println("No.");
            }
        } else {
            System.out.println("enen");
        }
    }
}

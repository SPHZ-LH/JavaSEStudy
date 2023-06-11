import java.util.Scanner;

public class test45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() <= 7) {
            System.out.println("Hello " + str);
        }
    }
}

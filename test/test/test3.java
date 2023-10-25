package test;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double num1 = Math.PI * c1 * c1;
        double num2 = Math.PI * c2 * c2;
        System.out.printf("%.2f\n", num1);
        System.out.printf("%.2f\n", num2);
    }
}

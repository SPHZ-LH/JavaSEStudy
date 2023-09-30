import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double num1 = Circle(c1);
        double num2 = Circle(c2);
        System.out.printf("%.2f\n", num1);
        System.out.printf("%.2f\n", num2);
    }

    public static double Circle(double number) {
        double printArea = Math.PI * number * number;
        return printArea;
    }
}

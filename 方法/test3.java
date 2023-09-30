import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        Circle(c1);
        Circle(c2);
    }

    public static void Circle(double number) {
        double printArea = Math.PI * number * number;
        System.out.printf("%.2f\n", printArea);
    }
}
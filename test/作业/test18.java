package 作业;

import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc.nextDouble());
        Circle c2 = new Circle(sc.nextDouble());
        System.out.printf("%.2f\n", c1.printArea());
        System.out.printf("%.2f\n", c2.printArea());
    }
}

class Circle {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double printArea() {
        return Math.PI * r * r;
    }
}

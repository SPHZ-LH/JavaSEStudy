package 作业;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("面积为" + rect.getAree());
        System.out.println("周长为" + rect.getPerimeter());
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getAree() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }
}

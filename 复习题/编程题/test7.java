package 编程题;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(length, width);
        System.out.println("面积为" + r.getAree());
        System.out.println("周长为" + r.getPerimeter());
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

    /**
     * 获取
     *
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置
     *
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 获取
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     *
     * @param width
     */
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

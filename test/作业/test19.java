package 作业;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v1 = new Vehicle(sc.next(), sc.nextDouble(), sc.next());
        Vehicle v2 = new Vehicle(sc.next(), sc.nextDouble(), sc.next());
        System.out.println("第一辆是" + v1.getKind() + "，时速为" + v1.getSpeed() + "km/h，颜色为" + v1.getColor());
        System.out.println("第二辆是" + v2.getKind() + "，时速为" + v2.getSpeed() + "km/h，颜色为" + v2.getColor());
    }
}

class Vehicle {
    private String kind;// 类别
    private double speed;// 速度
    private String color;// 颜色

    public Vehicle() {
    }

    public Vehicle(String kind, double speed, String color) {
        this.kind = kind;
        this.speed = speed;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

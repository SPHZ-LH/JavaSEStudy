package 编程题;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v1 = new Vehicle();
        v1.setKind(sc.next());
        v1.setSpeed(sc.nextDouble());
        v1.setColor(sc.next());
        Vehicle v2 = new Vehicle();
        v2.setKind(sc.next());
        v2.setSpeed(sc.nextDouble());
        v2.setColor(sc.next());
        System.out.println("第一辆是" + v1);
        System.out.println("第二辆是" + v2);
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

    @Override
    public String toString() {
        return kind + "，时速为" + speed + "km/h，颜色为" + color;
    }

}

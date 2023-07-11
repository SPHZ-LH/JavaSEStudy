import java.util.Scanner;

public class TestDeam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("三角形创建成功");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
            throw new IllegalTriangleException("IllegalTriangleException: 边长不符合要求");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
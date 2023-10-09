import java.util.Scanner;

public class TestDeam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CargoShip muship = new CargoShip();
        muship.setMaxWeight(sc.nextDouble());
        int wight1 = sc.nextInt();
        int wight2 = sc.nextInt();
        try {
            muship.loading(wight1);
            muship.loading(wight2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("货船将正点起航");
        }
    }
}

class CargoShip {
    private double actualWeight = 0;// 实际装载量
    private double maxWeight;// 最大装载量

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void loading(double weight) throws OverLoadException {
        if (maxWeight < actualWeight + weight) {
            throw new OverLoadException("无法再装载重量是" + weight + "吨的集装箱");
        }

        actualWeight = actualWeight + weight;
        System.out.println("目前共装载了" + actualWeight + "吨货物");
    }
}

class OverLoadException extends Exception {
    public OverLoadException() {
    }

    public OverLoadException(String message) {
        super(message);
    }

}

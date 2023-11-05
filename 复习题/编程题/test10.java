package 编程题;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CargoShip myship = new CargoShip();
        myship.setMaxWeight(sc.nextDouble());
        try {
            myship.loading(sc.nextDouble());
            myship.loading(sc.nextDouble());
        } catch (OverLoadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("货船将正点起航");
        }
    }
}

class OverLoadException extends Exception {
    private String message;

    public OverLoadException() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public OverLoadException(double n) {
        this.message = "无法再装载重量是" + n + "吨的集装箱";
    }

}

class CargoShip {
    private double actualWeight = 0;
    private double maxWeight;

    public CargoShip() {
    }

    public CargoShip(double actualWeight, double maxWeight) {
        this.actualWeight = actualWeight;
        this.maxWeight = maxWeight;
    }

    /**
     * 获取
     *
     * @return actualWeight
     */
    public double getActualWeight() {
        return actualWeight;
    }

    /**
     * 设置
     *
     * @param actualWeight
     */
    public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }

    /**
     * 获取
     *
     * @return maxWeight
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * 设置
     *
     * @param maxWeight
     */
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void loading(double weight) throws OverLoadException {
        if ((this.actualWeight + weight) > getMaxWeight()) {
            throw new OverLoadException(weight);
        } else {
            this.actualWeight = this.actualWeight + weight;
            System.out.println("目前共装载了" + this.actualWeight + "吨货物");
        }
    }
}
package 编程题;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle objVehicle = new Vehicle(sc.next(), sc.nextInt());
        System.out.println("车辆信息如下：");
        objVehicle.show();
        Bus objBus = new Bus(sc.next(), sc.nextInt(), sc.nextInt());
        System.out.println("客车信息如下：");
        objBus.show();
    }
}

class Vehicle {
    // 车牌号
    private String plateNO;
    // 轴距
    private int wheelbase;


    public Vehicle() {
    }

    public Vehicle(String plateNO, int wheelbase) {
        this.plateNO = plateNO;
        this.wheelbase = wheelbase;
    }

    /**
     * 获取
     *
     * @return plateNO
     */
    public String getPlateNO() {
        return plateNO;
    }

    /**
     * 设置
     *
     * @param plateNO
     */
    public void setPlateNO(String plateNO) {
        this.plateNO = plateNO;
    }

    /**
     * 获取
     *
     * @return wheelbase
     */
    public int getWheelbase() {
        return wheelbase;
    }

    /**
     * 设置
     *
     * @param wheelbase
     */
    public void setWheelbase(int wheelbase) {
        this.wheelbase = wheelbase;
    }

    public void show() {
        System.out.println("车牌号：" + plateNO);
        System.out.println("轴距：" + wheelbase);
    }

}

class Bus extends Vehicle {

    private int passengers;

    public Bus() {
    }

    public Bus(String plateNO, int wheelbase, int passengers) {
        super(plateNO, wheelbase);
        this.passengers = passengers;
    }

    /**
     * 获取
     *
     * @return passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * 设置
     *
     * @param passengers
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("限载人数：" + passengers);
    }
}

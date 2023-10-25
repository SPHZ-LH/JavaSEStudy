package test;

public class test {
    public static void main(String[] args) {
        Building build = new Building(5, 5000);
        build.show();
        House house = new House(6, 6000, 120, 60);
        house.show();
        OfficeBuilding office = new OfficeBuilding(10, 15000, 50, 200);
        office.show();
    }
}

class Building {
    int layers; // 层数
    int area; // 面积（平方米数）

    public Building() {
    }

    public Building(int layers, int area) {
        this.layers = layers;
        this.area = area;
    }

    public void show() {
        System.out.printf("层数:%d,总面积:%d", layers, area);
    }
}

class House extends Building {
    int bedRooms;
    int bathRooms;

    public House() {
    }

    public House(int layers, int area, int bedRooms, int bathRooms) {
        super(layers, area);
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
    }

    @Override
    public void show() {
        System.out.print("\n住宅:");
        super.show();
        System.out.printf("卧室数:%d,浴室数:%d", bedRooms, bathRooms);

    }
}

class OfficeBuilding extends Building {
    int rooms; // 房间数
    int extinguishers; // 灭火器数量

    public OfficeBuilding() {
    }

    public OfficeBuilding(int layers, int area, int rooms, int extinguishers) {
        super(layers, area);
        this.rooms = rooms;
        this.extinguishers = extinguishers;
    }

    @Override
    public void show() {
        System.out.print("\n写字楼:");
        super.show();
        System.out.printf("房间数:%d,灭火器数:%d", rooms, extinguishers);
    }
}

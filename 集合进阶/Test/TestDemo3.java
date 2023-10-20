package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<MobilePhone> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(new MobilePhone(sc.next(), sc.nextInt()));
        list.add(new MobilePhone(sc.next(), sc.nextInt()));
        list.add(new MobilePhone(sc.next(), sc.nextInt()));
        MobilePhone phone = new MobilePhone(sc.next(), sc.nextInt());

        System.out.println("排序前，链表中的数据：");
        for (MobilePhone c : list) {
            System.out.println("型号：" + c.getType() + "，价格：" + c.getPrice());
        }
        Collections.sort(list);
        System.out.println("排序后，链表中的数据：");
        for (MobilePhone c : list) {
            System.out.println("型号：" + c.getType() + "，价格：" + c.getPrice());
        }
        int index = Collections.binarySearch(list, phone);
        boolean contains = list.contains(phone);
        if (contains) {
            System.out.println(phone.getType() + "与链表中的" + list.get(index).getType() + "价格相同");
        } else {
            System.out.println("链表中的对象，没有一个与" + phone.getType() + "价格相同的");
        }
    }
}

class MobilePhone implements Comparable<MobilePhone> {
    private String type;
    private int price;

    public MobilePhone() {
    }

    public MobilePhone(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MobilePhone other = (MobilePhone) obj;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public int compareTo(MobilePhone o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return "MobilePhone [type=" + type + ", price=" + price + "]";
    }

}

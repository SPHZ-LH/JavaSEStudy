package 作业;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        ArrayList<MobilePhone> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        MobilePhone[] arr = new MobilePhone[3];
        addPhone(list, sc, arr);
        System.out.println("排序前，链表中的数据：");
        for (MobilePhone phone : list) {
            System.out.println(phone);
        }
        Collections.sort(list);
        System.out.println("排序后，链表中的数据：");
        list.forEach(phone -> System.out.println(phone));
        MobilePhone newPhone = new MobilePhone(sc.next(), sc.nextInt());
        findPhone(list, newPhone);
    }

    private static void addPhone(ArrayList<MobilePhone> list, Scanner sc, MobilePhone[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MobilePhone(sc.next(), sc.nextInt());
            list.add(arr[i]);
        }
    }

    private static void findPhone(ArrayList<MobilePhone> list, MobilePhone newPhone) {
        Iterator<MobilePhone> it = list.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            MobilePhone listPhone = it.next();
            if (newPhone.getPrice() == listPhone.getPrice()) {
                System.out.println(newPhone.getType() + "与链表中的" + listPhone.getType() + "价格相同");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("链表中的对象，没有一个与" + newPhone.getType() + "价格相同的");
        }
    }
}

class MobilePhone implements Comparable<MobilePhone> {
    private String type;// 型号
    private int price;// 价格

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
    public int compareTo(MobilePhone o) {
        return this.getPrice() - o.getPrice();
    }

    @Override
    public String toString() {
        return "型号：" + type + "，价格：" + price;
    }

}

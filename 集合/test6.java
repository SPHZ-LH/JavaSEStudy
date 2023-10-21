import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) {
        ArrayList<Phone> list =new ArrayList<>();
        Phone s1 =new Phone("小米", 2000);
        Phone s2 =new Phone("锤子", 1000);
        Phone s3 =new Phone("苹果", 8000);
        Phone s4 =new Phone("华为", 1500);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        ArrayList<Phone> black = judgment(list);
        for (int i = 0; i < black.size(); i++) {
            String brand = black.get(i).getBrand();
            int price = black.get(i).getPrice();
            System.out.println(brand+","+price);
        }
    }

    public static ArrayList<Phone> judgment(ArrayList<Phone> list){
        ArrayList<Phone> black=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<=3000){
                black.add(list.get(i));
            }
        }
        return black;
    }
}

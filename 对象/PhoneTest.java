import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr =new Phone[3];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phone c =new Phone();
            System.out.println("请输入手机的品牌");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入手机的价格");
            int price =sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入手机的颜色");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }

        int num =0;
        for (int i = 0; i < arr.length; i++) {
            num =num+arr[i].getPrice();
        }
        double avg =num/arr.length;
        System.out.printf("%.2f",avg);
    }
}

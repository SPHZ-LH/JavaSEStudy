import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        int[] getPut = intPut();
        for (int i = 0; i < getPut.length; i++) {
            System.out.print(getPut[i] + " ");
        }
    }

    public static int[] intPut() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入红球第" + (i + 1) + "个号码");
            int rednumber = sc.nextInt();
            boolean flag = judgment(arr, rednumber);
            if (rednumber >= 1 && rednumber <= 33) {
                if (flag == false) {
                    arr[i] = rednumber;
                    i++;
                } else {
                    System.out.println("该号码已存在，请重新输入");
                }
            } else {
                System.out.println("该号码不存在，请重新输入");
            }
        }
        System.out.println("请输入蓝球号码");
        int bluenumber = sc.nextInt();
        while (true) {
            if (bluenumber >= 1 && bluenumber <= 16) {
                arr[6] = bluenumber;
                break;
            } else {
                System.out.println("该号码不存在");
            }
        }
        return arr;
    }

    public static boolean judgment(int[] arr, int rednumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == rednumber) {
                return true;
            }
        }
        return false;
    }
}

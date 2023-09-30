import java.util.Random;
import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        int[] prizeNum =prizeNumber();
        for (int i = 0; i < prizeNum.length; i++) {
            System.out.print(prizeNum[i]+" ");
        }
        int[] inputNum =intPut();
        int redWin =0;
        int blueWin =0;
        for (int i = 0; i < inputNum.length-1; i++) {
            for (int j = 0; j < inputNum.length-1; j++) {
                if(prizeNum[j]==inputNum[i]){
                    redWin++;
                    break;
                }
            }
        }
        if(prizeNum[6]==inputNum[6]){
            blueWin++;
        }
        System.out.println("红球中了"+redWin);
        System.out.println("蓝球中了"+blueWin);
        
    }

    private static int[] prizeNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int rednumber = r.nextInt(33) + 1;
            boolean flag = prizeJudgment(arr, rednumber);
            if (flag == false) {
                arr[i] = rednumber;
                i++;
            }
        }
        int bluenumber = r.nextInt(16) + 1;
        arr[6] = bluenumber;
        return arr;
    }

    public static boolean prizeJudgment(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }


    public static int[] intPut() {
        int[] arr = new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入红球第" + (i + 1) + "个号码");
            int rednumber = sc.nextInt();
            boolean flag = inputJudgment(arr, rednumber);
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

    public static boolean inputJudgment(int[] arr, int rednumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == rednumber) {
                return true;
            }
        }
        return false;
    }
}

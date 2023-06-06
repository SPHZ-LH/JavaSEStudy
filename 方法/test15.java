package 方法;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int []arr={11,23,32,45,35,22,58,13,47,85,60};
        boolean result= getTrue(arr,num1);
        System.out.println("结果为"+result);
    }


    public static boolean getTrue(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}

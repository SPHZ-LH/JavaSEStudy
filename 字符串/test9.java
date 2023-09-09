import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int intNum1 = strToInt(num1);
        int intNum2 = strToInt(num2);
        int result =intNum1*intNum2;
        String str = intToStr(result);
        System.out.println(str);
    }
    public static int strToInt(String num){
        int[] arr=new int[num.length()];
        int number=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(num.charAt(i)-48);
            number=number*10+arr[i];
        }
        return number;
    }

    public static String intToStr(int result){
        StringBuilder sb =new StringBuilder();
        sb.append(result);
        return sb.toString();
    }
}

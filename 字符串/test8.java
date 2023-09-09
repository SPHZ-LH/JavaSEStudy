import java.util.Random;

public class test8 {
    public static void main(String[] args) {
        String result = letter();
        Random r = new Random();
        int num = r.nextInt(10);
        result = result + num;
        result = dis(result);
        System.out.println(result);
    }

    public static String letter() {
        char[] arr = new char[52];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) ('a' + i);
            } else if (i >= 26 && i < arr.length) {
                arr[i] = (char) ('A' + i - 26);
            }
        }
        char[] newArr = new char[4];
        for (int i = 0; i < newArr.length; i++) {
            int number = r.nextInt(arr.length);
            newArr[i] = arr[number];
        }
        String result = new String(newArr);
        return result;
    }

    public static String dis(String result){
        char[] sultArr = result.toCharArray();
        Random r =new Random();
        for (int i = 0; i < sultArr.length; i++) {
            int num = r.nextInt(result.length());
            char temp =sultArr[i];
            sultArr[i]=sultArr[num];
            sultArr[num]=temp;
        }
        String endResult =new String(sultArr);
        return endResult;
    }
}

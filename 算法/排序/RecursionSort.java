package 排序;

public class RecursionSort {
    public static void main(String[] args) {

        System.out.println(getSun(100));
        System.out.println(getNumber(5));
    }

    public static int getSun(int number) {
        if (number == 1) {
            return number;
        }

        return number + getSun(number - 1);
    }

    public static int getNumber(int number){
        if(number==1){
            return number;
        }
        
        return number*getNumber(number-1);
    }
}

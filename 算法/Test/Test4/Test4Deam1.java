package Test.Test4;

public class Test4Deam1 {
    public static void main(String[] args) {
        System.out.println(getNumber(7));
    }

    public static int getNumber(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getNumber(number-1);
    }
}

package Test.Test3;

public class Test3Deam1 {
    public static void main(String[] args) {
        int number = getNumber(1);
        System.out.println(number);
    }

    public static int getNumber(int day){
        if(day==10){
            return 1;
        }
        return (getNumber(day+1)+1)*2;
    }
}

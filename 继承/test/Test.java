package 继承.test;

public class Test {
    public static void main(String[] args) {
        Inter j =new Car();
        uproot(j);
        Inter c =new Firm();
        uproot(c);
    }


    public static void uproot(Inter i){
        i.uproot();
    }
}

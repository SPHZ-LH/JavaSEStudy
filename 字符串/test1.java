public class test1 {
    public static void main(String[] args) {
        String num = "13523123242";
        String HMnum = num.substring(0, 3);
        String Endnum = num.substring(7);
        String result = HMnum + "****" + Endnum;
        System.out.println(result);
    }
}

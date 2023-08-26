public class test19 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(123));
        System.out.println(ToBinaryString(123));
    }

    public static String ToBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (number == 0) {
                break;
            }
            int num = number % 2;
            number = number / 2;
            sb.append(num);
        }
        sb.reverse();
        return sb.toString();
    }
}

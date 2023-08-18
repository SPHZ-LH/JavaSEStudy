public class test2 {
    public static void main(String[] args) {
        int contiue = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            double sun = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sun == i) {
                contiue++;
            }
        }
        System.out.println(contiue);
    }
}

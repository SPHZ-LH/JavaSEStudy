public class draft {
    public static void main(String[] args) {
        String s1 ="dajls";
        int hello = System.identityHashCode(s1);
        System.out.println(hello);
        s1="djalk";
        hello = System.identityHashCode(s1);
        System.out.println(hello);
        hello = System.identityHashCode(new String("hello"));
        System.out.println(hello);

    }
}

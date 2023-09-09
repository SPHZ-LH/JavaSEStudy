public class test4 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("abc");
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}

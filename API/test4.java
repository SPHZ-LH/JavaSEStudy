public class test4 {
    public static void main(String[] args) {
        String qq = "1234567890";
        boolean flag = checkQQ(qq);
        System.out.println(flag);
    }

    public static boolean checkQQ(String qq) {
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        } else if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

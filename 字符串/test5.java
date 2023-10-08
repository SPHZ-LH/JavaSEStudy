public class test5 {
    public static void main(String[] args) {
        String str = "abcde";
        String str1 = "bcdea";
        boolean flag = Control(str, str1);
        System.out.println(flag);
    }

    public static String conversion(String str) {
        String result = "";
        char HMchar = str.charAt(0);
        String endStr = str.substring(1);
        result = result + endStr + HMchar;
        return result;
    }

    public static boolean Control(String str, String str1) {
        for (int i = 0; i < str.length(); i++) {
            str = conversion(str);
            if (str.equals(str1)) {
                return true;
            }
        }
        return false;
    }
}

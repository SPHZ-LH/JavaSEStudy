package IntPut;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str ="寝室长";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes2));
        String s =new String(bytes2,"UTF-8");
        String s1 =new String(bytes1);
        System.out.println(s1);
        System.out.println(s);
        byte[] bytes3 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes3));
        String s2 =new String(bytes3,"GBK");
        System.out.println(s2);
    }
}

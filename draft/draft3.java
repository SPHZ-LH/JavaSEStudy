import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class draft3 {
    public static void main(String[] args) {
        String str1 = "三段分式";
        String str2 = "时间";
        long frist = System.currentTimeMillis();
        System.out.print(str1);
        System.out.print(" ");
        System.out.println(str2);
        long end = System.currentTimeMillis();
        System.out.println("三段分式时间" + (end - frist));
        long Frist1 = System.currentTimeMillis();
        System.out.println(str1 + " " + str2);
        long End1 = System.currentTimeMillis();
        System.out.println("一段分式时间" + (End1 - Frist1));
    }
}

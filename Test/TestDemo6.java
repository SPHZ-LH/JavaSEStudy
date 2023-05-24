package Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TestDemo6 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs =new LinkedHashSet<>();
        ArrayList<String> list =new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        while (true) {
            String name = sc.next();
            if (name.equals("end")) {
                break;
            } else {
                list.add(name);
            }
        }

        for (String name : list) {
            lhs.add(name);
        }

        for (String name : lhs) {
            System.out.println(name);
        }
    }
}

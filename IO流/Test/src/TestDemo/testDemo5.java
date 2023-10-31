package TestDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class testDemo5 {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        File src = new File("IO流\\a.txt");
        List<String> strings = FileUtils.readLines(src, "UTF-8");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> boysList = new ArrayList<>();
        ArrayList<String> girlsList = new ArrayList<>();
        for (String string : strings) {
            String[] split = string.split("-");
            if (split[1].equals("男")) {
                boysList.add(split[0]);
            } else {
                girlsList.add(split[0]);
            }
        }
        int boysCount = 0;
        int girlsCount = 0;
        for (int i = 0; i < 1000000; i++) {
            if (r.nextInt(10) < 7) {
                String s = boysList.get(r.nextInt(boysList.size()));
                list.add(s + "（男）");
                boysCount++;
            } else {
                String s = girlsList.get(r.nextInt(girlsList.size()));
                list.add(s + "（女）");
                girlsCount++;
            }
        }
        System.out.println(list);
        System.out.println(boysCount + ":" + girlsCount);
    }
}

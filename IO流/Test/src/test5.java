import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO流\\a.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();
        list.sort((o1, o2) -> {
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1 - i2;
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO流\\a.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}

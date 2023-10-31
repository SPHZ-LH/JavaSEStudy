import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO流\\a.txt");
        StringBuffer sb = new StringBuffer();
        int b;
        while ((b = fis.read()) != -1) {
            sb.append((char) b);
        }
        fis.close();
        String str = sb.toString();
        String[] split = str.split("-");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        StringJoiner sj = new StringJoiner("-", "", "");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }
        FileWriter fw = new FileWriter("IO流\\a.txt");
        fw.write(sj.toString());
        fw.close();
    }
}

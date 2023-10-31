import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class test4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO流\\a.txt");
        StringBuffer sb = new StringBuffer();
        int b;
        while ((b = fr.read()) != -1) {
            sb.append((char) b);
        }
        fr.close();
        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        String replace = Arrays.toString(arr).replace(", ", "-");
        String result = replace.substring(1, replace.length() - 1);
        FileWriter fw = new FileWriter("IO流\\a.txt");
        fw.write(result);
        fw.close();
    }
}

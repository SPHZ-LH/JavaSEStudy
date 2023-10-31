package TestDemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class testDemo4 {
    public static void main(String[] args) throws IOException {
        File src = new File("IO流\\a.txt");
        List<String> strings = FileUtils.readLines(src, "UTF-8");
        Collections.shuffle(strings);
        System.out.println(strings.get(0).split("-")[0]);
    }
}

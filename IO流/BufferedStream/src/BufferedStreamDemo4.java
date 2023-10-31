import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(new FileWriter("IO流\\a.txt"));
        bw.write("寝室长你妈妈的");
        bw.newLine();
        bw.write("寝室长你在干嘛呢");
        bw.newLine();
        bw.close();
    }
}

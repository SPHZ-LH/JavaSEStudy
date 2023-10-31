import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IO流\\a.txt");
        fw.write("寝室长你还老子分");
        fw.close();
    }
}
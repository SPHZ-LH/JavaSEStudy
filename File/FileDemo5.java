import java.io.File;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));
    }
}

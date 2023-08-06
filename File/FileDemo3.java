import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\aaa");
        f.mkdirs();
        File f1 =new File(f, "a.txt");
        boolean flag = f1.createNewFile();
        if(flag){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}

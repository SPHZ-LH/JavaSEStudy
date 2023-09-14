import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File f =new File("C:\\Users\\SPHZ\\Desktop\\代码\\新建文件夹");

        delete(f);

    }

    public static void delete(File src){
        File[] Files = src.listFiles();

        // 删除子文件
        for (File File : Files) {
            if(File.isFile()){
                File.delete();
            }else{
                delete(File);
            }
        }

        // 删除父级文件夹与子级文件夹
        src.delete();
    }
}

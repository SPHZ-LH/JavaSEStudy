import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class FileDemo8 {
    public static void main(String[] args) {

        File f = new File("D:\\javaProject");
        HashMap<String, Integer> hm = getCount(f);
        System.out.println(hm);
    }

    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] Files = src.listFiles();
        for (File File : Files) {
            if (File.isFile()) {
                // 如果是文件
                String name = File.getName();
                String[] split = name.split("\\.");
                String endName = split[split.length - 1];
                // 判断hm是否存在该文件
                if (hm.containsKey(endName)) {
                    // 如果存在
                    Integer count = hm.get(endName);
                    count++;
                    hm.put(endName, count);
                } else {
                    // 如果不存在
                    hm.put(endName, 1);
                }
            } else {
                // 如果是文件夹
                HashMap<String, Integer> sonMap = getCount(File);
                Set<String> keySet = sonMap.keySet();
                for (String key : keySet) {
                    Integer sonCount = sonMap.get(key);
                    // 判断父级文件夹是否存在key
                    if (hm.containsKey(key)) {
                        // 如果存在
                        Integer count = hm.get(key);
                        count = count + sonCount;
                        hm.put(key, count);
                    } else {
                        // 如果不存在
                        hm.put(key, sonCount);
                    }
                }
            }
        }
        return hm;
    }
}

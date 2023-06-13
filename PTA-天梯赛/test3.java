import java.util.Scanner;
import java.util.TreeMap;

public class test3 {
    public static void main(String[] args) {
        // 看到输出结果需要排序并且统计，直接使用双列集合TreeMap
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 将字符串变成字符数组，利于统计单个字符
        char[] arr = str.toCharArray();

        // 利用循环添加进集合
        for (int i = 0; i < arr.length; i++) {

            // 将单个字符变为数字
            int num = arr[i] - 48;

            // 查询集合中key列是否存在，存在直接value++，不存在直接存入
            if (hm.containsKey(num)) {
                Integer v = hm.get(num);
                v++;
                hm.put(num, v);
            } else {
                hm.put(num, 1);
            }
        }

        // 利用lambda表达式遍历
        hm.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}

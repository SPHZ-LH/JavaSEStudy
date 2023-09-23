public class test7 {
    public static void main(String[] args) {
        String s = "小诗诗dasddas小丹丹asdjaksd小慧慧";
        String str = s.replaceAll("\\w+", "喜欢");
        System.out.println(str);
        String[] arr = s.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

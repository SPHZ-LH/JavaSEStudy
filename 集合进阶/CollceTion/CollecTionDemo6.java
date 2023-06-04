package CollceTion;
public class CollecTionDemo6 {
    public static void main(String[] args) {
        MyArrayList<String> list =new MyArrayList<>();
        list.add("寝室长");
        list.add("刘浪雨");
        list.add("小颜同志");

        String str = list.get(2);
        System.out.println(str);
        System.out.println(list);
    }
}

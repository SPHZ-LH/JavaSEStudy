package 继承.x003;

public class Test {
    public static void main(String[] args) {
        Teacher t =new Teacher("103", "寝室长");
        t.show();
        System.out.println(t.getId()+","+t.getName());
        Tuto T =new Tuto();
        T.setId("103");
        T.setName("刘浪雨");
        T.show();
        System.out.println(T.getId()+","+T.getName());
    }
}

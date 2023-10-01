package 继承.x006;

public class Test {
    public static void main(String[] args) {
        PingPongCoach  p =new PingPongCoach("张三", 20);
        p.teach();
        System.out.println(p.getName()+" "+p.getAge());
    }
}

package 继承.x004;

public class Test2 {
    public static void main(String[] args) {
        Cat j =new Cat(2, "黑");
        show(j);
    }

    public static void show(Animal j){
        j.eat();
    }
}

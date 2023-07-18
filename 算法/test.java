public class test {
    public static void main(String[] args) {

        method(() -> {
            System.out.println("正在游泳");

        });
        method(() -> System.out.println("正在游泳"));
        method(new Swim() {

            @Override
            public void swimming() {
                System.out.println("游泳");

            }

        });
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}

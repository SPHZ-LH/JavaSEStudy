package 方法引用;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        Consumer<String> con3 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("hello");
            }
        };
        Consumer<String> con1 = System.out::println;
        con1.accept("Hello");

        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("Hello");
    }

    public static void test2() {
        Student stu = new Student("张三", 13, 1);

        Supplier<String> sup2 = stu::getName;

        Function<Student, String> fun = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };

        Function<Student, String> fun2 = Student::getName;

        Supplier<String> sup3 = new Supplier<String>() {
            @Override
            public String get() {
                return stu.getName();
            }
        };
        System.out.println(sup2.get());

        Supplier<String> sup1 = () -> stu.getName();
        System.out.println(sup1.get());
    }

    public static void test3() {
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 21));

        Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com1.compare(12, 21));
    }
}

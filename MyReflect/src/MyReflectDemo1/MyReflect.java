package MyReflectDemo1;

public class MyReflect {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.第一种方式
        //全类名：  包名 + 类名
        //最为常用
        Class clazz1 = Class.forName("MyReflectDemo1.Student");

        //2.第二种方式
        //一般更多的是当作参数进行传递
        Class clazz2 = Student.class;

        //3.第三种方式
        //当我们已经有了这个类的对象时，才可以使用
        Student s = new Student();
        Class clazz3 = s.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}

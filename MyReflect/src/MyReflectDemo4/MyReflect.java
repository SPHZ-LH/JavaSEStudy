package MyReflectDemo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MyReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //1.获取class字节码文件对象
        Class<?> clazz = Class.forName("MyReflectDemo4.Student");

        //2.获取里面所有的方法对象（包含父类中所有的公共方法）
        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //获取里面所有的方法对象（不能获取父类的，但是可以获取本类中私有的）
        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        //获取指定的单一方法
        Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);

        //获取方法的修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);

        //获取方法的名字
        String name = m.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        Student s = new Student();
        m.setAccessible(true);
        //参数一s：表示方法的调用者
        //参数二“汉堡包”：表示在调用方法的时候传递的实际参数
        m.invoke(s, "汉堡包");
    }
}

package MyReflectDemo3;

import java.lang.reflect.Field;
import java.util.Set;

public class MyReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //1.获取class字节码文件的对象
        Class clazz = Class.forName("MyReflectDemo3.Student");

        //2.获取成员变量
        /*Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        //获取单个的成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        //获取成员变量的名字
        String n = name.getName();
        System.out.println(n);

        //获取成员变量的数据类型
        Class<?> type = name.getType();
        System.out.println(type);

        //获取成员变量记录的值
        Student s = new Student("zhangsan", 23, "男");
        name.setAccessible(true);
        String value = (String) name.get(s);
        System.out.println(value);

        //修改对象里记录的值
        name.set(s, "lisi");

        System.out.println(s);
    }
}

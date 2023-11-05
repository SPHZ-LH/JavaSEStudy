package 填空题;

class Person {
    public Person() {

        System.out.println("创建一个Person");

    }
}

class Employee extends Person {

    private int age;

    public Employee(int age) {
        System.out.println("创建一个Employee");
        setAge(age);
        System.out.println("年龄为：" + age);
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age >= 0)
            this.age = age;
        else
            throw new IllegalArgumentException("年龄不能为负数");
    }
}

public class test3 {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(10);
            Employee emp2 = new Employee(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("继续.....");
        }
        System.out.println("任务完成！");
    }
}
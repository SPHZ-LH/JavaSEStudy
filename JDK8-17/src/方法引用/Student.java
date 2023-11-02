package 方法引用;

public class Student {
    private String name;
    private Integer age;
    private Integer gander;


    public Student() {
    }

    public Student(String name, Integer age, Integer gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gander
     */
    public Integer getGander() {
        return gander;
    }

    /**
     * 设置
     * @param gander
     */
    public void setGander(Integer gander) {
        this.gander = gander;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gander = " + gander + "}";
    }
}

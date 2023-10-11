public class GirFriend {

    private String name;
    private int age;
    private String gender;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void steAge(int a) {
        if (a >= 18 && a < 30) {
            age = a;
        } else {
            System.out.println("输入的值无效");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender =g;
    }

    public String getGender(){
        return gender;
    }

    public void eat(){
        System.out.println("女朋友正在吃饭");
    }

    public void sleep(){
        System.out.println("女朋友正在睡觉");
    }
}

import java.util.ArrayList;

public class test5 {
    public static void main(String[] args) {
        ArrayList<User> list =new ArrayList<>();
        User s1 =new User("badong001", "zhangsan", 18);
        User s2 =new User("badong002", "lisi", 19);
        User s3 =new User("badong003", "wangwu", 21);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        boolean flag =false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals("badong001")){
            flag =true;
            }
        }
        System.out.println(flag);
    }
}

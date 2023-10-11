public class GirFriendTest {
    public static void main(String[] args) {
        GirFriend gf1 =new GirFriend();

        gf1.setGender("女");
        gf1.setName("小慧慧");
        gf1.steAge(19);


        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();
    }
}

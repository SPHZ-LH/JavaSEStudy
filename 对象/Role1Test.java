public class Role1Test {
    public static void main(String[] args) {
        Role1 r1 = new Role1("寝室长", 100);
        Role1 r2 = new Role1("徐照升", 100);
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O.了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O.了" + r1.getName());
                break;
            }
        }
    }
}

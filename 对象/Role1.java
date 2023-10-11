import java.util.Random;

public class Role1 {
    private String name;
    private int blood;

    public Role1() {
    }

    public Role1(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role1 role1) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int spsBlood = role1.getBlood() - hurt;
        spsBlood = spsBlood < 0 ? 0 : spsBlood;
        role1.setBlood(spsBlood);
        System.out.println(this.getName() + "攻击了" + role1.getName() + "，" + role1.getName() + "受到了" + hurt + "伤害，剩余了"
                + spsBlood + "血量");
    }
}

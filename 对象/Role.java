import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyFace={"风流倜傥","逸群之才","淑人君子","品貌非凡","清新俊逸","醉玉颓山"};
    String[] grilFace={"闭月羞花","国色天香","倾国倾城","亭亭玉立","窈窕淑女","秀色可餐"};

    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        setFace(gender);
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

    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r=new Random();
        if(gender=='男'){
        int num1=r.nextInt(boyFace.length);
        this.face =boyFace[num1];
        }else if(gender=='女'){
        int num2=r.nextInt(grilFace.length);
        this.face =grilFace[num2];
        }

    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int spsBlood = role.getBlood() - hurt;
        spsBlood = spsBlood < 0 ? 0 : spsBlood;
        role.setBlood(spsBlood);
        System.out.println(this.getName() + "攻击了" + role.getName() + "，" + role.getName() + "受到了" + hurt + "伤害，剩余了"
                + spsBlood + "血量");
    }

    public void behavior(){
        System.out.println(getName());
        System.out.println(getBlood());
        System.out.println(getGender());
        System.out.println(getFace());
    }
}
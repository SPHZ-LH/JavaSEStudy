
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<MuppetCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TedayDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        MuppetCat s1 =new MuppetCat();
        s1.setAge(2);
        s1.setName("甜甜");
        MuppetCat s2 =new MuppetCat();
        s2.setName("诗诗");
        s2.setAge(1);
        list1.add(s1);
        list1.add(s2);
        keepPet(list1);
    }

    public static void keepPet(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }
    }
}

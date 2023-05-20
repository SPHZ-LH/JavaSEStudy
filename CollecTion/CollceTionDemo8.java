import java.util.ArrayList;

public class CollceTionDemo8 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list3);
    }

    public static void method(ArrayList<? extends Ye> list) {

    }
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

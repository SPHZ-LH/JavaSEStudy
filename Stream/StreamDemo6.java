import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(manList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,22", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womanList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");
        Stream<String> stream1 = manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> stream2 = womanList.stream().filter(s -> s.split("-")[0].startsWith("杨")).skip(1);
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(t -> new Actor(t.split(",")[0], Integer.parseInt(t.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

class Actor {
    private String name;
    private int age;

    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Actor other = (Actor) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Actor [name=" + name + ", age=" + age + "]";
    }

}

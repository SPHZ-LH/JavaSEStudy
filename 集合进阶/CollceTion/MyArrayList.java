package CollceTion;
import java.util.Arrays;

public class MyArrayList<E> {
    Object[] obj = new Object[10];
    private int index;

    public boolean add(E e) {
        obj[index] = e;
        index++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

    
}

import java.util.Arrays;

// It will restrict that CustomArrayList object can only be of type Integer
// public class CustomArrayList<T extends Integer> {
public class CustomArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            reset();
        }
        data[size] = num;
        size++;
    }

    private boolean isFull() {
        return data.length == size;
    }

    private void reset() {
        Object[] temp = new Object[2 * data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T remove = (T) (data[size]);
        size--;
        return remove;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

}
package Collection.example;

public class BooleanArrays implements ArraysLogic {
    boolean [] arr = new boolean[size];
    int index;
    public void setIndex(int index) {
        if (index < size && index >= 0) {
            this.index = index;
        } else {
            throw new IllegalArgumentException("Индекс от 0 до " + (size - 1));
        }
    }
    @Override
    public void setTrue(int index) {
        setIndex(index);
        arr[index] = true;
    }
    @Override
    public void setFalse(int index) {
        setIndex(index);
        arr[index] = false;
    }
    @Override
    public void setTrueFalse(int index, boolean f) {
        setIndex(index);
        arr[index] = f;
    }
    @Override
    public boolean getByIndex(int index) {
        return arr[index];
    }
    @Override
    public void revers(int index) {
        arr[index] = !arr[index];

    }
    @Override
    public int howManyTrue() {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                ++s;
            }
        }
        return s;
    }
    @Override
    public String toString() {
        String[] str = new String[size];
        for (int i = 0; i < size - 1; i++) {
            str[i] = getByIndex(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }
}

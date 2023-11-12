package Collection.example;

public class IntArrray implements ArraysLogic {
    int[] arr = new int[size / 32];
    int index;
    public void setIndex(int index) {
        if (index < size && index >= 0) {
        this.index = index;}
        else {
        throw new IllegalArgumentException("Индекс от 0 до " + (size-1));}
    }
    public void setTrue(int index) {
        setIndex(index);
        int indexArr = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = arr[indexArr];
        arr[indexArr] =mask |element;
    }
    public void setFalse(int index) {
        setIndex(index);
        int indexArr = index / 32;
        int bit = index % 32;
        int mask = ~ (1 << bit);
        int element = arr[indexArr];
        arr[indexArr] = mask & element;
    }
    public void setTrueFalse(int index, boolean f) {
        setIndex(index);
        int indexArr = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = arr[indexArr];
        if (!f) {
            if (mask != element) {
                arr[indexArr] = mask & element;
            } else {
                arr[indexArr] = mask ^ element;
            }
        }else {arr[indexArr] =mask |element;}
   }

    public boolean getByIndex(int index) {
        setIndex(index);
        int indexArr = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = arr[indexArr];
        return (mask & element) == mask;
    }
    public void revers(int index) {
        setIndex(index);
        int indexArr = index / 32;
        int bit = index % 32;
        int mask = 1<<bit;
        int element = arr[indexArr];
        arr[indexArr] = mask^element;
    }
    public int howManyTrue () {
        int s = 0;
        for (int i = 0; i < size; i++){
            int indexArr = i / 32;
            int bit = i % 32;
            int mask = 1 << bit;
            int element = arr[indexArr];
            if ((mask & element) == mask) {
                s = s + 1;
            }
        }return s;
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

package Collection.example;

public class Main {

    public static void main(String[] args) {
        IntArrray arr = new IntArrray();
       /* System.out.println(arr);
        System.out.println(arr.getByIndex(6));
        arr.setTrue(6);
        System.out.println(arr.getByIndex(6));
        System.out.println(arr);
        arr.setTrue(6);
        System.out.println(arr.getByIndex(6));
        System.out.println(arr);
        arr.setFalse(6);
        System.out.println(arr.getByIndex(6));
        System.out.println(arr);
        arr.setFalse(6);
        System.out.println(arr.getByIndex(6));
        System.out.println(arr);
        System.out.println(arr.howManyTrue());*/
        arr.setTrue(3);
        arr.setTrue(2);
        arr.setTrue(54);
        arr.setTrue(9);
        //arr.revers(0);

        System.out.println(arr.getByIndex(0));
        System.out.println(arr.getByIndex(2));
        System.out.println(arr.getByIndex(54));
        System.out.println(arr.getByIndex(9));
        System.out.println(arr.howManyTrue());
        BooleanArrays arr1 = new BooleanArrays();
        System.out.println(arr1);
        arr1.setTrue(0);
        arr1.setTrue(3);

        System.out.println(arr1.getByIndex(0));
        System.out.println(arr1);
        arr1.setFalse(0);
        System.out.println(arr1.getByIndex(0));
        System.out.println(arr1);
        arr1.revers(0);
        System.out.println(arr1.getByIndex(0));
        System.out.println(arr1);
        System.out.println(arr1.howManyTrue());
    }
}
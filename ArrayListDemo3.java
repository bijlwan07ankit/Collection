package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        String Arr[] = {"dog", "Elelphant", "cat"};
        for (String value : Arr) {
            System.out.println(value);
        }
//        todo:to convert array into array list   arrays.aslist(arr)
        ArrayList al = new ArrayList(Arrays.asList(Arr));
        System.out.println(al);

    }
}

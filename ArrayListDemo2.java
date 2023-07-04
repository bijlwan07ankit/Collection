package collectiondemo;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add('x');
        al.add('y');
        al.add('z');
        al.add('a');
        al.add('b');
        al.add('c');

//        todo: addall : to  put all element in other
        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);
        al_dup.removeAll(al);
        System.out.println("after removing" +al_dup);

//        todo:sort and array list   collections.sort()
        System.out.println("element in arraylist"+al);
        Collections.sort(al);
        System.out.println("After sorting"+al);  //in ascending order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("revverse sort"+al);
        Collections.shuffle(al);
        System.out.println("After shuffling"+al);




    }


}

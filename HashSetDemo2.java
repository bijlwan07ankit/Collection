package collectiondemo;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet <Integer>evennumber = new HashSet<Integer>();
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        System.out.println("HashSet"+evennumber);
//        todo:add elemennt of 1 hash set to another
        HashSet<Integer>number=new HashSet<Integer>();
        number.addAll(evennumber);
        System.out.println(number);
//       todo: add an element
        number.add(10);
        System.out.println(number);

        //todo:remove all
        number.removeAll(number);
        System.out.println(number);

    }
}

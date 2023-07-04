package collectiondemo;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        //union intersection,difference
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("set1" + set1);
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("set2" + set2);
//
////      todo:for union
//        set1.addAll(set2);
//        System.out.println("union"+set1);
//
////        todo:intersection
//        set1.retainAll(set2);
//        System.out.println("intersection"+set1);

////        todo:difference
//        set1.removeAll(set2);
//        System.out.println("Difference"+set1);

//    todo:subset
            set1.containsAll(set2);
        System.out.println("subset"+set1);
    }

}

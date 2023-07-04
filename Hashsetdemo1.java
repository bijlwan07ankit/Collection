package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo1 {
    public Hashsetdemo1() {
        super();
    }

    public static void main(String[] args) {
        HashSet hs = new HashSet();  //default hashset capacity 16 load factor 75%
//        HashSet hs1=new HashSet(100);   //initial capacity
//        HashSet hs2=new HashSet(100,(float)0.90);  //load factor 90
//        HashSet <Integer>hs3=new HashSet<Integer>();

//        todo: add elements /objects in hashset
        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('a');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);  //insertion order not save
// todo: remove

        hs.remove(16.4);
        System.out.println("after remove element" + hs);

        //todo:contains

        System.out.println(hs.contains("welcome"));

//        todo:isEmpty
        System.out.println(hs.isEmpty());

//       todo: reading objects or elements from hashset using for each ... loop

//        for (Object e : hs) {
//            System.out.println(e);
//        }
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}

package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListdemo1 {
    public static void main(String[] args) {
//
//       todo: declare the Linked List
        //        LinkedList <Integer> l1=new LinkedList<Integer>();
//        LinkedList <String> l2=new LinkedList<String>();
        LinkedList l = new LinkedList();
//
//        todo:add element to Linkedalist
        l.add(345);
        l.add("Welcome");
        l.add(43.34);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);

//        todo:size of Linkedlist
        System.out.println(l.size());//6

        //todo:remove

        l.remove(3);
        System.out.println("after removal of 3rd index" + l);

        // todo: inserting element in the middle of linked list
        l.add(3, "Anki");
        System.out.println("after adding element at 3rd index" + l);

//
//       todo:retriving value/object
        System.out.println(l.get(3));
//
//           todo:change value/object
        l.set(2, "ankit");
        System.out.println(l);
//
//        todo:contains()
        System.out.println(l.contains("ankit"));//true
//
//        todo:isEmpty()
        System.out.println(l.isEmpty()); //false
//
//        todo:reading element from LL using for  loop
//
//                for(int i=0;i<l.size();i++) {
//                    System.out.println(l.get(i));

//                      todo:reading element from LL using for each loop
//               for (Object e:l){
//                   System.out.println(e);

//                   todo: todo:reading element from LL using iterator

        Iterator it = l.iterator();


        while (it.hasNext()) {
            it.next();
            System.out.println(it.next());
            System.out.println(it.hasNext());
        }
    }
}

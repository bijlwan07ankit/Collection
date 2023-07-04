package collectiondemo;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");
        System.out.println(l);
//        todo:i wnat to add a new element as first node
    l.addFirst("Tiger");
//        todo:i wnat to add a new element as last node

    l.addLast("elephant");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
//        todo:remove first and last
    l.removeFirst();
    l.removeLast();
        System.out.println("After removing first and last element"+l);
    }

}

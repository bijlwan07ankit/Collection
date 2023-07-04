package collectiondemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListDemo2 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add('x');
        l.add('y');
        l.add('z');
        l.add('a');
        l.add('b');
        l.add('c');
//        todo:i want to add all this in a new linkedlist
        LinkedList l2=new LinkedList();
        l2.addAll(l);  //add multiple object in a linked list
        System.out.println(l2);
        l2.removeAll(l2);//remove multiple object in a linked list
        System.out.println("after remove all element"+l2);

//        todo:sort()  collections.sort(collection)
        System.out.println("before sorting"+l);
        Collections.sort(l);
        System.out.println("after sorting"+l);
//        todo:sort() in reverse order
          Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse sorting"+l);

//        todo:shuffle
        Collections.shuffle(l);
        System.out.println("after shuffle"+l);

    }
}

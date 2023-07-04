package collectiondemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
//        todo:priority queue
        PriorityQueue q = new PriorityQueue(); //[A, A, B, C, C] insertion order preserve and duplication is allowed

        //    todo:Adding elements ass() offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(1990);
        System.out.println(q);
        //todo:get head element element() or peak()
//        System.out.println(q.element());//A returns head element, if they returns not suchElementException

        System.out.println(q.peek());  //A  returns head element, if empty returns null

        //return &remove element from the queue remove()  poll()
//        System.out.println(q.remove());//A
        System.out.println(q.poll());//A  return and remove the element   if queue is empty the returning exception
//        System.out.println(q); //return and remove the element   if queue is empty the returning null
//  todo:to read all element  we can use iterator method

//        Iterator itr = q.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//
//        }
//todo:with for each loop
        for (Object ele : q) {
            System.out.println(ele);

        }
    }
}



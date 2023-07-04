package collectiondemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtabledemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();    //capacity 11, load factor 0.75
        Hashtable t = new Hashtable(20);
        Hashtable t2 = new Hashtable(20, 75);//(initial capacity,load factor)
        Hashtable<Integer, String> t3 = new Hashtable<Integer, String>(20, 75);
//    todo:add data into hashtable
        t3.put(101, "Ankit");
        t3.put(102, "Divya");
//        t3.put(103,"null");//: Cannot invoke "Object.hashCode()" because "key" is null
        t3.put(104, "Amit");
        t3.put(105, "Vasu");
//        t3.put(null,"Ankit");  //Cannot invoke "Object.hashCode()" because "key" is null
        t3.put(106, "Ankit");
        System.out.println(t3);

//        todo:get a value

        System.out.println(t3.get(104)); //amit

//        todo:remove/contains/isEmpty
        t3.remove(106);    // error
        System.out.println(t3);
        System.out.println(t3.containsKey(103));  //false
        System.out.println(t3.containsKey(102));
        System.out.println(t3.containsValue("Amit"));
        System.out.println(t3.containsValue("anb"));
        System.out.println(t3.isEmpty());

//        todo:key set: will return all the key and values
        System.out.println(t3.keySet());  //all key (this will return as a set) no duplication
        System.out.println(t3.values());  // all values   (this will return as a collection)

//        todo:loop statement
        for (int k : t3.keySet()) {
            System.out.println(k + "       " + t3.get(k));
        }

//todo:Entry specific method

//    for (Map.Entry entry:t3.entrySet())    //key value
//    {
//        System.out.println(entry.getKey()+"       "+entry.getValue());

//        todo:by using iterator method
        Set s = t3.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"         "+entry.getValue());
        }
    }
}


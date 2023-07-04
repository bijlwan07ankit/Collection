package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapdemo1 {
    public static void main(String[] args) {
//        HashMap hm = new HashMap();
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(101, "Amit");
        hm.put(102, "Ankit");
        hm.put(103, "Divya");
        hm.put(104, "Vasu");
        hm.put(105, "Mohit");
        System.out.println(hm);
//        todo:value a value by passing a key
        System.out.println(hm.get(105));
//        todo:remove a element
        hm.remove(103);
        System.out.println(hm);
        //        todo:contains key/value ,is empty
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsKey(106));
        System.out.println(hm.containsValue("Ankit"));
        System.out.println(hm.containsKey("Anku"));
        System.out.println(hm.isEmpty());
        //        todo:key set method /values
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        //        todo:entryset:
        System.out.println(hm.entrySet()); //  return type is set all entry will return as a set


//        todo:for each loop
//    for(Object i :hm.keySet())   //for key only
//        {
//            System.out.println(i);
//
//        for(Object i :hm.values())   //only for value
//        {
//            System.out.println(i);

//        for(Object i :hm.keySet())    // for key value
//        {
//            System.out.println(i+"     "+hm.get(i));
// todo: Entry loop
//       Emtry Method
for (Map.Entry entry:hm.entrySet()){
    //todo: type of variable is Map.entry  also we have to define  hash map as HashMap<Integer,String> hm=new HashMap<Integer,String>();
    System.out.println(entry.getKey()+"    "+entry.getValue());
}


//todo:Itererator Method
  Set s=hm.entrySet();
    Iterator itr=s.iterator();
    while(itr.hasNext()){
        Map.Entry entry= (Map.Entry) itr.next();
        System.out.println(entry.getKey()+"      "+entry.getValue());//map.enttry will be data type of entry


    }

    }
    }




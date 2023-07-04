package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class Arraylistdemo1 {
    public static void main(String[] args) {
//declare array list
        ArrayList<String> al1= new ArrayList<String>();
        //List<Integer> al2=new ArrayList<>();
//        List<Integer> ab=new ArrayList<>();
        ArrayList al = new ArrayList();
        //Add a new element
        al.add("ANKIT");
        al.add(30);
        al.add('a');
        al.add(true);
        al.add(12.32);
        System.out.println(al);
        System.out.println(al.size());
//       al.remove("ANKIT");
        al.remove(0);
        System.out.println(al);
        System.out.println(al.size());
        al.add(0, "Ankit");//add at 0 th  index
        System.out.println(al);
//       to get a perticuler value
        System.out.println((al.get(3)));
//        to change the value
        al.set(0, "amit");
        System.out.println(al);

//        todo:search-contains()  returns true/false
        System.out.println(al.contains("amit"));

//          todo: is empty -False
        System.out.println(al.isEmpty());

//        todo:for loop
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));

//        todo:for each loop
//        System.out.println("Reading element using for .each loop");
//        for(Object i:al){
//            System.out.println(i);

            System.out.println("Reading element using for iterator method");
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());   //printig the element and move to next
        }
    }
}

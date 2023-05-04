import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class CollectionFramework {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();
        
       // Integer,Boolean, Float, Double, Character, Short, Long,
        //Integer i=23;
        //Wrapper class => they provide a lot of functionalities => enhance the primitives usage

        // Byte b= i.byteValue();

        li.add(23);
        li.add(45);
        li.add(65);
        li.add(23);
        li.add(45);
        li.add(65);
        li.size();

        Iterator i =li.iterator();

        while(i.hasNext()){
         System.out.println(" next value is : "+i.next());
        }




        // for(int i=0;i<li.size();i++){

        // }



        // ArrayList<Integer> arrlist =new ArrayList<>(li);
        // ArrayList<Integer> arrlist2=new ArrayList<>(20);
        // System.out.println(arrlist);
        // int i=li.get(2);
        // boolean result=li.contains(43);
        // li.remove(i);
        // // li.add("tree");
        // System.out.println(li);

        //wrapper class
        // int a=23;
        // Integer i =new Integer(23);
        // System.out.println(i);
        // List arrlistObj = new ArrayList();
        // arrlistObj.add(23);
        // arrlistObj.add(12);
        // arrlistObj.add(45);
        // arrlistObj.add("string");
        // arrlistObj.add(45);

        //duplicates in arraylist 
        //types of object can be anyhting
        //dynamic memory growth

        // System.out.println(arrlistObj);
    }
}

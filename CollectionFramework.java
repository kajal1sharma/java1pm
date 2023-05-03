import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();

        li.add(23);
        li.add(45);
        li.add(65);
        li.add(23);
        li.add(45);
        li.add(65);
        int i=li.get(2);
        boolean result=li.contains(43);
        li.remove(i);
        // li.add("tree");
        System.out.println(li);

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

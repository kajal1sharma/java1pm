import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        //wrapper class
        int a=23;
        Integer i =new Integer(23);
        System.out.println(i);
        List arrlistObj = new ArrayList();
        arrlistObj.add(23);
        arrlistObj.add(12);
        arrlistObj.add(45);
        arrlistObj.add("string");
        arrlistObj.add(45);

        //duplicates in arraylist 
        //types of object can be anyhting
        //dynamic memory growth

        System.out.println(arrlistObj);
    }
}

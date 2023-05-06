import java.util.LinkedList;
import java.util.Iterator;

public class CollFramework2 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(23);
        li.add(54);
        li.add(89);
        LinkedList<Integer> li2 = new LinkedList<>();
        li2.add(56);
        li2.add(45);
        li2.addAll(1, li);
        li2.addFirst(12);
        li2.addLast(14);
        System.out.println(li2.contains(12));
        li2.offer(23);
        
        Iterator<Integer> i = li2.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}

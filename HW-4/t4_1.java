import java.util.ArrayDeque;  
import java.util.ArrayList;  
import java.util.Deque;  
import java.util.Iterator;  
import java.util.List;  
import java.util.ListIterator;  

public class t4_1 {
    public static void main(String[] args) {
        
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ListIterator<Integer> itr = null;
        itr = ll.listIterator();

        System.out.println("Актуальный порядок:");
        while (itr.hasNext()) {  
            System.out.println(itr.next());  
        }
        
        System.out.println("Обратный порядок:");
        while (itr.hasPrevious()) {  
            System.out.println(itr.previous());  
        }
    }
}

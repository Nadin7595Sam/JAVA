import java.util.LinkedList;
import java.util.Iterator;

public class t4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sum += element;
        }
        System.out.println("Сумма: " + sum);
    }
}

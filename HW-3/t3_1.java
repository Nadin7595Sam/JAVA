import java.util.ArrayList;
import java.util.Iterator;

public class t3_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number % 2 == 0) {
                iter.remove();
            }
        }

        System.out.println(list);
    }
}
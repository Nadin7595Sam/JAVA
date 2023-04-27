import java.util.ArrayList;
import java.util.Collections;

public class t3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int average = sum / list.size();
        
        System.out.println(average);
    }
}

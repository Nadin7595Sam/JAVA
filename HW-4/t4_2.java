import java.util.*;
import java.util.PriorityQueue;

public class t4_2 {

    public static void main(String[] args) {
        LinkedList<String> planetQueue = new LinkedList<String>();

        planetQueue.add("Марс");
        planetQueue.add("Юпитер");
        planetQueue.add("Сатурн");
        planetQueue.add("Уран");
        planetQueue.add("Нептун");
        System.out.println(planetQueue);

        System.out.println("Первая планета в очереди: " + planetQueue.peek());
        String planet = planetQueue.poll();
        System.out.println("Извлеченная планета: " + planet);
        System.out.println("Первая планета в очереди после извлечения: " + planetQueue.peek());
    }
}
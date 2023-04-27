import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t3_3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Земля");

        for (String planet : planets) {
            int count = Collections.frequency(planets, planet);
            System.out.println(planet + ": " + count);
        }
    }
}

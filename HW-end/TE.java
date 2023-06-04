import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TE {
    public static void main(String[] args) {

        int[] toyIds = { 1, 2, 3 };
        String[] toyNames = { "Машинка", "Юла", "Кукла" };
        int[] toyWeights = { 3, 2, 5 };

        Queue<Toy> toyQueue = new PriorityQueue<>();
        for (int i = 0; i < toyIds.length; i++) {
            Toy toy = new Toy(toyIds[i], toyNames[i], toyWeights[i]);
            toyQueue.offer(toy);
        }

        try (FileWriter writer = new FileWriter("file.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy selectedToy = toyQueue.poll();
                if (selectedToy != null) {
                    String result = "Игрушка: " + selectedToy.getName();
                    System.out.println(result);
                    writer.write(result + "\n");
                }
            }

            System.out.println("Розыгрыш завершен.");
            writer.write("Розыгрыш завершен.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Toy implements Comparable<Toy> {
        private int id;
        private String name;
        private int weight;

        public Toy(int id, String name, int weight) {
            this.id = id;
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Toy other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
}
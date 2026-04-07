import java.util.*;
import java.util.stream.*;

class Bogie {
    int capacity;

    Bogie(int capacity) {
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        // Add sample data
        for (int i = 1; i <= 100000; i++) {
            list.add(new Bogie(i));
        }

        // Loop method
        long start1 = System.nanoTime();
        int sum1 = 0;
        for (Bogie b : list) {
            sum1 += b.capacity;
        }
        long end1 = System.nanoTime();

        // Stream method
        long start2 = System.nanoTime();
        int sum2 = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
        long end2 = System.nanoTime();

        System.out.println("Loop Sum: " + sum1);
        System.out.println("Stream Sum: " + sum2);

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}
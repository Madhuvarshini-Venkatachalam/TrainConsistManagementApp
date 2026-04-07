import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC", 50));
        bogies.add(new Bogie("FirstClass", 30));
        bogies.add(new Bogie("General", 90));

        // Filter: capacity > 50
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        System.out.println("🚆 FILTERED BOGIES (Capacity > 50):");
        filtered.forEach(System.out::println);
    }
}
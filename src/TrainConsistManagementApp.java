import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    String type;
    int capacity;

    Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC", "Passenger", 50),
                new Bogie("CargoBox", "Goods", 0),
                new Bogie("OilTank", "Goods", 0)
        );

        // Grouping
        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b.type));

        System.out.println("🚆 GROUPED BOGIES:");
        for (String key : grouped.keySet()) {
            System.out.println(key + " → " + grouped.get(key));
        }
    }
}
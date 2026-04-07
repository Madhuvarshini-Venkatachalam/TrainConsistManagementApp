import java.util.ArrayList;

public class TrainConsistManagementApp {

    // Inner class to represent a Bogie
    static class Bogie {
        String type;
        int capacity;
        int occupied;

        // Constructor
        Bogie(String type, int capacity, int occupied) {
            this.type = type;
            this.capacity = capacity;
            this.occupied = occupied;
        }

        // Display bogie details
        void display() {
            System.out.println("Bogie Type: " + type);
            System.out.println("Capacity : " + capacity);
            System.out.println("Occupied : " + occupied);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {

        // Train consist list
        ArrayList<Bogie> train = new ArrayList<>();

        // Initialize with some passenger bogies
        train.add(new Bogie("Sleeper", 72, 50));
        train.add(new Bogie("AC Chair", 60, 40));
        train.add(new Bogie("First Class", 24, 10));

        // Display Train Summary
        System.out.println("🚆 TRAIN CONSIST SUMMARY");
        System.out.println("==========================");

        int totalCapacity = 0;
        int totalOccupied = 0;

        for (Bogie b : train) {
            b.display();
            totalCapacity += b.capacity;
            totalOccupied += b.occupied;
        }

        System.out.println("TOTAL BOGIES : " + train.size());
        System.out.println("TOTAL CAPACITY : " + totalCapacity);
        System.out.println("TOTAL OCCUPIED : " + totalOccupied);
        System.out.println("AVAILABLE SEATS : " + (totalCapacity - totalOccupied));
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // HashMap to store Bogie -> Capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        String bogie;
        int capacity;

        do {
            System.out.println("\n🚆 BOGIE CAPACITY MANAGEMENT");
            System.out.println("1. Add Bogie with Capacity");
            System.out.println("2. Display All Bogie Capacities");
            System.out.println("3. Search Capacity by Bogie");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // Add bogie-capacity mapping
                case 1:
                    System.out.print("Enter Bogie Name: ");
                    bogie = sc.nextLine();

                    System.out.print("Enter Capacity: ");
                    capacity = sc.nextInt();

                    bogieCapacity.put(bogie, capacity);
                    System.out.println("✅ Bogie Added/Updated!");
                    break;

                // Display all entries
                case 2:
                    if (bogieCapacity.isEmpty()) {
                        System.out.println("🚫 No bogies available.");
                    } else {
                        System.out.println("\n🚆 BOGIE CAPACITY LIST:");
                        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
                            System.out.println("Bogie: " + entry.getKey() +
                                    " | Capacity: " + entry.getValue());
                        }
                    }
                    break;

                // Search capacity
                case 3:
                    System.out.print("Enter Bogie Name to Search: ");
                    bogie = sc.nextLine();

                    if (bogieCapacity.containsKey(bogie)) {
                        System.out.println("Capacity of " + bogie + " = " +
                                bogieCapacity.get(bogie));
                    } else {
                        System.out.println("❌ Bogie not found!");
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
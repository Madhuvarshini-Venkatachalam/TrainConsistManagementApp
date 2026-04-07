import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        String name;
        int capacity;

        do {
            System.out.println("\n🚆 BOGIE SORTING SYSTEM");
            System.out.println("1. Add Bogie");
            System.out.println("2. Sort by Capacity");
            System.out.println("3. Display Bogies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // Add bogie object
                case 1:
                    System.out.print("Enter Bogie Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Capacity: ");
                    capacity = sc.nextInt();

                    bogieList.add(new Bogie(name, capacity));
                    System.out.println("✅ Bogie Added!");
                    break;

                // Sort using Comparator (Lambda)
                case 2:
                    Collections.sort(bogieList, (b1, b2) -> b1.capacity - b2.capacity);
                    System.out.println("✅ Sorted by Capacity!");
                    break;

                // Display bogies
                case 3:
                    if (bogieList.isEmpty()) {
                        System.out.println("🚫 No bogies available.");
                    } else {
                        System.out.println("\n🚆 SORTED BOGIES:");
                        for (Bogie b : bogieList) {
                            System.out.println(b);
                        }
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
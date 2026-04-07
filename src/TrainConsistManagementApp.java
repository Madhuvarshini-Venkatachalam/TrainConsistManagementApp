import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Bogie class
    static class Bogie {
        String id;
        String type;
        int capacity;
        int occupied;

        Bogie(String id, String type, int capacity, int occupied) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
            this.occupied = occupied;
        }

        void display() {
            System.out.println("Bogie ID   : " + id);
            System.out.println("Type       : " + type);
            System.out.println("Capacity   : " + capacity);
            System.out.println("Occupied   : " + occupied);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {

        ArrayList<Bogie> train = new ArrayList<>();
        HashSet<String> bogieIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n🚆 TRAIN CONSIST MANAGEMENT");
            System.out.println("1. Add Passenger Bogie");
            System.out.println("2. Remove Bogie");
            System.out.println("3. Display Train Summary");
            System.out.println("4. Check Bogie Exists");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // ✅ ADD BOGIE (UC2 + UC3)
                case 1:
                    System.out.print("Enter Bogie ID: ");
                    String id = sc.nextLine();

                    if (bogieIds.contains(id)) {
                        System.out.println("❌ Duplicate ID! Bogie not added.");
                        break;
                    }

                    System.out.print("Enter Bogie Type (Sleeper/AC Chair/First Class): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Capacity: ");
                    int cap = sc.nextInt();

                    System.out.print("Enter Occupied Seats: ");
                    int occ = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    train.add(new Bogie(id, type, cap, occ));
                    bogieIds.add(id);

                    System.out.println("✅ Bogie Added Successfully!");
                    break;

                // ✅ REMOVE BOGIE
                case 2:
                    System.out.print("Enter Bogie ID to Remove: ");
                    String removeId = sc.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < train.size(); i++) {
                        if (train.get(i).id.equalsIgnoreCase(removeId)) {
                            train.remove(i);
                            bogieIds.remove(removeId);
                            removed = true;
                            System.out.println("❌ Bogie Removed!");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("⚠️ Bogie Not Found!");
                    }
                    break;

                // ✅ DISPLAY SUMMARY (UC1 + UC2)
                case 3:
                    if (train.isEmpty()) {
                        System.out.println("🚫 No bogies in train.");
                    } else {
                        int totalCap = 0, totalOcc = 0;

                        System.out.println("\n🚆 TRAIN CONSIST SUMMARY");
                        System.out.println("==========================");

                        for (Bogie b : train) {
                            b.display();
                            totalCap += b.capacity;
                            totalOcc += b.occupied;
                        }

                        System.out.println("TOTAL BOGIES     : " + train.size());
                        System.out.println("TOTAL CAPACITY   : " + totalCap);
                        System.out.println("TOTAL OCCUPIED   : " + totalOcc);
                        System.out.println("AVAILABLE SEATS  : " + (totalCap - totalOcc));
                    }
                    break;

                // ✅ SEARCH USING SET (UC3)
                case 4:
                    System.out.print("Enter Bogie ID to Search: ");
                    String searchId = sc.nextLine();

                    if (bogieIds.contains(searchId)) {
                        System.out.println("✅ Bogie Exists!");
                    } else {
                        System.out.println("❌ Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
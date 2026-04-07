import java.util.LinkedHashSet;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> train = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        String bogie;

        do {
            System.out.println("\n🚆 TRAIN FORMATION (LinkedHashSet)");
            System.out.println("1. Add Bogie");
            System.out.println("2. Display Train Formation");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // Add bogie
                case 1:
                    System.out.print("Enter Bogie Name: ");
                    bogie = sc.nextLine();

                    // add() automatically ignores duplicates
                    if (train.add(bogie)) {
                        System.out.println("✅ Bogie Added!");
                    } else {
                        System.out.println("❌ Duplicate Bogie! Not Added.");
                    }
                    break;

                // Display formation
                case 2:
                    if (train.isEmpty()) {
                        System.out.println("🚫 No bogies in train.");
                    } else {
                        System.out.println("\n🚆 TRAIN FORMATION (ORDER PRESERVED):");
                        for (String b : train) {
                            System.out.print(b + " → ");
                        }
                        System.out.println("END");
                    }
                    break;

                case 3:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
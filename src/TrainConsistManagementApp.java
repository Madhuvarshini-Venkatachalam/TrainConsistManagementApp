public static void main(String[] args) {

    ArrayList<Bogie> train = new ArrayList<>();
    java.util.Scanner sc = new java.util.Scanner(System.in);

    int choice;

    do {
        System.out.println("\n🚆 TRAIN CONSIST MANAGEMENT");
        System.out.println("1. Add Passenger Bogie");
        System.out.println("2. Remove Bogie");
        System.out.println("3. Display Train");
        System.out.println("4. Check Bogie Exists");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {

            case 1:
                System.out.print("Enter Bogie Type (Sleeper/AC Chair/First Class): ");
                String type = sc.nextLine();

                System.out.print("Enter Capacity: ");
                int cap = sc.nextInt();

                System.out.print("Enter Occupied Seats: ");
                int occ = sc.nextInt();

                train.add(new Bogie(type, cap, occ));
                System.out.println("✅ Bogie Added!");
                break;

            case 2:
                System.out.print("Enter Bogie Type to Remove: ");
                String removeType = sc.nextLine();

                boolean removed = false;
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i).type.equalsIgnoreCase(removeType)) {
                        train.remove(i);
                        removed = true;
                        System.out.println("❌ Bogie Removed!");
                        break;
                    }
                }

                if (!removed) {
                    System.out.println("⚠️ Bogie Not Found!");
                }
                break;

            case 3:
                if (train.isEmpty()) {
                    System.out.println("🚫 No bogies in train.");
                } else {
                    int totalCap = 0, totalOcc = 0;

                    for (Bogie b : train) {
                        b.display();
                        totalCap += b.capacity;
                        totalOcc += b.occupied;
                    }

                    System.out.println("TOTAL BOGIES: " + train.size());
                    System.out.println("TOTAL CAPACITY: " + totalCap);
                    System.out.println("TOTAL OCCUPIED: " + totalOcc);
                    System.out.println("AVAILABLE: " + (totalCap - totalOcc));
                }
                break;

            case 4:
                System.out.print("Enter Bogie Type to Search: ");
                String search = sc.nextLine();

                boolean found = false;
                for (Bogie b : train) {
                    if (b.type.equalsIgnoreCase(search)) {
                        found = true;
                        break;
                    }
                }

                if (found) {
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
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add initial bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        // Add at beginning
        consist.addFirst("New Engine");
        System.out.println("\nAfter addFirst():");
        System.out.println(consist);

        // Add at end
        consist.addLast("Extra Guard");
        System.out.println("\nAfter addLast():");
        System.out.println(consist);

        // Insert at position 2
        consist.add(2, "Pantry Car");
        System.out.println("\nAfter inserting Pantry Car at index 2:");
        System.out.println(consist);

        // Remove first bogie
        consist.removeFirst();
        System.out.println("\nAfter removeFirst():");
        System.out.println(consist);

        // Remove last bogie
        consist.removeLast();
        System.out.println("\nAfter removeLast():");
        System.out.println(consist);

        // Final consist display
        System.out.println("\nFinal Train Consist (Ordered):");
        for (String bogie : consist) {
            System.out.print(bogie + " → ");
        }
        System.out.println("END");
    }
}
import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC", "FirstClass", "General"};

        Arrays.sort(bogies);

        System.out.println("🚆 Sorted Bogie Names:");
        for (String b : bogies) {
            System.out.println(b);
        }
    }
}
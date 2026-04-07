import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String[] bogies = {"BG101", "BG102", "BG103", "BG104"};
        String target = "BG103";

        boolean found = false;

        for (String b : bogies) {
            if (b.equals(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("✅ Bogie Found: " + target);
        } else {
            System.out.println("❌ Bogie Not Found");
        }
    }
}
import java.util.*;

@FunctionalInterface
interface SafetyCheck {
    boolean check(String cargoType);
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lambda for safety rule
        SafetyCheck rule = (cargo) -> {
            return !cargo.equalsIgnoreCase("Explosive");
        };

        System.out.print("Enter Cargo Type: ");
        String cargo = sc.nextLine();

        if (rule.check(cargo)) {
            System.out.println("✅ Safe Cargo - Allowed");
        } else {
            System.out.println("❌ Unsafe Cargo - Not Allowed");
        }

        sc.close();
    }
}

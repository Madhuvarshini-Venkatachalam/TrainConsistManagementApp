import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Cargo Type: ");
            String cargo = sc.nextLine();

            if (cargo.equalsIgnoreCase("Explosive")) {
                throw new Exception("Unsafe Cargo!");
            }

            System.out.println("✅ Cargo Assigned Successfully");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            System.out.println("🔒 Safety Check Completed");
            sc.close();
        }
    }
}
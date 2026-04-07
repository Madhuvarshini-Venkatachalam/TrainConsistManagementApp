import java.util.List;

public class UC20SearchException {

    public static boolean searchBogie(List<String> bogies, String target) {

        if (bogies.isEmpty()) {
            throw new RuntimeException("Train is empty");
        }

        for (String b : bogies) {
            if (b.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
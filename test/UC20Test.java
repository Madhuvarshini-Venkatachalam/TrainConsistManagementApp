import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC20Test {

    // Method similar to your UC20 logic
    public boolean searchBogie(List<String> bogies, String target) {
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

    @Test
    void testSearchInEmptyTrain() {
        List<String> bogies = new ArrayList<>();

        Exception exception = assertThrows(RuntimeException.class, () -> {
            searchBogie(bogies, "BG101");
        });

        assertEquals("Train is empty", exception.getMessage());
    }

    @Test
    void testSearchValid() {
        List<String> bogies = Arrays.asList("BG101", "BG102");

        boolean result = searchBogie(bogies, "BG101");

        assertTrue(result);
    }
}
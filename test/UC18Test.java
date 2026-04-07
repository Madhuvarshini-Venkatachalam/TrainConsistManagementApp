import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC18Test {

    @Test
    void testBogieFound() {
        String[] arr = {"BG101", "BG102", "BG103"};
        String target = "BG103";

        boolean found = false;

        for (String s : arr) {
            if (s.equals(target)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    void testBogieNotFound() {
        String[] arr = {"BG101", "BG102"};
        String target = "BG999";

        boolean found = false;

        for (String s : arr) {
            if (s.equals(target)) {
                found = true;
                break;
            }
        }

        assertFalse(found);
    }
}
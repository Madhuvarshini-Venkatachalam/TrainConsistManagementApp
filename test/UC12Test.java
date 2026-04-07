import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC12Test {

    interface SafetyCheck {
        boolean check(int weight);
    }

    @Test
    void testSafety() {
        SafetyCheck check = w -> w < 100;

        assertTrue(check.check(80));
        assertFalse(check.check(150));
    }
}
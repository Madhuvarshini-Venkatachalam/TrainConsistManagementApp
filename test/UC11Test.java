import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC11Test {

    @Test
    void testValidTrainID() {
        String id = "TRN-1234";
        assertTrue(id.matches("TRN-\\d{4}"));
    }

    @Test
    void testInvalidTrainID() {
        String id = "TRAIN123";
        assertFalse(id.matches("TRN-\\d{4}"));
    }
}
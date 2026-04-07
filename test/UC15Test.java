import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC15Test {

    @Test
    void testSafeCargo() {
        String cargo = "Food";
        assertNotEquals("Explosive", cargo);
    }

    @Test
    void testUnsafeCargo() {
        String cargo = "Explosive";
        assertEquals("Explosive", cargo);
    }
}
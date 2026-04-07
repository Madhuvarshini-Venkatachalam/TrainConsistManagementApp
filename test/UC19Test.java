import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC19Test {

    @Test
    void testBogieFound() {
        String[] bogies = {"BG101", "BG102", "BG103", "BG104"};

        int result = UC19BinarySearch.binarySearch(bogies, "BG103");

        assertEquals(2, result);
    }

    @Test
    void testBogieNotFound() {
        String[] bogies = {"BG101", "BG102", "BG103", "BG104"};

        int result = UC19BinarySearch.binarySearch(bogies, "BG999");

        assertEquals(-1, result);
    }
}
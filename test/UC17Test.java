import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class UC17Test {

    @Test
    void testSortNames() {
        String[] arr = {"Sleeper", "AC", "General"};
        String[] expected = {"AC", "General", "Sleeper"};

        Arrays.sort(arr);

        assertArrayEquals(expected, arr);
    }
}
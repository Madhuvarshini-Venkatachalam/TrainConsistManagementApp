import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC10Test {

    @Test
    void testTotalCapacity() {
        List<Integer> capacities = Arrays.asList(50, 60, 70);

        int total = capacities.stream()
                .reduce(0, Integer::sum);

        assertEquals(180, total);
    }
}
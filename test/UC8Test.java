import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;

public class UC8Test {

    @Test
    void testFilterBogies() {
        List<Integer> capacities = Arrays.asList(20, 50, 80);

        List<Integer> result = capacities.stream()
                .filter(c -> c > 40)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList(50, 80), result);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;

public class UC9Test {

    @Test
    void testGrouping() {
        List<String> bogies = Arrays.asList("AC", "Sleeper", "AC");

        Map<String, List<String>> grouped =
                bogies.stream().collect(Collectors.groupingBy(b -> b));

        assertEquals(2, grouped.get("AC").size());
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UC13Test {

    @Test
    void testLoopVsStream() {
        List<Integer> list = Arrays.asList(10,20,30,40);

        int sum1 = 0;
        for(int i : list) sum1 += i;

        int sum2 = list.stream().reduce(0, Integer::sum);

        assertEquals(sum1, sum2);
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThrowingTest {

    @Test
    public void throwing224466ShoulScore0() {
        int expectedScore = 0;

        Throwing throwing = new Throwing(2,2,4,4,6,6);
        int actualScore = throwing.score();

        assertEquals(expectedScore, actualScore);
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThrowingTest {

    @Test
    public void throwing_224466_ShouldScore_0() {
        int expectedScore = 0;

        Throwing throwing = new Throwing(2,2,4,4,6,6);
        int actualScore = throwing.score();

        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void throwing_124466_ShouldScore_100() {
        int expectedScore = 100;

        Throwing throwing = new Throwing(1,2,4,4,6,6);
        int actualScore = throwing.score();

        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void throwing_114466_ShouldScore_200() {
        int expectedScore = 200;

        Throwing throwing = new Throwing(1,1,4,4,6,6);
        int actualScore = throwing.score();

        assertEquals(expectedScore, actualScore);
    }
}

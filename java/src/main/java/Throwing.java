import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Throwing {
    List<Integer> dice;

    public Throwing(int d1, int d2, int d3, int d4, int d5, int d6) {
        dice = new ArrayList<>();
        dice.add(d1);
        dice.add(d2);
        dice.add(d3);
        dice.add(d4);
        dice.add(d5);
        dice.add(d6);
    }

    public int score() {
        int ones = Collections.frequency(dice, 1);
        int score = 0;
        score += ones * 100;
        return score;
    }
}

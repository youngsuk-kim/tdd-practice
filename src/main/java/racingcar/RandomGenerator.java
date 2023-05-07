package racingcar;

import java.util.Random;

public class RandomGenerator {

    public static int of() {
        return new Random().nextInt(10);
    }
}

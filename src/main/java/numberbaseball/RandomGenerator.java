package numberbaseball;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {

    public static int[] of(int count) {
        String numbers = RandomStringUtils.random(count);
        return numbers.chars().toArray();
    }
}

package numberbaseball;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.*;

public class RandomGenerator {
    public static Balls of() {
        String randomString = random(3);

        List<Ball> balls = new ArrayList<>();
        randomString.chars().forEach(randomNumber -> balls.add(new Ball(randomNumber)));

        return new Balls(balls);
    }
}

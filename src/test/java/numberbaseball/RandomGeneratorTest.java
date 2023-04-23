package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RandomGeneratorTest {

    @Test
    void 세자리_숫자_랜덤_제공() {
        Balls balls = RandomGenerator.of();

        assertThat(balls.size()).isEqualTo(3);
    }


}

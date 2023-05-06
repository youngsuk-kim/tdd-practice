package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorTest {

    @Test
    void random() {
        int[] randomNumbers = RandomGenerator.of(3);
        assertThat(randomNumbers.length).isEqualTo(3);
    }
}

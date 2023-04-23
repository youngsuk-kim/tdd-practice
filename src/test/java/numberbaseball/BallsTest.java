package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;


class BallsTest {

    @Test
    void 공의_위치를_맞추는지() {
        Balls balls = new Balls(Arrays.asList(new Ball(1), new Ball(2), new Ball(3)));
        assertThat(balls.position(new Ball(1))).isEqualTo(1);
    }

}
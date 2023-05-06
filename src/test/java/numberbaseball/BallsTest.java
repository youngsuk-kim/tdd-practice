package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class BallsTest {

    @Test
    void strike_1_ball_1() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 3, 4));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void strike_1_ball_2() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 3, 2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(2);
    }

    @Test
    void strike_1_nothing_2() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 4, 5));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getNothing()).isEqualTo(2);
    }

    @Test
    void gameOver() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isZero();
        assertThat(result.gameOver()).isTrue();
    }
}

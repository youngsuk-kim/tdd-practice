package numberbaseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RuleBookTest {

    @Test
    void 스트라이크_판별() {
        List<Ball> ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));
        final Balls balls = new Balls(ballList);
        final RuleBook ruleBook = new RuleBook(balls);

        assertThat(ruleBook.read(new Ball(1), 1)).isEqualTo(BaseBallRule.STRIKE);
    }

    @Test
    void 볼_판별() {
        List<Ball> ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));
        final Balls balls = new Balls(ballList);
        final RuleBook ruleBook = new RuleBook(balls);

        assertThat(ruleBook.read(new Ball(1), 2)).isEqualTo(BaseBallRule.BALL);
    }

    @Test
    void 낫싱_판별() {
        List<Ball> ballList = Arrays.asList(new Ball(1), new Ball(2), new Ball(3));
        final Balls balls = new Balls(ballList);
        final RuleBook ruleBook = new RuleBook(balls);

        assertThat(ruleBook.read(new Ball(4), 1)).isEqualTo(BaseBallRule.NOTHING);
    }
}
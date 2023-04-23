package numberbaseball;

public class RuleBook {

    private final Balls balls;

    public RuleBook(Balls balls) {
        this.balls = balls;
    }

    public BaseBallRule read(Ball ball, int position) {
        if (isStrike(ball, position)) {
            return BaseBallRule.STRIKE;
        }

        if (isBall(ball, position)) {
            return BaseBallRule.BALL;
        }

        if (!balls.contain(ball)) {
            return BaseBallRule.NOTHING;
        }

        return null;
    }

    private boolean isBall(Ball ball, int position) {
        return balls.contain(ball) && balls.position(ball) != position;
    }

    private boolean isStrike(Ball ball, int position) {
        return balls.position(ball) == position;
    }
}

package numberbaseball;

import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public int size() {
        return balls.size();
    }

    public int position(Ball ball) {
        int result = 0;

        for (Ball ball1 : balls) {
            result = result + 1;
            if (ball1.equals(ball)) {
                break;
            }
        }

        return result;
    }

    public boolean contain(Ball ball) {
        return balls.contains(ball);
    }
}

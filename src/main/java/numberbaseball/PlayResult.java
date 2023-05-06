package numberbaseball;

import java.util.ArrayList;
import java.util.List;

public class PlayResult {

    List<BallStatus> ballStatuses = new ArrayList<>();

    public int getStrike() {
        return ballStatuses.stream()
                .filter(ballStatus -> ballStatus == BallStatus.STRIKE)
                .toList().size();
    }

    public int getBall() {
        return ballStatuses.stream()
                .filter(ballStatus -> ballStatus == BallStatus.BALL)
                .toList().size();
    }

    public int getNothing() {
        return ballStatuses.stream()
                .filter(ballStatus -> ballStatus == BallStatus.NOTHING)
                .toList().size();
    }

    public boolean gameOver() {
        return getStrike() == 3;
    }

    public void addStatus(BallStatus ballStatus) {
        ballStatuses.add(ballStatus);
    }
}

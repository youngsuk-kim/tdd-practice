package numberbaseball;

import java.util.List;
import java.util.stream.IntStream;

public class Balls {

    private final List<Integer> answers;

    public Balls(List<Integer> answers) {
        this.answers = answers;
    }

    public BallStatus judge(Ball userBall) {
        long numStrikes = IntStream.range(0, 3)
                .filter(index -> isStrike(userBall, index))
                .count();
        long numBalls = IntStream.range(0, 3)
                .filter(index -> isBall(userBall, index))
                .count();
        if (numStrikes > 0) {
            return BallStatus.STRIKE;
        }
        if (numBalls > 0) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
    
    private boolean isStrike(Ball userBall, int index) {
        return isSameIndex(userBall, index) && isSameNumber(userBall.userNumber(), answers.get(index));
    }

    private boolean isBall(Ball userBall, int index) {
        return !isSameIndex(userBall, index) && isSameNumber(userBall.userNumber(), answers.get(index));
    }

    private boolean isSameNumber(int number, int answer) {
        return number == answer;
    }

    private static boolean isSameIndex(Ball userBall, int answer) {
        return userBall.index() == answer;
    }

    public PlayResult play(List<Integer> userBalls) {
        PlayResult playResult = new PlayResult();
        for (int i = 0; i < userBalls.size(); i++) {
            BallStatus status = judge(new Ball(userBalls.get(i), i));
            playResult.addStatus(status);
        }
        return playResult;
    }
}

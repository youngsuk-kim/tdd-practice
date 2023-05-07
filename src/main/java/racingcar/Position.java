package racingcar;

import java.util.concurrent.atomic.AtomicInteger;

public class Position {
    private final AtomicInteger position = new AtomicInteger();

    public Position(int position) {
        this.position.set(position);

        if (position < 0) {
            throw new IllegalArgumentException("자동차 포지션은 0보다 작아서는 안된다.");
        }
    }

    public void increase() {
        this.position.addAndGet(1);
    }

    public int get() {
        return position.get();
    }
}

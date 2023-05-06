package numberbaseball;

import java.util.Objects;

public record Ball(int userNumber, int index) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return userNumber == ball.userNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNumber);
    }
}

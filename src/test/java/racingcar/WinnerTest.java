package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WinnerTest {

    @Test
    void 우승자_구하기() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("asi");
        Car car3 = new Car("rik");

        car1.move(3);
        car2.move(8);
        car3.move(3);

        List<String> car = Winner.find(new Cars(Arrays.asList(car1, car2, car3)));

        assertThat(car).isEqualTo(Arrays.asList(car2.name().get()));
    }
}
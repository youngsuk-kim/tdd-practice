package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @Test
    void 자동차_이름은_5글자_넘어서는_안된다() {
        assertThatThrownBy(() -> {
            new Car("자동차이름", 1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차의_위치_정보는_마이너스가_될수없다() {
        assertThatThrownBy(() -> {
            new Car("자동차이름", -1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차의_랜덤값이_4이상일_경우_앞으로_한칸_전진한다() {
        Car car = new Car("빵이", 1);
        car.move(4);
        assertThat(car.position()).isEqualTo(2);
    }
}
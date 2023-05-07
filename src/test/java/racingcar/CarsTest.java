package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {

    @Test
    void 모든_자동차는_동시에_이동할_수_있다() {
        Car car1 = new Car("pobi", 3);
        Car car2 = new Car("asi", 3);
        Car car3 = new Car("rik", 8);

        Cars cars = new Cars(Arrays.asList(car1, car2, car3)) {
            @Override
            public List<Car> move() {
                return Arrays.asList(car1, car2, car3);
            }
        };

        assertEquals(new Cars(cars.move()).position(), Arrays.asList(car1.position(), car2.position(), car3.position()));
    }
}
package racingcar;

import java.util.List;

public class Winner {
    public static List<String> find(Cars cars) {
        return cars.farMove().stream().map(car -> car.name().get()).toList();
    }
}

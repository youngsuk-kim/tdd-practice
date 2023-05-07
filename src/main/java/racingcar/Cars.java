package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(List<Car> moveCars) {
        this.cars = moveCars;
    }

    public Cars() {}

    public static Cars createCarWith(List<String> names) {
        Cars cars = new Cars();
        for (String name : names) {
            Car car = new Car(name);
            cars.addCar(car);
        }

        return cars;
    }

    public List<Car> move() {
        cars.forEach(car -> car.move(RandomGenerator.of()));
        System.out.println();
        return cars;
    }

    public Cars moveMultiple(int count) {
        for (int i = 0; i < count; i++) {
            this.move();
        }

        return new Cars(this.cars);
    }

    public List<Car> farMove() {
        int max = this.cars.stream().max(Comparator.comparing(car -> car.position())).get().position();
        return this.cars.stream().filter(car -> car.position() == max).toList();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Integer> position() {
        return this.cars.stream().map(Car::position).toList();
    }
}

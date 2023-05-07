package racingcar;

public class Car {

    private final Name name;
    private Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public void move(int random) {
        if (random >= 4) {
            position.increase();
        }
        System.out.println(this.name.get() + " : " +  "-".repeat(this.position.get()));
    }

    public int position() {
        return position.get();
    }

    public Name name() {
        return this.name;
    }
}

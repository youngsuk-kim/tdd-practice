package racingcar;

public class Name {
    private final String value;

    public Name(String value) {
        this.value = value;

        if (value.length() >= 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 넘어서는 안된다.");
        }
    }

    public String get() {
        return value;
    }
}

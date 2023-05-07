package racingcar;

import java.util.Arrays;
import java.util.List;

public class NameParser {
    public static List<String> parse(String nameString) {
        return Arrays.asList(nameString.split(","));
    }
}

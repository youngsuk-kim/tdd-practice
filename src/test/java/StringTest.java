import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo(actual);
    }

    @Test
    void split_divide() {
        String actual = "1,2";
        String[] sut = actual.split(",");

        assertThat(sut).contains("1", "2");
    }

    @Test
    void split_contains() {
        String actual = "1";
        String[] sut = actual.split(",");

        assertThat(sut).containsExactly("1");
    }
}

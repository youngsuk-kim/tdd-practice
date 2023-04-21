import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc";
        String sut = actual.replace("b", "d");

        assertThat(sut).isEqualTo("adc");
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

    @Test
    void replace_parentheses() {
        String actual = "(1,2)";
        String sut = actual.substring(1, 4);

        assertThat(sut).isEqualTo("1,2");
    }

}

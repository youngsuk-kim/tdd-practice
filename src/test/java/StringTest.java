import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @DisplayName("스트링의 인덱스를 초과하는 로직을 작성하면 익셉션을 발생시킨다.")
    @Test
    void specific_char_location_throw_exception() {
        String actual = "abc";

        assertThatThrownBy(() -> {
           actual.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

}

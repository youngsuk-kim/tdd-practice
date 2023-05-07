package racingcar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NameParserTest {

    @Test
    void 컴마로_구분된_스트링이_들어오면_리스트로_변환된다() {
        List<String> parse = NameParser.parse("pobi,crong,honux");
        assertThat(parse).hasSize(3);
    }
}
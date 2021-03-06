package fr.lernejo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "3, 7, 10",
        "0, 3, 3"
    })
    void add_behaves_as_expected(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.ADD,a,b);

        assertThat(result).isEqualTo(expectedResult);
    }
}

package pt.brunojesus.esg.operations.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pt.brunojesus.esg.operations.Operation;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionOperationTest {

    private final Operation subject = new DivisionOperation();

    public static Stream<Arguments> divNumberProvider() {
        return Stream.of(
                Arguments.arguments(List.of(20d, 5d), 4),
                Arguments.arguments(List.of(1d, 2d), 0.5d),
                Arguments.arguments(List.of(100d, 5000d), 0.02d),
                Arguments.arguments(List.of(10d), 10d)
        );
    }

    @ParameterizedTest
    @MethodSource("divNumberProvider")
    void executeTest(List<Double> operands, double expectedResult) {
        double result = subject.execute(operands);
        assertEquals(expectedResult, result);
    }
}
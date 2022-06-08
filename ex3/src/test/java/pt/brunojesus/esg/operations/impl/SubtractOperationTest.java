package pt.brunojesus.esg.operations.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pt.brunojesus.esg.operations.Operation;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    private final Operation subject = new SubtractOperation();

    public static Stream<Arguments> subNumberProvider() {
        return Stream.of(
                Arguments.arguments(List.of(10d, 20d), -10d),
                Arguments.arguments(List.of(11d, 11d), 0d),
                Arguments.arguments(List.of(10d, -20d), 30d),
                Arguments.arguments(List.of(10d), 10d)
        );
    }

    @ParameterizedTest
    @MethodSource("subNumberProvider")
    void executeTest(List<Double> operands, double expectedResult) {
        double result = subject.execute(operands);
        assertEquals(expectedResult, result);
    }
}
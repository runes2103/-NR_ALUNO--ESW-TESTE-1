package pt.brunojesus.esg.operations.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pt.brunojesus.esg.operations.Operation;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyOperationTest {

    private final Operation subject = new MultiplyOperation();

    public static Stream<Arguments> mulNumberProvider() {
        return Stream.of(
                Arguments.arguments(List.of(20d, 5d), 100d),
                Arguments.arguments(List.of(1d, 2d), 2d),
                Arguments.arguments(List.of(100d, 5000d), 500000d),
                Arguments.arguments(List.of(10d), 10d)
        );
    }

    @ParameterizedTest
    @MethodSource("mulNumberProvider")
    void executeTest(List<Double> operands, double expectedResult) {
        double result = subject.execute(operands);
        assertEquals(expectedResult, result);
    }
}
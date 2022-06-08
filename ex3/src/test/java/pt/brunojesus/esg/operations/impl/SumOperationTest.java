package pt.brunojesus.esg.operations.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pt.brunojesus.esg.operations.Operation;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOperationTest {

    private final Operation subject = new SumOperation();

    public static Stream<Arguments> sumNumberProvider() {
        return Stream.of(
                Arguments.arguments(10d, 20d, 30d),
                Arguments.arguments(11d, 11d, 22d),
                Arguments.arguments(10d, -20d, -10d)
        );
    }

    @ParameterizedTest
    @MethodSource("sumNumberProvider")
    void executeTest(double val1, double val2, double expectedResult) {
        double result = subject.execute(List.of(val1, val2));
        assertEquals(expectedResult, result);
    }
}
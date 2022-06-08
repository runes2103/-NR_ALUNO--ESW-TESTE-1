package pt.brunojesus.esg.operations.impl;

import pt.brunojesus.esg.operations.Operation;

import java.util.List;

/**
 * Executes division operations
 *
 * @author Bruno Jesus
 * @since 1.0
 */
public class DivisionOperation implements Operation {

    @Override
    public Double execute(List<Double> operandList) {
        final double first = operandList.stream().findFirst().orElse(0d);
        return operandList
                .stream()
                .skip(1)
                .reduce(first, (subTotal, operand) -> subTotal / operand);
    }
}

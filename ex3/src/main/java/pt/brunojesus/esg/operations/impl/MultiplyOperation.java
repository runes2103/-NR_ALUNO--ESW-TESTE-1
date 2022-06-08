package pt.brunojesus.esg.operations.impl;

import pt.brunojesus.esg.operations.Operation;

import java.util.List;

/**
 * Executes multiplication operations
 *
 * @author Bruno Jesus
 * @since 1.0
 */
public class MultiplyOperation implements Operation {

    @Override
    public Double execute(List<Double> operandList) {
        return operandList
                .stream()
                .reduce(1d, (subTotal, operand) -> subTotal * operand);
    }
}

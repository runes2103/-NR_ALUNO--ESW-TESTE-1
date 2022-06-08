package pt.brunojesus.esg.operations.impl;

import pt.brunojesus.esg.operations.Operation;

import java.util.List;

/**
 * Adds numbers
 *
 * @author Bruno Jesus
 * @since 1.0
 */
public class SumOperation implements Operation {

    @Override
    public Double execute(List<Double> operandList) {
        return operandList
                .stream()
                .reduce(0d, Double::sum);
    }
}

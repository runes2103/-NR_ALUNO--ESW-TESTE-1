package pt.brunojesus.esg.operations;

import java.util.List;

/**
 * Describes an Operation for a Calculation
 *
 * @author Bruno Jesus
 * @since 1.0
 */
@FunctionalInterface
public interface Operation {

    /**
     * Executes the math operation
     *
     * @param operandList the list of operands
     * @return the operation result
     */
    Double execute(final List<Double> operandList);
}

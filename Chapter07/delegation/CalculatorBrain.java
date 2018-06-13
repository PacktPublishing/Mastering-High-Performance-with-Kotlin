package mastering.kotlin.performance.chapter7.delegation;

public class CalculatorBrain implements Calculator {

    public int performOperation(String operand) {
        throw new IllegalStateException("Not implemented!");
    }

}

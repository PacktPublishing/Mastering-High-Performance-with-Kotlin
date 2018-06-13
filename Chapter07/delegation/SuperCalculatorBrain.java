package mastering.kotlin.performance.chapter7.delegation;

public class SuperCalculatorBrain implements Calculator {
    @Override
    public int performOperation(String operand) {
        throw new IllegalStateException("not implemented");
    }
}

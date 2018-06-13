package mastering.kotlin.performance.chapter7.delegation;

public class CalculatorMachine implements Calculator {

    private Calculator delegate;

    public CalculatorMachine(Calculator delegate) {
        this.delegate = delegate;
    }

    public void setDelegate(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public int performOperation(String operand) {
        return delegate.performOperation(operand);
    }
}

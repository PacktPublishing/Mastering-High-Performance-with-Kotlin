package mastering.kotlin.performance.chapter7.delegation;

public class Main {
    public static void main(String[] args) {
        final CalculatorMachine calculatorMachine = new CalculatorMachine(new CalculatorBrain());
        calculatorMachine.setDelegate(new SuperCalculatorBrain());
    }
}

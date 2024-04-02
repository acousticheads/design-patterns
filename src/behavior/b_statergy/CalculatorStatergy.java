package behavior.b_statergy;

public class CalculatorStatergy {

    Calculator calculator;

    public CalculatorStatergy(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(int a, int b) {
        return  calculator.calculate(a,b);
    }

}

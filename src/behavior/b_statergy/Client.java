package behavior.b_statergy;

public class Client {
    public static void main(String[] args) {

        CalculatorStatergy calculatorStatergy = new CalculatorStatergy(new Add());
        System.out.println(calculatorStatergy.calculate(10, 20));


    }
}

package z5;

public class PolandTaxCalculation implements TaxCalculate {
    @Override
    public double calculate(double amount) {
        return amount * 0.23;
    }
}

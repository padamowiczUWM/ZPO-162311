package z5;

public class GermanyTaxCalculation implements TaxCalculate {
    @Override
    public double calculate(double amount) {
        return amount * 0.19;
    }
}

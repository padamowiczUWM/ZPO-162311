package z5;

public class UKTaxCalculation implements TaxCalculate {
    @Override
    public double calculate(double amount) {
        return amount * 0.20;
    }
}

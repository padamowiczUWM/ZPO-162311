package z5;

public class TaxCalculation {
    TaxCalculate taxCalculate;

    public TaxCalculation(TaxCalculate taxCalculate) {
        this.taxCalculate = taxCalculate;
    }

    public void setTaxCalculate(TaxCalculate taxCalculate) {
        this.taxCalculate = taxCalculate;
    }

    public double calculate(double amount) {
        return taxCalculate.calculate(amount);
    }
}

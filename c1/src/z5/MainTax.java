package z5;

import java.util.ArrayList;

public class MainTax {
    public static void main(String[] args) {
        ArrayList<TaxCalculation> taxCalculations = new ArrayList<>();
        taxCalculations.add(new TaxCalculation(new PolandTaxCalculation()));
        taxCalculations.add(new TaxCalculation(new UKTaxCalculation()));
        taxCalculations.add(new TaxCalculation(new GermanyTaxCalculation()));

        System.out.printf("PL: %.2f\n", taxCalculations.get(0).calculate(20));
        System.out.printf("UK: %.2f\n", taxCalculations.get(1).calculate(20));
        System.out.printf("Germany: %.2f", taxCalculations.get(2).calculate(20));
    }
}

public class TaxCalculator2019 implements ITaxCalculator {
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return 0.4 * taxableIncome;
    }

}

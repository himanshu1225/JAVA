// this TaxReport class is tightly coupled with taxCalculator class.
// Let say tommorow we use different calculator to calculate tax.
// let say we change somethig in constructor of tax calculator.
// We change something in calculate tax method of calculator.
// Even a small change in the method of TaxCalculator class will need to recomplie all the classes which are dependent on it.

public class TaxReport {
    // private TaxCalculator2018 calculator;

    // public TaxReport() {
    // calculator = new TaxCalculator2018(100_000);
    // }

    private ITaxCalculator calculator;
    // We need this object so that TaxReport object can perform its task.
    // TaxReport is dependent on TaxCalculator.
    // We can inject the ITaxCalulator object: constructor injection, setter
    // injection, Method Injection.

    // Constructor injection
    // public TaxReport(ITaxCalculator calculator) {
    // this.calculator = calculator;
    // }

    public void showReport(ITaxCalculator calculator) {
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter Injection
    // public void setCalculator(ITaxCalculator calculator) {
    // this.calculator = calculator;
    // }

}

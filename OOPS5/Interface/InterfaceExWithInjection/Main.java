public class Main {
    public static void main(String[] args) {

        // We have injected the dependency through main class.
        // If we have 100 classes which have dependency, we do not want to create 100 of
        // objects and pass them through constructor of the classes. That's where we use
        // DI framework. EX: Spring.

        // TaxCalculator2018 calc = new TaxCalculator2018(10_000);
        // Constructor Injection.
        // TaxReport report = new TaxReport(calc);
        // report.showReport();

        // Setter Injection: add setter in Taxreport
        // Advantage: we can change the dependency through out the lifetime of the
        // program.
        // report.setCalculator(new TaxCalculator2019(30_000));
        // report.showReport();

        // Method Injection:
        // When calling method that time only we pass the dependency.
        // We pass the dependency to the method which needs this dependency.
        TaxReport report = new TaxReport();
        report.showReport(new TaxCalculator2019(10_000));

    }
}

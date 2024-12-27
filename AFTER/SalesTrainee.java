package AFTER;

public class SalesTrainee extends Employee {
    private int sickDays;
    private int failedTests;

    public SalesTrainee(String name, double salary, int sickDays, int failedTests) {
        super(name, salary);
        this.sickDays = sickDays;
        this.failedTests = failedTests;
    }

    public int getSickDays() {
        return sickDays;
    }

    public int getFailedTests() {
        return failedTests;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

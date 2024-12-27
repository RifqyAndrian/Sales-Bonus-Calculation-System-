package AFTER;

public class Salesman extends Employee {
    private double totalSalesAmount;
    private int newCustomers;

    public Salesman(String name, double salary, double totalSalesAmount, int newCustomers) {
        super(name, salary);
        this.totalSalesAmount = totalSalesAmount;
        this.newCustomers = newCustomers;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public int getNewCustomers() {
        return newCustomers;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

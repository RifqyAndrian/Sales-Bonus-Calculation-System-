package AFTER;

public class Boss extends Employee {
    private double totalSalesAmount;
    private int newCustomers;
    private double officeExpenses;

    public Boss(String name, double salary, double totalSalesAmount, int newCustomers, double officeExpenses) {
        super(name, salary);
        this.totalSalesAmount = totalSalesAmount;
        this.newCustomers = newCustomers;
        this.officeExpenses = officeExpenses;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public int getNewCustomers() {
        return newCustomers;
    }

    public double getOfficeExpenses() {
        return officeExpenses;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}


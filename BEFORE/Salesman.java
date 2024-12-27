public class Salesman implements Visitable{

    public double totalSalesAmount; // Leaky Encapsulation
    private int newCustomers;

    //Insufficient Modularization
    private String department;
    private String location;   
    private double performanceScore; 
    private String managerName;

    public Salesman(double totalSalesAmount, int newCustomers) {
        this.totalSalesAmount = totalSalesAmount;
        this.newCustomers = newCustomers;
    }

    public double accept(Visitor visitor){

        return visitor.visit(this);

    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        // Exposing how the total sales amount is set directly without any restrictions
        this.totalSalesAmount = totalSalesAmount;
    }

    public int getNewCustomers() {
        return newCustomers;
    }

    public void setNewCustomers(int newCustomers) {
        this.newCustomers = newCustomers;
    }

    //Insufficient Modularization
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

}
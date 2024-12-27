package AFTER;

public class Main {
    public static void main(String[] args) {
        // Create employee objects
        Employee salesman = new Salesman("John", 50000, 150000, 60);
        Employee trainee = new SalesTrainee("Jane", 25000, 5, 1);
        Employee boss = new Boss("Alice", 80000, 200000, 1200, 45000);

        // Add employees to the BonusCalculator
        BonusCalculator calculator = new BonusCalculator();
        calculator.addEmployee(salesman);
        calculator.addEmployee(trainee);
        calculator.addEmployee(boss);

        // Calculate yearly bonuses
        Visitor yearlyBonus = new YearlyBonusVisitor();
        System.out.println("Yearly Bonuses:");
        calculator.calculateBonus(yearlyBonus);

        // Calculate quarterly bonuses
        Visitor quarterlyBonus = new QuarterlyBonusVisitor();
        System.out.println("\nQuarterly Bonuses:");
        calculator.calculateBonus(quarterlyBonus);
    }
}

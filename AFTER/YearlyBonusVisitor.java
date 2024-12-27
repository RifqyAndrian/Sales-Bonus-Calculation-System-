package AFTER;

public class YearlyBonusVisitor extends BonusVisitor {
    @Override
    public double visit(SalesTrainee trainee) {
        System.out.println("Trainees Yearly Bonus");
        double yearlyBonusPercentage = (trainee.getSickDays() < 10 && trainee.getFailedTests() < 2) ? 0.10 : 0.02;
        return calculateBonusAmount(trainee.getSalary(), yearlyBonusPercentage);
    }

    @Override
    public double visit(Salesman salesman) {
        System.out.println("Salesmans Yearly Bonus");
        double yearlyBonusPercentage = (salesman.getTotalSalesAmount() > 100000 && salesman.getNewCustomers() > 50) ? 0.12 : 0.04;
        return calculateBonusAmount(salesman.getTotalSalesAmount(), yearlyBonusPercentage);
    }

    @Override
    public double visit(Boss boss) {
        System.out.println("Bosses Yearly Bonus");
        double yearlyBonusPercentage = (boss.getOfficeExpenses() < 50000 && boss.getNewCustomers() > 1000) ? 0.15 : 0.04;
        return calculateBonusAmount(boss.getTotalSalesAmount(), yearlyBonusPercentage);
    }
}


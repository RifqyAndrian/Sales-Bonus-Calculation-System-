package AFTER;

public class QuarterlyBonusVisitor extends BonusVisitor {
    @Override
    public double visit(SalesTrainee trainee) {
        System.out.println("Trainees Quarterly Bonus");
        double quarterlyBonusPercentage = (trainee.getSickDays() < 2 && trainee.getFailedTests() < 1) ? 0.01 : 0;
        return calculateBonusAmount(trainee.getSalary(), quarterlyBonusPercentage);
    }

    @Override
    public double visit(Salesman salesman) {
        System.out.println("Salesmans Quarterly Bonus");
        double quarterlyBonusPercentage = (salesman.getTotalSalesAmount() > 25000 && salesman.getNewCustomers() > 20) ? 0.03 : 0;
        return calculateBonusAmount(salesman.getTotalSalesAmount(), quarterlyBonusPercentage);
    }

    @Override
    public double visit(Boss boss) {
        System.out.println("Bosses Quarterly Bonus");
        double quarterlyBonusPercentage = (boss.getOfficeExpenses() < 12000 && boss.getNewCustomers() > 250) ? 0.05 : 0.01;
        return calculateBonusAmount(boss.getTotalSalesAmount(), quarterlyBonusPercentage);
    }
}


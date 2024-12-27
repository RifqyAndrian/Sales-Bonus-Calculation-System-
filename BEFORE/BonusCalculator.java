//Imperative Abstraction 
public class BonusCalculator {
    // This class does only one thing: calculating the bonus.
    // This is an over-complication, creating a class just for one method.

    public double calculateBonus(Visitable employee) {
        //Missing Hierarchy
        if (employee instanceof SalesTrainee) {
            return new SalesTraineeBonusCalculator().calculateBonus((SalesTrainee) employee);
        } else if (employee instanceof Salesman) {
            return new SalesmanBonusCalculator().calculateBonus((Salesman) employee);
        } else if (employee instanceof Boss) {
            return new BossBonusCalculator().calculateBonus((Boss) employee);
        }
        return 0;
    }
}

class SalesTraineeBonusCalculator {
    public double calculateBonus(SalesTrainee trainee) {
        return trainee.getSalary() * 0.1;
    }
}

class SalesmanBonusCalculator {
    public double calculateBonus(Salesman salesman) {
        return salesman.getTotalSalesAmount() * 0.05;
    }
}

class BossBonusCalculator {
    public double calculateBonus(Boss boss) {
        return boss.getTotalSalesAmount() * 0.15;
    }
}

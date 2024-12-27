package AFTER;

public abstract class BonusVisitor implements Visitor {
    protected double calculateBonusAmount(double salesAmount, double bonusPercentage) {
        return salesAmount * bonusPercentage;
    }
}


package AFTER;

public interface Visitor {
    double visit(SalesTrainee trainee);
    double visit(Salesman salesman);
    double visit(Boss boss);
}

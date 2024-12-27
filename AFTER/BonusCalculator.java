package AFTER;

import java.util.ArrayList;
import java.util.List;

public class BonusCalculator {
    private List<Employee> employees;

    public BonusCalculator() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateBonus(Visitor visitor) {
        for (Employee employee : employees) {
            double bonus = employee.accept(visitor);
            System.out.println("Bonus for " + employee.getName() + ": " + bonus);
        }
    }
}

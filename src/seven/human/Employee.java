package seven.human;

import seven.Gender;

public class Employee extends person {

    private double salaryAmount;

    public Employee(){
        super();
        System.out.println("Employee...");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}

package seven.human;

import seven.Gender;
import seven.animal.Dog;

public class Professor extends Employee {

    private String academicTitle;


    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }


    @Override
    public void setSalaryAmount(double salaryAmount) {
        super.setSalaryAmount(salaryAmount+500);
    }

}

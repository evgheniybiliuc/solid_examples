package srp.g;

import srp.b.EmployeeSalaryCounter;

public class EmployeeSalaryOutputter {
    private EmployeeSalaryCounter employeeSalaryCounter;

    public EmployeeSalaryOutputter(EmployeeSalaryCounter employeeSalaryCounter) {
        this.employeeSalaryCounter = employeeSalaryCounter;
    }

    public String toJson(){
       String totalAmount =  String.valueOf(employeeSalaryCounter.countSalaries());
       return String.format("{totalEmployeesSalary : %s",totalAmount);

    }

    public String beautifullOutput(){
        return String.format("Total amount of salaries is : %d",employeeSalaryCounter.countSalaries());
    }
}

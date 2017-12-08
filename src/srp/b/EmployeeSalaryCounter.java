package srp.b;

import java.util.List;

public class EmployeeSalaryCounter {

    private List<Employee> employees;

    public EmployeeSalaryCounter(List<Employee> employees) {
        this.employees = employees;
    }


    public int countSalaries(){
        int totalSalary = 0;
        for(Employee employee : employees){
            totalSalary +=employee.getSalary();
        }
        return totalSalary;
    }


    public String output(){
        return String.format("Total amount of salaries is : %d",countSalaries());
    }
}

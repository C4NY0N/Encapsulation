package org.horizoncolumbus.hs;

public class Employee {

    private Integer Salary;

    Employee(Integer s){
        Salary = s;
    }

    public Integer getSalary(){
        return Salary;
    }

    public void setSalary(Integer newSalary){
        Salary = newSalary;
    }


}

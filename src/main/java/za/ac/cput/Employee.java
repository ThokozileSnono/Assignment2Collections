package za.ac.cput;

/*
 * @Author: Thokozile Snono
 * Student number: 216032121
 * Date: 16 May 2021
 * This is the Employee class
 */

import java.util.Objects;

public class Employee {
    private String empName;
    private String empSurname;

    public Employee(int empNumber, String empName) {
        this.empName = empName;
        this.empNumber = empNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber);
    }

    private int empNumber;

    public Employee(String empSurname){

    }

    public Employee(String empName, String empSurname, int empNumber) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empNumber = empNumber;
    }

    public void setEmpName(String nm){
        empName = nm;
    }

    public void setEmpSurname(String snm){
        empSurname = snm;
    }

    public void setNumber(int num){
        empNumber = num;
    }

    public String getEmpName(){
        return empName;
    }

    public String getEmpSurname(){
        return empSurname;
    }

    public int getNumber(){
        return empNumber;
    }

    @Override
    public String toString() {
        return "Employees{" + "\n empName=" + empName + ", empSurname=" + empSurname + ", empNumber=" + empNumber + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber;
    }
}

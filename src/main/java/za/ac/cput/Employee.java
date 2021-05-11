package za.ac.cput;

public class Employee {
    private String empName;
    private String empSurname;
    private String empNumber;

    public Employee(String empName, String empSurname, String empNumber) {
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

    public void setNumber(String num){
        empNumber = num;
    }

    public String getEmpName(){
        return empName;
    }

    public String getEmpSurname(){
        return empSurname;
    }

    public String getNumber(){
        return empNumber;
    }

    @Override
    public String toString() {
        return "Employees{" + "empName=" + empName + ", empSurname=" + empSurname + ", empNumber=" + empNumber + '}';
    }
}

package Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
    @Id
    private int empId;
    private String NAME;
    private String address;
    private int salary;
    public Employee(){

    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", NAME='" + NAME + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int empId, String NAME, String address, int salary) {
        this.empId = empId;
        this.NAME = NAME;
        this.address = address;
        this.salary = salary;
    }
}

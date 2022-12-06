package Demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Employee {
         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
        private int empID;
        private String name;
        private String gender;
        private int salary;
        @Embedded
        @ElementCollection(fetch = FetchType.EAGER)
        @JoinTable(name = "address",joinColumns =@JoinColumn(name = "empid"))
        private Set<Address> empAddress = new HashSet();
public Employee(){

}
    public Employee( String name, String gender, int salary, Set<Address> empAddress) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.empAddress = empAddress;
    }

    public Employee(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(empAddress, employee.empAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, name, gender, salary, empAddress);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Address> getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Set<Address> empAddress) {
        this.empAddress = empAddress;
    }

//    @Override
//    public String toString() {
//        return ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", salary=" + salary +
//                ", empAddress=" + empAddress +
//                '}';
//    }
}

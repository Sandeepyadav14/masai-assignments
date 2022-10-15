  abstract class Employee {
    int employeeId;
    String employeeName;
    double salary;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }
   abstract double calculateSalary();
}
class  PermanentEmployee extends Employee{
 private double basicPay;

    public PermanentEmployee(String employeeName, double basicPay) {
        super(employeeName);
        this.basicPay = basicPay;
    }

    public PermanentEmployee(int employeeId, double basicPay) {
        super(employeeId);
        this.basicPay = basicPay;
    }

    @Override
    double calculateSalary() {
        double PFamount=basicPay*0.12;
        salary=basicPay-PFamount;
        return salary;
    }
}
    class TemporaryEmployee extends Employee {
        private int hoursWorked;
        private int hourlyWages;



        public TemporaryEmployee(String employeeName, int hoursWorked, int hourlyWages) {
            super(employeeName);
            this.hoursWorked = hoursWorked;
            this.hourlyWages = hourlyWages;
        }

        public TemporaryEmployee(int employeeId, int hoursWorked, int hourlyWages) {
            super(employeeId);
            this.hoursWorked = hoursWorked;
            this.hourlyWages = hourlyWages;
        }

        @Override
        double calculateSalary() {
            salary=hourlyWages*hoursWorked;
            return salary;
        }

    }
class Loan{
    public double calculateLoanAmount(Employee employeeObj){
//         Employee.
        return 0;
    }
}
//    class Main{
//        public static void main(String[] args) {
//         Loan l=new Loan();
//         l.calculateLoanAmount(new Employee() {
//
//        }
//    }

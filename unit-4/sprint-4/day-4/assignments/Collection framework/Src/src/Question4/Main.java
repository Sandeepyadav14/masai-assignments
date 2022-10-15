package Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("...Welcome to Employee Management System...");

        boolean entry = true;  int i = 1;

        while(entry) {
            System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
            String s = sc.next();

            if(s.equalsIgnoreCase("Y")) {

                System.out.println("Enter the Employee Details: " + i);
                System.out.println("------------------------------");

                System.out.println("Enter the Emplyee Id");
                int empId = sc.nextInt();
                System.out.println("Enter the Emplyee Name");
                String empName = sc.next();
                System.out.println("Enter the Emplyee Salary");
                double empSal = sc.nextDouble();
                System.out.println("Enter the Department Id");
                int deptId = sc.nextInt();
                System.out.println("Enter the Department Name");
                String deptName = sc.next();

                Department d = new Department(deptId, deptName);
                Employee e = new Employee(empId, empName, empSal, d);

                list.add(e);
                System.out.println("Employee Details Added Successfully.");
            }

            else if(s.equalsIgnoreCase("N")) {
                System.out.println("Thank you---");
                entry = false;
            }

			/*
			else
			{ System.out.println("Invalid Input"); }
			*/

        }


        boolean option = true;

        while(option) {
            System.out.println("Enter your choice");
            System.out.println("1: Find Employee in Particular Department");
            System.out.println("2: Remove Particular Employee");
            System.out.println("3: Print Employees in All Departments");
            String opt = sc.next();

            if(opt.equals("1")) {
                System.out.println("Enter the Department Id");
                int dId = sc.nextInt();

                boolean found = false;
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).getDepartment().getDepartmentId() == dId) {
                        found = true;  break;
                    }
                }

                if(!found) {
                    System.out.println("No Department is there with departmentId "+ dId);
                }
                else {
                    System.out.println("Employees in Department: "+ dId);

                    list.forEach(emp -> {
                        if(emp.getDepartment().getDepartmentId() == dId) {
                            System.out.println(emp);
                            System.out.println("=============================");
                        }
                    });

                    System.out.println("Do you want to Exit? (Y/N)");
                    String exit = sc.next();

                    if(exit.equalsIgnoreCase("Y")) {
                        System.out.println("Thank you---");
                        option = false;
                    }

                    else if(exit.equalsIgnoreCase("N")) {}
                }

            }
            else if(opt.equals("2")) {
                System.out.println("Enter the Department Id");
                int dId = sc.nextInt();
                System.out.println("Enter the Employee Id");
                int eId = sc.nextInt();

                boolean find = false;

                for(int k = 0; k < list.size(); k++) {
                    Employee emp = list.get(k);
                    if(emp.getEmployeeId() == eId && emp.getDepartment().getDepartmentId() == dId) {
                        find = true;
                        list.remove(k);
                        System.out.println("Employee " + emp.getEmployeeName() + " is removed from the "
                                + "department " + dId + " successfully.");
                        break;
                    }
                }

                if(!find) {
                    System.out.println("No such Employee Found!");
                }

                System.out.println("Do you want to Exit? (Y/N)");
                String exit = sc.next();

                if(exit.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you---");
                    option = false;
                }

                else if(exit.equalsIgnoreCase("N")) {}
            }
            else if(opt.equals("3")) {
                if(list.size() == 0) {
                    System.out.println("Employee does not Exist");

                    System.out.println("Do you want to Exit? (Y/N)");
                    String exit = sc.next();

                    if(exit.equalsIgnoreCase("Y")) {
                        System.out.println("Thank you---");
                        option = false;
                    }

                    else if(exit.equalsIgnoreCase("N")) {}


                }
                else {
                    list.forEach(emp -> {
                        System.out.println(emp);
                        System.out.println("-----------------------------");
                    });

                    System.out.println("Do you want to Exit? (Y/N)");
                    String exit = sc.next();

                    if(exit.equalsIgnoreCase("Y")) {
                        System.out.println("Thank you---");
                        option = false;
                    }

                    else if(exit.equalsIgnoreCase("N")) {}
                }

            }

        }

    }

}
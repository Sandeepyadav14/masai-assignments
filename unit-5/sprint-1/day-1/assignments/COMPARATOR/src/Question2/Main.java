package Question2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
     public static void main(String[] args) {
    	    EmpIdSort e=new EmpIdSort();
    	 	AddressSort a=new AddressSort();
    	 	SalarySort s=new SalarySort();
    	 	Scanner scanner=new Scanner(System.in);
    	 	System.out.print("please");
    	 	int n=scanner.nextInt();
    	 	
            
          
          
          
    	 Employee e1=new Employee(1,"Sandy","mumbai",3000);
    	 Employee e2=new Employee(3,"Aman","delhi",8900);
    	 Employee e3=new Employee(79,"Aarati","chennai",8900);
    	 Employee e4=new Employee(54,"Rahul","bengal",6000);
    	 Employee e5=new Employee(798,"Raju","bihar",45000);
    	 Employee e6=new Employee(4,"Pradum","uttarpradesh",1200);
    	 if(n==1) {
 	 		Set<Employee> employee=new TreeSet<Employee>(e);
 	 		 employee.add(e1);
 	    	 employee.add(e2);
 	    	 employee.add(e3);
 	    	 employee.add(e4);
 	    	 employee.add(e5);
 	    	 employee.add(e6);
 	    	for(Employee st:employee) {
 	 			System.out.println(st);
 	 		}
 	    	   
 	 	}
    	 if(n==2) {
  	 		Set<Employee> employee=new TreeSet<Employee>(a);
  	 		 employee.add(e1);
  	    	 employee.add(e2);
  	    	 employee.add(e3);
  	    	 employee.add(e4);
  	    	 employee.add(e5);
  	    	 employee.add(e6);
  	    	for(Employee st:employee) {
  	 			System.out.println(st);
  	 		}
  	    	   
  	 	}
    	 if(n==3) {
   	 		Set<Employee> employee=new TreeSet<Employee>(s);
   	 		 employee.add(e1);
   	    	 employee.add(e2);
   	    	 employee.add(e3);
   	    	 employee.add(e4);
   	    	 employee.add(e5);
   	    	 employee.add(e6);
   	    	for(Employee st:employee) {
   	 			System.out.println(st);
   	 		}
   	    	   
   	 	}
     	 
    	 
    	      
    	 
     }
}

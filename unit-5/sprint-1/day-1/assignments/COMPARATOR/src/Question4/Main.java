package Question4;

//import java.awt.datatransfer.SystemFlavorMap;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(10, "Sandy","mumbai", 900));
		
		students.add(new Student(15, "Nitesh","maharashtra", 980));
		
		students.add(new Student(8, "ashish","chennai", 700));
		
		students.add(new Student(7, "pradyuman","kolkata", 700));
		
		students.add(new Student(10, "Sandy","mumbai", 500));
		
		TreeSet<Student> s=new TreeSet<>(students);

		for(Student i:s) {
			System.out.println(i);
		}
		
	}
	
}

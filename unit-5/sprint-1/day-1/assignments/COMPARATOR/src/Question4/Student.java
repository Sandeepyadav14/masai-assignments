package Question4;

import java.util.Objects;

public class Student implements Comparable<Student>  {

	int roll;
	String name;
	String address;
	int marks;
	
	
	
	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}



	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}



	


	@Override
	public int compareTo(Student o) {
		if(this.marks==o.marks) {
			return this.name.compareTo(o.name);
		}
		else if(this.marks>o.marks) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	
	
	
}



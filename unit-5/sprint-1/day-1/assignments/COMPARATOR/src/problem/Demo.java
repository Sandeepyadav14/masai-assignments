package problem;

import java.util.ArrayList;

import java.util.Collections;import java.util.Comparator;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
	  List<Human> e=new ArrayList<Human>();
	  e.add(new Human(1,"sandy","mumbai",2000));
	  e.add(new Human(4,"nitesh","chennai",7400));
	  e.add(new Human(8,"jaricho","america",9000));
	  e.add(new Human(5,"pollard","uk",4090));
	  e.add(new Human(9,"rishikesh","azamgarh",4000));
	  Collections.sort(e,new Comparator<Human>() {

		@Override
		public int compare(Human o1, Human o2) {
			if(o1.getEmpId()>o2.getEmpId()) 
				return 1;
			else
			return -1;
		}
		  
	  });
	  Collections.sort( e,(s1,s2)->{
		  
		  return s1.getEmpId() >s2.getEmpId()?1:-1;
		  });

  for(Human i:e) {
	  System.out.println(i);
  }
  }
}

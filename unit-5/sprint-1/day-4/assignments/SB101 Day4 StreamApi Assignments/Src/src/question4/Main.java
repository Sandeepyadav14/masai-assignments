package question4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student(1,"David",203));
        students.add(new Student(8,"Malan",893));
        students.add(new Student(9,"Maxwell",803));
        students.add(new Student(4,"Zampa",762));
        students.add(new Student(6,"Starc",213));
        Stream<Student> str=students.stream();
            Stream<Student> str2=str.filter((s1)->s1.getMarks()<500);
         Set<Student> str3=   str2.collect(Collectors.toSet());
        System.out.println(str3);
    }
}

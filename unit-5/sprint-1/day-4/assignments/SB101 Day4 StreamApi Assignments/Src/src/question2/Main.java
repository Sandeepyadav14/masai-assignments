package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"sandy",400));
        list.add(new Student(4,"candy",700));
        list.add(new Student(3,"vanilaa",300));
        list.add(new Student(9,"david",890));
        list.add(new Student(7,"henry",670));

        Optional<Student> opt=list.stream().max((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1);
        System.out.println(opt);





    }
}

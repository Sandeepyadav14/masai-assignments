package question1;


import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        Predicate<Student>:
        Predicate<Student> p1= s->s.getMarks()>500;
        System.out.println(p1.test(new Student(1,"sandy",300)));

//        Consumer:<Student>:
        Consumer<Student> c2=s->{
            System.out.println("Roll is"+s.getRoll());
            System.out.println("Name is"+s.getName());
            System.out.println("Marks is"+s.getMarks());
        };


//        Supplier<Student>
        c2.accept(new Student(1,"rakesh",800));
        Supplier<Student>s3=()->new Student(2,"nitesh",400);
        System.out.println(s3.get());

//        Function<String, Integer>
        Convert f=num-> Integer.parseInt(num);
        System.out.println(f.check("500"));
    }

}



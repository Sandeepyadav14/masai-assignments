package Demo;

import Bean.Collage;
import Bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st=ac.getBean(Student.class,"student");
        System.out.println(st);
        Collage cl=ac.getBean(Collage.class,"college");
        cl.showDetails();
    }
}

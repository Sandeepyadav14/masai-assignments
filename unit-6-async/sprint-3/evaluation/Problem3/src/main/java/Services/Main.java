package Service;

import Bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

          PersonService personService1 = ctx.getBean("personService", PersonService.class);
         personService1.printSkillMap();

        PersonService personService2 = ctx.getBean("personService1", PersonService.class);

        personService2.printPersonList();


//
    }
}

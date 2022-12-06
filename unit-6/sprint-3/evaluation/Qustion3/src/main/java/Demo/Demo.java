package Demo;

import BEAN.Bussiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService ps=ctx.getBean("personService" ,PersonService.class);
        ps.printMap();
        System.out.println("############################");
        ps.printAppName();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        ps.printList();
    }

}

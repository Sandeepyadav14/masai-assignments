package Problem2;

import Main.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        Travel obj =  ctx.getBean("travel", Travel.class);

        obj.funA();
    }
}

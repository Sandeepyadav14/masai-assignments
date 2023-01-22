package Demo;

import Bean.HolidayPackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        HolidayPackage holidayPackage=ac.getBean(HolidayPackage.class,"holidayPackage");
        holidayPackage.showDetails();

    }
}

package Demo;

import BEAN.Gym;
import BEAN.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "Demo")
@PropertySource("Application.properties")

public class AppConfig {
     @Value("${appName}")
     String appName;

     @Bean
     public String setString(){
         return appName;
     }
    @Bean
     Map<Person, Gym> map(){
        HashMap<Person,Gym> map=new HashMap<>();
        Person person1=new Person();
        person1.setPerson_id(1);
        person1.setName("Ashish");
        person1.setAge(23);
        person1.setEmail("asish@gmail.com");
        person1.setMobile("9037623273232");

        Person person2=new Person();
        person2.setPerson_id(2);
        person2.setName("Rohit");
        person2.setAge(45);
        person2.setEmail("rohit@gmail.com");
        person2.setMobile("8983373232");

        Person person3=new Person();
        person3.setPerson_id(3);
        person3.setName("Ashwin");
        person3.setAge(56);
        person3.setEmail("ashwin@gmail.com");
        person3.setMobile("98768232");

        Gym gym1=new Gym();
        gym1.setGym_id(1);
        gym1.setGym_name("Killer Gym");
        gym1.setMonthly_fee("500");

        Gym gym2=new Gym();
        gym2.setGym_id(2);
        gym2.setGym_name("Fitness First");
        gym2.setMonthly_fee("450");

        Gym gym3=new Gym();
        gym3.setGym_id(3);
        gym3.setGym_name("Jai Hanuman Gym");
        gym3.setMonthly_fee("700");

        map.put(person1,gym1);
        map.put(person2,gym2);
        map.put(person3,gym3);

        return map;
    }
    @Bean
     List<Person> theList(){
        List<Person> list=new ArrayList<>();
        Person person1=new Person();
        person1.setPerson_id(1);
        person1.setAge(23);
        person1.setEmail("sandeep@gmail.com");
        person1.setMobile("77378338473");
        person1.setName("sandeep");

        Person person2=new Person();
        person2.setPerson_id(2);
        person2.setAge(45);
        person2.setEmail("aman@gmail.com");
        person2.setMobile("72323232473");
        person2.setName("Aman");

        Person person3=new Person();
        person3.setPerson_id(3);
        person3.setAge(34);
        person3.setEmail("sahil@gmail.com");
        person3.setMobile("87883382473");
        person3.setName("Sahil");

        Person person4=new Person();
        person4.setPerson_id(4);
        person4.setAge(37);
        person4.setEmail("ram@gmail.com");
        person4.setMobile("7374382473");
        person4.setName("Ram");

        Person person5=new Person();
        person5.setPerson_id(5);
        person5.setAge(28);
        person5.setEmail("laxman@gmail.com");
        person5.setMobile("9899882473");
        person5.setName("Laxman");

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;

    }


}

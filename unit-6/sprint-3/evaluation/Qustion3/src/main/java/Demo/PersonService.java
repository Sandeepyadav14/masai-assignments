package Demo;

import BEAN.Gym;
import BEAN.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class PersonService {
    @Autowired
     Map <Person, Gym>theMap;

    @Autowired
     List<Person> theList;

    @Autowired
     String appName;

    public void printMap(){

        System.out.println(theMap);
        //print all the person's and their gym details from the Map

    }
    public void printList(){
        List<Person> list=theList;
        list.sort((Person p1, Person p2)->p1.getAge()-p2.getAge());
        list.forEach(s-> System.out.println(s));
    }
    public void printAppName(){

        System.out.println(appName);

}
}

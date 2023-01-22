package Service;

import Bean.Person;
import Bean.Skill;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PersonService {

        private Map<Person, Skill> skillMap;

    public void setSkillMap(Map<Person, Skill> skillMap) {
        this.skillMap = skillMap;
    }

    private List<Person> personList;

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void printSkillMap(){
//        System.out.println(skillMap);
        for(Map.Entry m:skillMap.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        }

        public void printPersonList(){
            Collections.sort(personList, (Person a1, Person a2) -> a1.getAge()-a2.getAge());
            personList.forEach(s-> System.out.println(s));
        }



}

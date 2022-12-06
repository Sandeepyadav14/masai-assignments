package BEAN;

import java.util.Objects;

public class Person {
    private int person_id;
    private String name;
    private String email;
    private int age;
    private String mobile;

    public Person(){

    }

    public Person(int person_id, String name, String email, int age, String mobile) {
        this.person_id = person_id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobile = mobile;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return person_id == person.person_id && age == person.age && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(mobile, person.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person_id, name, email, age, mobile);
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}



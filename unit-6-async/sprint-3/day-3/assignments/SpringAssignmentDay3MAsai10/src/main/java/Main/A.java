package Main;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class A {
    @Autowired
    private List<String> cities;

    public void funA() {
        System.out.println("inside funA of A");
        System.out.println(cities);

    }

}

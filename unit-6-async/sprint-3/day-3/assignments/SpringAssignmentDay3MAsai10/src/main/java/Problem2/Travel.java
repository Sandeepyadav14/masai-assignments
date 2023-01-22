package Problem2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class Travel {
    @Autowired
    private Bike bike;

    @Autowired
    private Car car;
    @PostConstruct
    public void setUp() {
        System.out.println("inside set up method");
    }

    @PreDestroy
    public void tearDown(){
        System.out.println("inside tear down method");
    }

    //main business logic
    public void funA() {
        System.out.println("inside funA of A");
        System.out.println(car);
        System.out.println(bike);
    }


}

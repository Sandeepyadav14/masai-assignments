package Main;

import Bean.Email;
import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;
import java.time.LocalDate;
import Exception.UserExccption;
import Util.UtilManager;

import javax.persistence.EntityManager;

public class CreateUser {
    public static void main(String[] args) throws UserExccption {


        User user=new User();
        Email email=new Email();
        email.setEmail("Nitesh@gmail.com");
        email.setCreated_date(LocalDate.now());

        user.setName("Nitesh Shukla");
        user.setPhineNo("93434839438");
        user.setDateOfBirth("2002/09/12");



        user.setEmail(email);
        email.setUser(user);
            UserService userService=new UserServiceImpl();
          String msg= userService.AddCreateUser(user);
          System.out.println(msg);

    }
}

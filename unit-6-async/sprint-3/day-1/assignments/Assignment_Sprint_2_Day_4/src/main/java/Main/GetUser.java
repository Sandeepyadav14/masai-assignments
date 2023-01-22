package Main;

import Bean.Email;
import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;
import Exception.UserExccption;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class GetUser {
    public static void main(String[] args) throws UserExccption {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter User Id:");
        int userId=scanner.nextInt();
        UserService userService=new UserServiceImpl();
        User user= userService.GetUserDetails(userId);
        Email email=user.getEmail();
        System.out.println(email);
        System.out.println(user);
    }
}

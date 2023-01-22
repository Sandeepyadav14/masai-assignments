package Main;

import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;
import Exception.UserExccption;
import java.util.Scanner;

public class DeleteUser {
    public static void main(String[] args) throws UserExccption {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the id");
        int id=scanner.nextInt();
        UserService userService=new UserServiceImpl();
       String msg= userService.deleteUser(id);
        System.out.println(msg);
    }
}

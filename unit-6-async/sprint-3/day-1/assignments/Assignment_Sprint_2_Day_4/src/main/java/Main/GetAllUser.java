package Main;

import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;

import java.util.List;
//import java.util.Scanner;
import Exception.UserExccption;
public class GetAllUser {
    public static void main(String[] args) throws UserExccption {
        UserService userService=new UserServiceImpl();

        List<User> users=userService.GetAllUser();
        for (User i:users){
            System.out.println("*****************************");
            System.out.println(i.getId());
            System.out.println(i.getName());
            System.out.println(i.getDateOfBirth());
            System.out.println(i.getPhineNo());
            System.out.println(i.getEmail().getEmail());
            System.out.println(i.getEmail().getCreated_date());
        }
    }
}

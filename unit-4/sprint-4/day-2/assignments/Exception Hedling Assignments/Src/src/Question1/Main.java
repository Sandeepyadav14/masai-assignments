package Question1;
import java.util.Scanner;
public class Main {
 void UserRegistration(String username,String userCountry) throws InvalidCountryException {
   if(userCountry.equals("india")){
       System.out.println("User registration done successfully");
   }else{
       throw new InvalidCountryException("User Outside India cannot be registered");
   }
  }

    public static void main(String[] args) throws InvalidCountryException {
     Scanner s=new Scanner(System.in);
        System.out.println("Please Enter the name:");
        String name=s.next();
        System.out.println("Please Enter Country name:");
        String country=s.next();
        Main m=new Main();
        m.UserRegistration(name,country);
    }
}

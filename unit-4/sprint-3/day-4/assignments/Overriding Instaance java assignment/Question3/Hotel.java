package Question3;
import java.util.Scanner;
public class Hotel {

}
class TajHotel extends Hotel{

}
class RoadSideHotel extends Hotel{

}
class Demo{
    public Hotel provideFood(int amount){
        if(amount>1000){
            TajHotel th=new TajHotel();
            return th;
//            return new TajHotel();
        }
        else if(amount>200 && amount<1000 ){
            RoadSideHotel rs=new RoadSideHotel();
            return rs;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount=s.nextInt();
        if(amount<200){
            System.out.println("Enter Valid Amount");
            System.exit(1);
        }
        Demo d=new Demo();
        Hotel sandy=d.provideFood(amount);
        System.out.println(sandy);

    }
}
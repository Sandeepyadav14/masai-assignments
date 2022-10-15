package Question2;
import java.util.Scanner;

public interface Hotel {
    void chickenBiryani();

    void masalaDosa();

}
class TajHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Welcome ChickenBiryani from the TajHotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Welcome MasalaDosa from the TajHotel");
    }
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}
class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani() {
        System.out.println("Welcome ChickenBiryani from RoadsideHotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Welcome masalaDosa from the RoadSideHotel");
    }
}
class Demo{
    public Hotel provideFood(int amount) {
        if(amount>1000){
//            System.out.println(new TajHotel());
//            System.exit(1);
            TajHotel th=new TajHotel();
            return th;
        }
        else if(amount>200 && amount<1000) {

//            System.out.println(new RoadSideHotel());
//            System.exit(1);
            RoadSideHotel rs = new RoadSideHotel();
            return rs;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PLease Enter The Amount");
        int amount = s.nextInt();
        if(amount<200){
            System.out.println("Enter Valid Amount");
            System.exit(1);
        }
        Demo d = new Demo();
        d.provideFood(amount);
        Hotel sandy= d.provideFood(amount);
        sandy.chickenBiryani();
        sandy.masalaDosa();

    }


}
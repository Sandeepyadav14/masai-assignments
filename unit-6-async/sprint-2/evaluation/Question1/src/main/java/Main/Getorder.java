package Main;

import Dao.ItemService;
import Dao.ItemServiceImpl;
import java.util.Scanner;
import Exception.NotFoundException;
public class Getorder {
    public static void main(String[] args) throws NotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        int id=sc.nextInt();
        ItemService itemService=new ItemServiceImpl();
        itemService.getOrder(id);
    }
}

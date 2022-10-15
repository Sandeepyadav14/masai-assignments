package Question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> nameandprice=new HashMap<>();

        nameandprice.put("cactus",200);
        nameandprice.put("moneyplant",400);
        nameandprice.put("lotus",2900);
        nameandprice.put("sunflower",800);
        nameandprice.put("marigold",5200);
        System.out.println(nameandprice);

    }

}

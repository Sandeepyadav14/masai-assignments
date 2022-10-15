package queston3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Using Lambda Expression:
         PrintList p=(n)->{
             System.out.println(n);
         };

        p.display(Arrays.asList("Delhi","Mumbai","Hyderabad","Bangalore","UttarPradesh"));

    }

}

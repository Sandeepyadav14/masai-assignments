package question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringDes {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Mumbai", "Chennai", "Delhi","kolkata","Banglore");


//        Using Lambda Expression
        Collections.sort(cities,(s1,s2)->{
            return s2.compareTo(s1);
        });
        System.out.println(cities);

    }
}

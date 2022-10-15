package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,6,7,8,9);
        List<Integer> updatelist=list
                                   .stream()
                                   .map(s->s*s)
                                    .collect(Collectors
                                            .toList());
        System.out.println(updatelist);
    }
}

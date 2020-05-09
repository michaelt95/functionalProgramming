package Stream.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        // FlatMap

        List<String> names1 = Arrays.asList("Codi 1", "Codi 2");
        List<String> names2 = Arrays.asList("Codi 3", "Codi 4");
        List<String> names3 = Arrays.asList("Codi 5", "Codi 6");

        List<String> result =  Stream.of(names1,names2,names3)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

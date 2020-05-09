package Stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        // Obtener los numeros de la lista

        List<Integer> numbers = Arrays.asList(1,4,5,6,6,7,8,3,2,3,4);

        // Ascendente
        System.out.println(numbers.stream()
                .sorted()
                .collect(Collectors.toList()));
        // Descendente
        System.out.println(numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}

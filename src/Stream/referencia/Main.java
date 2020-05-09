package Stream.referencia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        // Obtener el cuadrado de todos los numeros en la lista.
        // El método map nos permite transformar un objeto en otro a través de una función.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10); // 1 lista

        List<Integer> result = numeros.stream() // 2 Abstraccion
                .map(num -> num*num) // 3
                .collect(Collectors.toList()); // 4 Segunda lista

        System.out.println(result);
    }
}

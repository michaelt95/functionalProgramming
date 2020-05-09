package Stream.foreach;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Obtener el cuadrado de todos los numeros en la lista.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Si utilizas esto, utilizara el iterable for each por defecto, si quitas el .Stream()
        // utilizara el iterable que hayas sobreescrito
        numeros.stream().forEach(num -> {
                    int resultado = num*num;
                    System.out.println(resultado);
                });
    }
}

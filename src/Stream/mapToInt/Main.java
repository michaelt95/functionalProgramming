package Stream.mapToInt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Long cantidad = numeros.stream().filter(n -> n>6).count();
        System.out.println(cantidad);


        //sum -> intStream -> mapToInt
        int suma = numeros.stream().mapToInt( n -> n).sum();
        System.out.println(suma);

        //average -> intStream
        double media = numeros.stream().mapToInt(n ->n).average().orElse(0);
        System.out.println(media);

        //min -> intStream
        int min = numeros.stream().mapToInt(n ->n).min().getAsInt();
        System.out.println(min);

        //max -> intStream
        int max = numeros.stream().mapToInt(n ->n).max().getAsInt();
        System.out.println(max);
    }
}

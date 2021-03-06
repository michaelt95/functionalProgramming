package Stream.referencia.instancia;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Referencia a metodos de instacia
        // Imprimir en consola el cubo de los elementos en la lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numeros.stream()
                .map(new Calculadora()::ToCube)
                .forEach(System.out::println);
    }
}

package Stream.distict;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Imprimir en consola todos los nombres unicos de la lista

        List<String> names = Arrays.asList("Codi 1", "Codi 2","Codi 1", "Codi 3");

        names.stream().distinct().forEach(System.out::println);
    }
}

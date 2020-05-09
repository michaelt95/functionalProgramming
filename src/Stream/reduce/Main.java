package Stream.reduce;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        // Obtener la suma de todos los elementos
        // al acumulador le damos un valor 0 y vamos sumando al acumulador los elementos de la lista
        int result = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .reduce(0,Integer::sum);//metodo referenciado
//                .reduce(0, (acumulador, elemento) -> acumulador+elemento);
        System.out.println(result);

        // Obtener lenguajes separados por pipeline entre ellos y sin espacios
        // opcion 1(mejor) con operador ternario
        String cadena = Stream.of("Java","C","Python","Ruby")
                .reduce("", (acumulador, lenguaje) -> acumulador.equals("")?lenguaje:acumulador + "|" + lenguaje);

        System.out.println(cadena);

        //Opcion 2 Con regex
        String cadenaRegex = Stream.of("Java","C","Python","Ruby")
                .reduce("", (acumulador, lenguaje) -> acumulador + "|" + lenguaje)
                .replaceFirst("\\|","") // Quitamos la primera pipeline
                .replaceAll("\\s",""); // Quitamos todos los espacios

        System.out.println(cadenaRegex);
    }
}

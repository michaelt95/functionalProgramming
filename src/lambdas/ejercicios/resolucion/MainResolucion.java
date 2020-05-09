package lambdas.ejercicios.resolucion;

import java.util.Arrays;
import java.util.List;

public class MainResolucion {
    public static void main(String[] args){
        //1.Crear una función anónima que nos permita calcular el promedio de un arreglo de números enteros.
        IResolucion metodo = array -> array.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        //tambien podemos lanzar una excepcion cambiando el "orElse" por "orElseThrow"
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(metodo.media(integerList));

        //Os dejo para vosotros los demas!! =)
    }
}

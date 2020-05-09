package Stream.findany;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Conocer si un alumno posee por lo menos una calificacion no aprobatoria,
        // la calificacion minima aprobatoria es 6

        List<Integer> calificaciones = Arrays.asList(10,10,9,5,6,7,8,9,10);

        Boolean result = calificaciones.stream().anyMatch(calificacion -> calificacion < 6);
        System.out.println(result);
    }
}

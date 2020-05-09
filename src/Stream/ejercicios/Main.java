package Stream.ejercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List <Curso> cursos = Arrays.asList(
        new Curso("Cursos profesional de Java", 6.5f, 50, 200 ),
        new Curso("Cursos profesional de Python", 8.5f, 60, 800 ),
        new Curso("Cursos profesional de DB", 4.5f, 70, 700 ),
        new Curso("Cursos profesional de Android", 7.5f, 10, 400 ),
        new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        System.out.println("Obtener la cantidad de cursos con una duración mayor a 5 horas");
        lineBreak();

        cursos.stream()
                .filter(curso -> curso.getDuracion()>5.0f)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Obtener la cantidad de cursos con una duración menor a 2 horas.");
        lineBreak();

        cursos.stream()
                .filter(curso -> curso.getDuracion()<2.0f)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.");
        lineBreak();

        cursos.stream()
                .filter(curso -> curso.getVideos()>50)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Mostrar en consola el título de los 3 cursos con mayor duración.");
        lineBreak();

        cursos.stream()
                .sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Mostrar en consola la duración total de todos los cursos.");
        lineBreak();

        System.out.println("Duracion total= "+cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .sum());

        lineBreak();
        System.out.println("Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.");
        lineBreak();

        double average = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .average()
                .orElse(0);

        System.out.println("Promedio = "+average);

        cursos.stream()
                .filter(curso -> curso.getDuracion() > average)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.");
        lineBreak();

        cursos.stream()
                .filter(curso -> curso.getAlumnos()<500)
                .forEach(curso -> System.out.println(curso.getTitulo()+" = "+curso.getDuracion()));

        lineBreak();
        System.out.println("Obtener el curso con mayor duración.");
        lineBreak();

        double maxDuration = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .max()
                .getAsDouble();

        cursos.stream()
                .filter(curso -> curso.getDuracion() == maxDuration)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        lineBreak();
        System.out.println("Crear una lista de Strings con todos los titulos de los cursos.");
        lineBreak();

        List<String> titulos = cursos.stream()
                .map(Curso::getTitulo)
                .collect(Collectors.toList());

        titulos.forEach(System.out::println);

        lineBreak();

    }
    public static void lineBreak(){
        System.out.println();
    }
}

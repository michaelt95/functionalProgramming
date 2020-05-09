package Stream.sort.object;

import Stream.pojos.Book;
import Stream.pojos.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        //Mostrar en consola los tres titutlos mas vendidos
        //Ordenar por copias

        List<Book> books = Arrays.asList(
                new Book("El señor de los anillos",150),
                new Book("Don Quijote de la mancha",500),
                new Book("Historia de dos ciudades",200),
                new Book("El hobbit",100),
                new Book("El principito",140));

        books.stream()
                .sorted(Comparator.comparing(Book::getCopies).reversed())
                .limit(3)
                .forEach(book -> System.out.println(book.getTitle()));
    }
}

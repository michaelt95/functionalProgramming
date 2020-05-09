package Stream.referencia.arbitrario;

import Stream.pojos.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        // Referencia a metodos de instancia de forma arbitraria
        // Imprimir en consola el nombre de todos los usuarios
        List<User> users = Arrays.asList(
                new User("Rafael",25),
                new User("Daniel",20),
                new User("Tania",15),
                new User("Luisa",24),
                new User("Raul",21));

        users.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }
}

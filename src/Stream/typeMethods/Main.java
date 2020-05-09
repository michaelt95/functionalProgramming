package Stream.typeMethods;

import Stream.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        // Obtener la cantidad de uusarios con una edad mayor a 18 y que su username comience con R

        List<User> users = Arrays.asList(
                new User("Rafael",25),
                new User("Daniel",20),
                new User("Tania",15),
                new User("Luisa",24),
                new User("Raul",21));

        // Proceso
        // Iteracion interna

        // Retornan un nmuevo stream
        // retornan un valor en concreto

        Stream<User> stream = users.stream();
        // Filter -> Abstraccion -> Nuevo stream
        System.out.println(stream.filter(user -> user.getAge() >18).count());
    }
}

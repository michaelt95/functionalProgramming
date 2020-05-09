package Stream.formsOfCreate;

import Stream.pojos.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        // Coleccion

        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream();// Abstraccion

        // Stream

        Stream<User> filter = stream.filter(user -> user.getAge() > 18);

        // Array

        Integer [] numbers = {1,2,3,4};
        Stream numbersS = Stream.of(numbers);

        // Secuencia

        Stream names = Stream.of("Codi 1","Codi 2","Codi 3");

    }
}

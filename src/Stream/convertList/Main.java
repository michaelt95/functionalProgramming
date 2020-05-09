package Stream.convertList;

import Stream.pojos.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        // Obtener todos los uusarios con una edad mayor a 18

        List<User> users = Arrays.asList(
                new User("Rafael",25),
                new User("Daniel",20),
                new User("Tania",15),
                new User("Luisa",24),
                new User("Raul",21));

        List<User> userStream = users.stream()
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());

        userStream.forEach(user -> System.out.println(user.getName()));
    }
}

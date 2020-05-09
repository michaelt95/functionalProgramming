package Stream.find;

import Stream.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        // Obtener el nombre de un usuario que tenga una edad igual a 25

        List<User> users = Arrays.asList(
                new User("Rafael",25),
                new User("Daniel",20),
                new User("Tania",15),
                new User("Luisa",24),
                new User("Raul",21));

        User user = users.stream()
                .filter(u -> u.getAge() == 30)
                .findFirst()// .findAny()
                .orElse(new User("default",30));
        System.out.println(user.getName());
    }
}

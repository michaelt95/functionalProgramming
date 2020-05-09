package Stream.referencia.constructor;

import Stream.pojos.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Referencia a un constructor
        // generar nuevos usuarios e imprimir sus nombres en consola
        IUser iUser = User::new;

        User user1 = iUser.create("Rafael",25);
        User user2 = iUser.create("Daniel",20);
        User user3 = iUser.create("Tania",15);
        User user4 = iUser.create("Luisa",24);

        List<User> users = Arrays.asList(user1,user2,user3,user4);

        users.stream().map(User::getName).forEach(System.out::println);
    }
}

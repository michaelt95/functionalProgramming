package Stream.a;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // filtrar!
        // Obtener la cantidad de uusarios con una edad mayor a 18 y que su username comience con R

        List<User> users = Arrays.asList(
                new User("Rafael",25),
                new User("Daniel",20),
                new User("Tania",15),
                new User("Luisa",24),
                new User("Raul",21));

        long cantidad = users.stream()//1
                .filter(user -> user.getAge()>18)//2
                .filter(user -> user.getName().startsWith("R"))//3
                .count();//4
        System.out.println(cantidad);
    }
}

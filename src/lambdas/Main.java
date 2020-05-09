package lambdas;

public class Main {

    public static void main(String[] args){
        ISaludar saludar = (usuario) -> {System.out.println("Hola "+usuario);};
        saludar.Saluda("mike");
    }
}

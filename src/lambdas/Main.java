package lambdas;

public class Main {

    public static void main(String[] args){
        ISaludar saludar = () -> {System.out.println("Hola mundo");};
        saludar.Saluda();
    }
}

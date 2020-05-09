package lambdas;

public class Main {

    public static void main(String[] args){
        // El compilador infiere el tipo de los parametros
        // Podemos modificar el nombre de los parametros
        //Siempre que tengamos un solo parametro podemos omitir el uso de parentesis
        ISaludar saludar = nombre -> System.out.println("Hola "+nombre);
        saludar.Saluda("mike");
    }
}

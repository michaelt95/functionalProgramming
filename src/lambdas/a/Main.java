package lambdas.a;

public class Main {

    public static void main(String[] args){
        //El compilador infiere el tipo de los parametros
        //Podemos modificar el nombre de los parametros
        //Siempre que tengamos un solo parametro podemos omitir el uso de parentesis

        ISaludar saludar = nombre -> System.out.println("Hola "+nombre);
        saludar.saluda("mike");

        ISaludar saludarDos = nombre -> {
            if (nombre.equalsIgnoreCase("mike"))
            System.out.println("Hola "+nombre+"!, que tal ?");
            else
            System.out.println("Hola "+nombre);
        };
        saludarDos.saluda("mike");

        ISaludar saludarDosRefactor =
        nombre -> System.out.println((nombre.equalsIgnoreCase("mike"))?"Hola "+nombre+"!, que tal ?":"Hola "+nombre);

        saludarDosRefactor.saluda("noMike");
    }
}

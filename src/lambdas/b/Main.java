package lambdas.b;

public class Main {

    public static void main(String[] args){

        ISuma suma = ((valor1, valor2) -> valor1 + valor2);
        int resultado = suma.suma(10,20);
        System.out.println(resultado);

        suma = (valor1, valor2) -> {

            int result = valor1 + valor2;
            System.out.println("El resultado dentro de la expresion es "+ result);
            return result;
        };

        resultado = suma.suma(100,200);
        System.out.println(resultado);

        //Utilizando metodos por referencia
        //esto hace que le indiquemos que le vamos a pasar valores integer y que se van a sumar
        ISuma referencia = (Integer::sum);
        int sumReferencia = referencia.suma(20,20);
        System.out.println(sumReferencia);

    }
}

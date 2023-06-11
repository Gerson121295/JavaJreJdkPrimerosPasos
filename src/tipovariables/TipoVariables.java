package tipovariables;

public class TipoVariables {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");

        System.out.println("\n-------TIPO DE DATO INT---------");

        int edad = 28;

        System.out.println("la edad es:" + edad);

        //A la variable edad se le sobreescribe el valor
        System.out.println("\n----------------");
        edad = 47;

        System.out.println("Mi nueva edad es:" + edad);

        //A la variable edad se le sobreescribe el valor
        System.out.println("\n----------------");
        edad = 47 + 88;

        System.out.println("la edad es:" + edad);

        System.out.println("\n-------TIPO DE DATO DOUBLE---------");
        //Tipo de dato Double
        double salario = 1250.56;
        System.out.println("salario"+salario);
        double salarioMitad = salario / 2;
        System.out.println("Su salario mitad es: "+ salarioMitad);

        //Usando Enteros
        int division = 1250/3;
        System.out.println("Retorna entero: "+division);


    }
}

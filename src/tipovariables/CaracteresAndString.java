package tipovariables;

public class CaracteresAndString {
    public static void main(String[] args) {
        System.out.println("------Usando CHAR (Es una palabra primitiva---------");
        char caracter = 'G'; //Definir un char se usa comilas simples, y solo permite 1 caracter
        System.out.println("Caracter dado es: " + caracter);

        System.out.println("---------------");
         caracter = 65; //Definir un char se usa comilas simples, y solo permite 1 caracter
        System.out.println("Caracter dado es: " + caracter); //devuelve la letra "A" porque usa el 65 como valor ASCII

        System.out.println("---------------");
        caracter = 65 + 1; //Definir un char se usa comilas simples, y solo permite 1 caracter
        char segundoCaracter = (char) (caracter + 1 );
        System.out.println("Caracter dado es: " + segundoCaracter); //LA letra es C porque anterior se le sumaron 2 al 65

        System.out.println("------Usando String(no es palabra primitiva---------");
        String palabra = "Alura cursos Online"; //Definir un String se usa comilas dobles
        System.out.println("El texto dado es: " + palabra);

        palabra = palabra + " 2020"; // usa el signo + para concatenar palabra en string
        System.out.println("El texto dado actualizado es: " + palabra);



    }
}

package condicionales;

public class EjemploCondicionales {
    public static void main(String[] args) {
        System.out.println("--------------------");

        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) { //>= mayor o igual a 18,  no usar =>
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            if (cantidad >= 2) {
                System.out.println("Usted es menor de edad pero esta permitido su ingreso");
            } else {
                System.out.println("Usted no esta permitido" + " para entrar");
            }

        }
    }
}

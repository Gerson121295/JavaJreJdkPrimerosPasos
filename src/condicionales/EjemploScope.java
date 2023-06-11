package condicionales;

public class EjemploScope {

    public static void main(String[] args) {
        System.out.println("--------------------");

        int edad = 21;
        int cantidadPersonas = 2;

    //    boolean esPareja = cantidadPersonas > 1; // cantidadPersonas > 1;  o asignar = true
    //    System.out.println("El valor de la condicion es: " + esPareja);

        boolean esPareja;
        if (cantidadPersonas > 1 ){
             esPareja = true;
        }else {
             esPareja = false;
        }


        boolean puedeEntrar = edad >= 18 && esPareja; //se hace la condicion
        System.out.println("El valor de la condicion es: "+ esPareja); //se hace la condicion

        //if (edad >= 18 && cantidadPersonas >= 2 ) { //>= mayor o igual a 18, no usar =>, || = or una o la otra, && ambas se tiene que cumplir
        //if (edad >= 18 && esPareja) {  //   esPareja ==  true  = esPareja

        if(puedeEntrar){
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no esta permitido" + " para entrar");
        }

    }

}

package ciclos;

public class EjercicioMatriz {
    public static void main(String[] args) {

        //Matriz Cuadrada
        System.out.println("\n---------Matriz Cuadrada ------------");
        for(int fila = 0; fila <= 10; fila++){
            for(int columna =0; columna<=10; columna++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n---------Matriz Triangular------------");
        //Matriz Cuadrada
        for(int fila = 0; fila <= 10; fila++){
            for(int columna =0; columna<fila; columna++){  //for(int columna =0; columna<=10; columna++){
              /*  if(columna > fila){  //columnas signos horizontalmente impresos
                    break;
                } */
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n---------Matriz Numeros------------");
        //Matriz Cuadrada
        for(int fila = 0; fila <5; fila++){
            for(int columna =0; columna<5; columna++){  //for(int columna =0; columna<=10; columna++){
                if(columna > fila){  //columnas signos horizontalmente impresos
                    break;
                }
                System.out.print(columna+1);
            }
            System.out.println();
        }

        System.out.println("\n---------Multiplos de 3 al 100 ------------");
        //Matriz Cuadrada
        for(int i = 1; i<100; i++){
            if(i%3 == 0){
                System.out.println(i);
            }
        }

        System.out.println("\n---------Multiplos de 3 al 100 ------------");
        //Matriz Cuadrada
        for(int i = 3; i<100; i+=3){
                System.out.println(i);
        }

    }
}

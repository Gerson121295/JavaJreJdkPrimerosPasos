package ciclos;

public class CicloSumaTodosNumeros {
    public static void main(String[] args) {

    int contador = 0;
    int total = 0;

        while(contador <=10) { // Mientras que la (condicion)
           total = total + contador;
        // contador = contador + 1;
        //contador +=1;   //contador +=3;
        contador++;

    }
        System.out.println("El total de la suma de todos los numeros del 1 al 10 es: " + total);

    }
}

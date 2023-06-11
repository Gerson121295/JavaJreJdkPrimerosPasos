package tipovariables;

public class Conversiones {
    public static void main(String[] args) {
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //Cast  Castear la variable devuelve un entero
        System.out.println("El numero Casteado(entero) es: "+variable1Entero);

        long numerosGrandes = 10000222222222L; //Para numeros grandes, se agrega al final la letra L
        short numerosPequeños = 12555; //para numero pequeños
        byte numerosMasPequeños = 12;
        float numeroSoportaDecimalesPequeño = 2.5F;

        int resultado = (int) variable1 + variable1Entero;
        System.out.println("El resultado es: " + resultado);
    }
}

/*
** Tipo     Tamaño
* boolean   1 bit
* byte      1 byte
* short     2 bytes
* char      2 bytes
* int       4 bytes
* float     4 bytes
* long      8 bytes
* double    8 bytes
 */




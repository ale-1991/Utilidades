/*
. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.

 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alejandro Caro
 */
public class ArregloServicios {

    private Random random;

    public ArregloServicios() {
        random = new Random();
    }

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextDouble() * 100;
        }
    }

    public void mostrarA(double[] arreglo) {
        System.out.println("Arreglo A:");
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        System.out.println("Arreglo A ordenado de mayor a menor:");
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] A, double[] B) {
        // Copiar los primeros 10 números de A en B

        System.arraycopy(A, 0, B, 0, 10);
        /*
System.arraycopy es un método estático que permite
copiar una parte de un arreglo a otra ubicación en el mismo arreglo o en otro arreglo
        
public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length);

sourceArray: el arreglo del cual queremos copiar elementos.
sourceStartIndex: la posición inicial del arreglo de origen a partir de la cual se copiarán los elementos.
destinationArray: el arreglo donde se copiarán los elementos.
destinationStartIndex: la posición inicial del arreglo de destino a partir de la cual se pegarán los elementos.
length: la cantidad de elementos que se copiarán.*/

        // Llenar las últimas 10 posiciones de B con 0.5
        Arrays.fill(B, 10, 20, 0.5);

        /* El método Arrays.fill se utiliza para llenar un arreglo con un valor específico en cada una de sus posiciones. Tiene dos variantes:
Arrays.fill(Object[] a, Object val): Llena todo el arreglo especificado con el valor especificado.
Arrays.fill(Object[] a, int fromIndex, int toIndex, Object val): Llena una parte del arreglo especificado, 
desde la posición fromIndex (incluida) hasta la posición toIndex (excluida), con el valor especificado.*/
    }

    public void mostrarB(double[] arreglo) {
        System.out.println("Arreglo B:");
        System.out.println(Arrays.toString(arreglo));
    }

}

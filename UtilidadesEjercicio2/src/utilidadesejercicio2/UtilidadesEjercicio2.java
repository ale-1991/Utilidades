/*
Método Static y Clase Math
2. Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.

 */
package utilidadesejercicio2;

import Utilidades.ParDeNumerosService;

/**
 *
 * @author Alejandro Caro
 */
public class UtilidadesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService servicio = new ParDeNumerosService();
        servicio.mostrarValores();
        double mayor = servicio.devolverMayor();
        System.out.println("Numero mayor:"+mayor);
        double potencia = servicio.calcularPotencia();
        System.out.println("Potencia del mayor elevado por el menor: "+potencia);
        double raiz = servicio.calculaRaiz();
        System.out.println("Raiz cuadrada del valor absoluto del menor numero: "+raiz);

        
    }
    
}

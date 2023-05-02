/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).

 */
package utilidadesejercicio4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Alejandro Caro
 */
public class UtilidadesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService servicio = new FechaService();

        // Pedir fecha de nacimiento
        Date fechaNacimiento = servicio.fechaNacimiento();
        //System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        // Obtener fecha actual
        Date fechaActual = servicio.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);

        // Calcular diferencia de años entre fechas
        int edad = servicio.diferencia(fechaActual, fechaNacimiento);
        System.out.println("Edad: " + edad + " años");
    }
    
    
}

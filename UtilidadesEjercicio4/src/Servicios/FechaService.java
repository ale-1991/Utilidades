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
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class FechaService {
    
   public Date fechaNacimiento(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el dia de su nacimiento:");
       int dia = sc.nextInt();
       System.out.println("Ingrese el mes de su nacimiento:");
       int mes = sc.nextInt()-1; // Se resta 1 ya que en Date los meses empiezan en 0
       System.out.println("Ingrese el año de su nacimiento:");
       int anio = sc.nextInt();
      return new Date(anio-1900, mes, dia); // se resta 1900 al año porque la clase Date cuenta los años desde 1900
   }
   
   public Date fechaActual(){
       return new Date();
       
   }
   
    public int diferencia(Date fecha1, Date fecha2) {
        long diffMilisegundos = fecha1.getTime() - fecha2.getTime();
        long diffAnios = (long) Math.floor(diffMilisegundos / (1000 * 60 * 60 * 24 * 365.25)); // Se calcula la diferencia en años redondeando hacia abajo
        return (int) diffAnios;
    }
    /*Este método toma dos objetos Date como parámetros y calcula la diferencia en años entre 
    las dos fechas.Primero, se calcula la diferencia en milisegundos entre las dos fechas restando 
    la fecha2 de la fecha1. Luego, esta diferencia en milisegundos se divide entre la cantidad de 
    milisegundos que hay en un año (1000 * 60 * 60 * 24 * 365.25).
    El resultado de esta división es la cantidad de años entre las dos fechas, 
    pero puede ser un número decimal. Para redondear hacia abajo, se usa el método Math.floor(). Finalmente, se convierte el resultado en un valor entero y se retorna.*/
}

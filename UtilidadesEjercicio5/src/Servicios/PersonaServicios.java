/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class PersonaServicios {
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento en formato dd/MM/yyyy: ");
        String fechaNacimientoString = sc.nextLine();

        // Parsear la fecha de nacimiento ingresada por el usuario
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new Date(Date.parse(fechaNacimientoString));
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha de nacimiento.");
        }
        /*se está intentando convertir un String que representa una fecha en un objeto Date,
        que es el tipo de dato que se utiliza para almacenar fechas en Java. Para hacer esta 
        conversión se utiliza el método parse de la clase Date,
        que recibe como parámetro el String con la fecha y 
        devuelve un objeto Date correspondiente.*/

        // Crear y retornar el objeto Persona
        return new Persona(nombre, fechaNacimiento);
    }
    
       public int calcularEdad(Persona persona) {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Calcular la diferencia en milisegundos entre la fecha actual y la fecha de nacimiento de la persona
        long diffMilisegundos = fechaActual.getTime() - persona.getFechaNacimiento().getTime();

        // Calcular la diferencia en años redondeando hacia abajo
        long diffAnios = (long) Math.floor(diffMilisegundos / (1000 * 60 * 60 * 24 * 365.25));

        // Retornar la edad como un entero
        return (int) diffAnios;
    }
    
public boolean menorQue(Persona persona, int edad) {
    // Obtener la edad de la persona
    int edadPersona = calcularEdad(persona);

    // Comparar la edad de la persona con la edad consultada
    if (edadPersona < edad) {
        return true;
    } else {
        return false;
    }
}

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));
    }
    
}

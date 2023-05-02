/*
 Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.

 */
package utilidadesejercicio6;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class UtilidadesEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso1 = new Curso(); // Creamos un curso con el constructor por defecto
        curso1.crearCurso(); // Pedimos al usuario que ingrese los datos del curso y sus alumnos

        System.out.println("El curso se llama: " + curso1.getNombreCurso());
        System.out.println("Tiene una duración diaria de: " + curso1.getCantidadHorasPorDia() + " horas");
        System.out.println("Se lleva a cabo " + curso1.getCantidadDiasPorSemana() + " días por semana en el turno de " + curso1.getTurno());
        System.out.println("Cada hora de clase cuesta: $" + curso1.getPrecioPorHora());

        System.out.println("Los alumnos del curso son:");
        for (String alumno : curso1.getAlumnos()) {
            System.out.println(alumno);
        }

        System.out.println("La ganancia semanal del curso es de: $" + curso1.calcularGananciaSemanal());
    }
            
}


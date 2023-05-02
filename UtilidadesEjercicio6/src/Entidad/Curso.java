/*
crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */

public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            this.alumnos[i] = sc.nextLine();
        }
    }

    public void crearCurso() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        this.nombreCurso = sc.nextLine();

        System.out.print("Ingrese la cantidad de horas por día: ");
        this.cantidadHorasPorDia = sc.nextInt();

        System.out.print("Ingrese la cantidad de días por semana: ");
        this.cantidadDiasPorSemana = sc.nextInt();
        sc.nextLine(); // limpia el buffer del teclado


        System.out.print("Ingrese el turno (mañana o tarde): ");
        this.turno = sc.nextLine();

        System.out.print("Ingrese el precio por hora: ");
        this.precioPorHora = sc.nextDouble();

        // Cargar los nombres de los alumnos
        this.cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return this.cantidadHorasPorDia * this.cantidadDiasPorSemana * this.precioPorHora * 5;
    }
}








    


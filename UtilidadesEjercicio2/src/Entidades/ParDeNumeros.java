/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */
package Entidades;

/**
 *
 * @author Alejandro Caro
 */
public class ParDeNumeros {
    private double numero1;
    private double numero2;
    
    public ParDeNumeros() {
        this.numero1 = Math.random();
        this.numero2 = Math.random();
    }
    
    public ParDeNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double getNumero1() {
        return numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}

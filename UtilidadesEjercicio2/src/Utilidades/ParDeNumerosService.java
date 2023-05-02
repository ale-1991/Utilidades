/*
Crear una clase ParDeNumerosService, en el paquete
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
package Utilidades;
import Entidades.ParDeNumeros;

/**
 *
 * @author Alejandro Caro
 */
public class ParDeNumerosService {
    
   private ParDeNumeros par;
   
   public ParDeNumerosService() {
        par = new ParDeNumeros(Math.random(), Math.random());
    }
   
     public void mostrarValores() {
        System.out.println("Los valores de la clase son: " + par.getNumero1() + " y " + par.getNumero2());
    }
     
    public double devolverMayor() {
        
        
        /*if (par.getNumero1() > par.getNumero2()) {
            return par.getNumero1();
        } else {
            return par.getNumero2();
        }*/
        
        return Math.max(par.getNumero1(), par.getNumero2());
    }
    
    public double calcularPotencia() {
        
        double mayor = devolverMayor();
        double menor = mayor == par.getNumero1() ? par.getNumero2() : par.getNumero1();
        return Math.pow(Math.round(mayor), Math.round(menor));
        //En esta línea se está utilizando la función Math.pow() para elevar el número mayor (previamente 
        //redondeado con Math.round()) a la potencia del número menor (también redondeado con Math.round()).
    }
    
    public double calculaRaiz() {
        
        double menor = par.getNumero1() < par.getNumero2() ? par.getNumero1() : par.getNumero2();
        /*Lo que se está haciendo es verificar si el valor del atributo numero1 de la instancia de 
ParDeNumeros es menor que el valor del atributo numero2. Si se cumple esta condición, entonces se asigna
el valor de numero1 a la variable menor, de lo contrario se asigna el valor de numero2.*/
        return Math.sqrt(Math.abs(menor));
    }
}

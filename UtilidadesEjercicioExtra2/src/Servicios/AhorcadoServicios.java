/*
Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
2
● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class AhorcadoServicios {
    Scanner sc = new Scanner(System.in);
    
    
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a buscar.");
        String palabra = sc.nextLine();
        System.out.println("Ingrese la cantidad maxima de jugadas.");
        int jugadasMaximas = sc.nextInt();
        sc.nextLine();

        char[] palabraArray = palabra.toCharArray();

        Ahorcado ahorcado = new Ahorcado(palabraArray, 0, jugadasMaximas);
        return ahorcado;
    }

    
    public void longitud(Ahorcado ahorcado){
        int longitud = ahorcado.getPalabra().length;
        System.out.println("La longitud de la palabra a buscar es: "+ahorcado.getPalabra().length);
    }
    

    
    public boolean buscar(char letra, Ahorcado ahorcado){
        char[] palabra = ahorcado.getPalabra();
        boolean encontrada = false;
        for (int i =0;i<ahorcado.getPalabra().length;i++){
            if(Character.toLowerCase(palabra[i]) == Character.toLowerCase(letra)){
                encontrada=true;
                break;
            }
        }
        
        if(encontrada){
            System.out.println("La letra "+letra+" esta en la palabra");
        }else{
            System.out.println("La letra "+letra+" no esta en la palabra");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas()-1);
        }
        return encontrada;
    }

    
    public void encontradas(char letra, Ahorcado ahorcado){
        int letrasEncontradas = 0;
        char[] palabra = ahorcado.getPalabra();
        
        for (char c : palabra) {
            
            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                letrasEncontradas++;
            }
            
        }

        ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + letrasEncontradas);

        int letrasFaltantes = palabra.length - ahorcado.getLetrasEncontradas();
        System.out.println("Letras encontradas: " + ahorcado.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + letrasFaltantes);
    }
    
    public int intentos(Ahorcado ahorcado){
        return ahorcado.getJugadasMaximas();
    }
    
    public void juego(Ahorcado ahorcado) {
        while (intentos(ahorcado) > 0 && ahorcado.getLetrasEncontradas() < ahorcado.getPalabra().length) {
            System.out.print("Ingresa una letra: ");
            char letra = sc.nextLine().charAt(0);
            buscar(letra, ahorcado);
            encontradas(letra, ahorcado);
            System.out.println("Intentos restantes: " + intentos(ahorcado));
        }

        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("¡Has descubierto toda la palabra!");
            System.out.println("La palabra era: "+String.valueOf(ahorcado.getPalabra()));
        } else {
            System.out.println("¡Te has quedado sin intentos! La palabra era: " + String.valueOf(ahorcado.getPalabra()));
        }
    }
}

/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class CadenaServicio {

    Scanner sc = new Scanner(System.in);
    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char letra = Character.toLowerCase(cadena.getFrase().charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        
        System.out.println("La frase tiene "+contador+" vocales.");

    }
    
    //probar
    public void invertirFrase(Cadena cadena) {
        System.out.println("Frase invertida: " );
        for(int i = cadena.getFrase().length()-1;i>=0;i--){
            System.out.print(""+cadena.getFrase().charAt(i));
        }
        System.out.println("");
            
    }
    
    public void vecesRepetido(Cadena cadena,String letrabuscada){
        int contador = 0;
        System.out.println("Ingrese la letra a buscar");
        letrabuscada= sc.nextLine();
        
        for (int i = 0; i < cadena.getFrase().length(); i++) {
           if (cadena.getFrase().charAt(i)==letrabuscada.charAt(0)) {
                contador++;
            }
        }
        
        System.out.println("La letra "+letrabuscada+" se encuentra un total de "+contador+" veces.");
        
    }
    
    public void compararLongitud(Cadena cadena,String otraFrase){
        System.out.println("Ingrese la frase a comparar:");
        otraFrase = sc.nextLine();
        if(cadena.getFrase().length()>otraFrase.length()){
            System.out.println("La frase ingresada por el usuarios es mas corta");
        } else if(cadena.getFrase().length()==otraFrase.length()){
            System.out.println("Ambas frase tienen la misma longitud");
        }else{
            System.out.println("La frase ingresada por el usuario es mas larga");
        }
    }
   
    

    public void unirFrase(Cadena cadena,String otrafrase2){
        System.out.println("Ingrese la frase a unir a la frase de la clase");
        otrafrase2=sc.nextLine();
        //System.out.println(cadena.getFrase()+" "+otrafrase2);
        System.out.println(cadena.getFrase().concat(otrafrase2));
       
        
    }
    
    public void reemplazar(Cadena cadena, String letraBuscada, String letraReemplazo) {
        System.out.println("Ingrese el caracter que desea usar para reemplazar las a");
        letraReemplazo = sc.nextLine();
        letraBuscada = "a";
        String fraseReemplazada = cadena.getFrase().replace(letraBuscada.charAt(0), letraReemplazo.charAt(0));
        System.out.println(fraseReemplazada);
    }

    public boolean contiene(Cadena cadena, String letra) {
        System.out.println("Ingrese la letra a buscar");
        letra = sc.nextLine();

        return cadena.getFrase().contains(letra);


    }
}



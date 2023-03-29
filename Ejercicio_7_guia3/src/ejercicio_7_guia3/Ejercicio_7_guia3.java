/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_7_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int cont1=0, cont2=0;
        
        do{
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            
            if(frase.equals("&&&&&")){
                break;
            }else if(frase.length()<=5 & frase.substring(0,1).equals("X")&frase.substring(4).equals("O")){
                cont1++;
            }else{
                cont2++;
            }
        }while(!frase.equals("&&&&&"));
        
        System.out.println("INIFORME:");
        System.out.println("La cantidad de lecturas correctas es: " + cont1);
        System.out.println("La cantidad de lecturas incorrectas es: " + cont2);
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LX699
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double factorial= 1;
        double numero;
        String repetir;
        
        Scanner intro = new Scanner (System.in);
        
        do{
        System.out.println("Ingrese el numero para Realizar el factorial:");
        numero = intro.nextDouble();
        
        while (numero !=0){
            factorial= factorial*numero;
            numero--;
        }
        System.out.println(factorial);
        
            System.out.println("");
            System.out.println("Desea Repetir La Operacion: Si o No");
            repetir = intro.next();
            System.out.println("");
            
        }while(repetir.equals("si"));
    
}
}

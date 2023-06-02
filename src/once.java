/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LX699
 */
public class once {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1, valor2 ;
        Scanner intro = new Scanner (System.in);
        
        System.out.print("Ingrese Primer Valor: ");
        valor1 = intro.nextInt();
        System.out.print("ingrese Segundo Valor: ");
        valor2 = intro.nextInt();
        
        if(valor1 > valor2){
            System.out.println(valor1 + " Es el Mayor");
        }else if (valor1 < valor2){
            System.out.println(valor2 + " Es El Mayor");
        }else{
            System.out.println("Los Valores Son Iguales");
        }
        // TODO code application logic here
    }
    
}

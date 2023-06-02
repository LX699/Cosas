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
public class Treces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num, max=0;
        int cont=0, n;
        Scanner intro = new Scanner(System.in);
        
        System.out.print("Cantidad de numeros a ingresar: ");
        n= intro.nextInt();
        do{
            System.out.print("Ingrese numero: ");
            num = intro.nextInt();
            if (num > max){
                max =num;
                cont++;
            }
            
        }while (cont <n);
        System.out.println("El numero  mayor es: " + max);
        // TODO code application logic here
    }
    
}

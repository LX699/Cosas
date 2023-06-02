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
public class Doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num, max=0;
        int cont =0, n;
        Scanner intro = new Scanner(System.in);
        
        System.out.print("Cantidad De Numeros A Ingresar: ");
        n = intro.nextInt();
        
        while (cont < n){
            System.out.print("Ingrese Numero: ");
            num = intro.nextInt();
            if (num > max){
                max = num;
                cont++;
            }
        }
        System.out.println("El Numero Mayor Es: "+ max);
        // TODO code application logic here
    }
    
}

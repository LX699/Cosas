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
public class Dies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner intro = new Scanner(System.in);
        
        System.out.print("Ingrese Numero");
        num = intro.nextFloat();
        if ((num>= 0)&& (num <= 1000)){
            System.out.println("El Valor Esta Dentro Del Intervalo");
        }else{
            System.out.println("El Valor No Esta Dentro Del Intervalo");
        }
        // TODO code application logic here
    }
    
}

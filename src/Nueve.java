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
public class Nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num;
        Scanner intro = new Scanner(System.in);
        
        System.out.println("ingrese numero");
        num= intro.nextFloat();
        if (num<0){
            num = (-1) * num;
        System.out.println("El Valor Absoluto Es: " + num);
        }
        // TODO code application logic here
    }
    
}

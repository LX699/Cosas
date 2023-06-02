
import java.util.Random;
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
public class CartonLoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner Intro = new Scanner(System.in);
        
        int[]arreglo= new int [15];
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i]= aleatorio.nextInt(40)+1;
            for (int j = 0; j < i; j++) {
                if (arreglo[i]== arreglo[j]){
                    i--;
            }
            
        }
       
    }
        int auxiliar;
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if (arreglo[j] > arreglo [j+1]){
                    auxiliar= arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=auxiliar;
                }
            }
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("digito: "+(i+1)+ "  tiene numero: "+ arreglo[i]);
            
        }
    }
}
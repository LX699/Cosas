/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese el Largo del arreglo");
        int largo = intro.nextInt();
        int[] arreglo = new int[largo];
        arreglo[0]=1;
        arreglo[1]=2;
        System.out.println("");
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);

        for (int i = 2; i < largo; i++) {
            arreglo[i]=arreglo[i-1]+arreglo[i-2];
            System.out.println(arreglo[i]);

        }

    }
}

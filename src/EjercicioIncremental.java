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
public class EjercicioIncremental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float combustible,kilometraje,rendimiento;
        Scanner intro = new Scanner(System.in);
        
        System.out.println("ingrese Precio del Combustible");
        combustible = intro.nextFloat();
        System.out.println("Ingrese El kilometraje");
        kilometraje = intro.nextFloat();
        rendimiento = (combustible/20)*kilometraje;
        System.out.println("El gasto es de: $"+ rendimiento);
        
        
        // TODO code application logic here
    }
    
}

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
public class incrementar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso,combustible,kilometraje,rendimiento;
        String camion;
        Scanner intro = new Scanner(System.in);
        
        
        do{
            System.out.println("Ingrese Peso de la carga: ");
            peso= intro.nextFloat();
        }while (peso<=0);
        
        if ((peso>=0)&&(peso <=100)){
            camion = " La carga sera transportada en un camion Pequeño";
             do{
                 System.out.print("ingrese Precio del Combustible");
                 combustible = intro.nextFloat();
               }while (combustible<=0);
        
        do{
            System.out.println("Ingrese El kilometraje");
            kilometraje = intro.nextFloat();
        }while (kilometraje<=0);
        
        rendimiento = (combustible/23)*kilometraje;
        
        System.out.println(camion);
        System.out.println("El gasto es de: $"+ rendimiento);
        }else if ((peso>100) && (peso<=200)){
            camion = " La carga sera transportada en un camion Gande";
            do{
                System.out.print("ingrese Precio del Combustible");
                combustible = intro.nextFloat();
            }while (combustible<=0);
        
        do{
            System.out.println("Ingrese El kilometraje");
            kilometraje = intro.nextFloat();
        }while (kilometraje <=0);
        
        rendimiento = (combustible/23)*kilometraje;
        
        System.out.println(camion);
        System.out.println("El gasto es de: $"+ rendimiento);
        }else{
            camion= "no existe camion para esta carga";
            System.out.println(camion);
        // TODO code application logic here
    }
    
}
}

import java.util.Scanner;

public class incremental2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso,combustible,kilometraje,rendimiento;
        String camion;
        Scanner intro = new Scanner(System.in);
        
        
        System.out.println("Ingrese Peso de la carga: ");
        peso= intro.nextFloat();
        if ((peso>=0)&&(peso <=100)){
            camion = " La carga sera transportada en un camion Pequeño";
             System.out.println("ingrese Precio del Combustible");
        combustible = intro.nextFloat();
        System.out.println("Ingrese El kilometraje");
        kilometraje = intro.nextFloat();
        rendimiento = (combustible/23)*kilometraje;
        
        System.out.println(camion);
        System.out.println("El gasto es de: $"+ rendimiento);
        }else if ((peso>100) && (peso<=200)){
            camion = " La carga sera transportada en un camion Gande";
            System.out.print("ingrese Precio del Combustible");
        combustible = intro.nextFloat();
        System.out.println("Ingrese El kilometraje");
        kilometraje = intro.nextFloat();
        rendimiento = (combustible/23)*kilometraje;
        
        System.out.println(camion);
        System.out.println("El gasto es de: $"+ rendimiento);
        }else{
            camion= "no existe camion para esta carga";
            System.out.println(camion);
           
        }
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.pizza;

import java.util.Scanner;

/**
 *
 * @author LX699
 */
public class Ejercicio2Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanopizza,extraqueso,pepperoni,aceitunas,pina,sardinas,ingredientesExtra,total,totalPizzas;
        String tipopizza,otraPizza;
        totalPizzas=0;
        Scanner intro = new Scanner(System.in);
        
        do{
            System.out.println("Elija tamaño de la Pizza");
        System.out.println("1- Pequeña");
        System.out.println("2- mediana");
        System.out.println("3- grande");
        System.out.println("ingrese el Numero segun el tamaño");
        tamanopizza=intro.nextInt();
        if (tamanopizza ==1){
            tamanopizza =1000;
        }else if(tamanopizza ==2){
            tamanopizza =1500;
        }else{
            tamanopizza=5000;
        }
        
        System.out.println("Elija tipo de Pizza");
        System.out.println("1- Mediterranea");
        System.out.println("2- Vegetariana");
        System.out.println("3- Americana");
        System.out.println("4- Texana");
        System.out.println("ingrese numero segun el tipo de pizza");
        tipopizza=intro.next();
        if (tipopizza.equals("1")){
            tipopizza="pizza Mediterranea";
        }else if(tipopizza.equals("2")){
            tipopizza ="pizza Vegetariana";
        }else if(tipopizza.equals("3")){
            tipopizza="pizza Americana";
        }else{
            tipopizza="pizza texana";
        }
        System.out.println("Ingrese cantidad segun el ingrediente extra"); 
        System.out.println(" Extra Queso");
        extraqueso= intro.nextInt()*500;
        System.out.println("Pepperoni");
        pepperoni= intro.nextInt()*450;
        System.out.println("Aceitunas");
        aceitunas= intro.nextInt()*1000;
        System.out.println("Piña");
        pina=intro.nextInt()*100;
        System.out.println("Sardinas");
        sardinas=intro.nextInt()*1100;
        ingredientesExtra=extraqueso+pepperoni+aceitunas+pina+sardinas;
        total=ingredientesExtra+tamanopizza;
        totalPizzas=totalPizzas+total;
        
            System.out.println("");
            System.out.println("");
        System.out.println("Costo por tamaño: $"+ tamanopizza);
        System.out.println("Tipo de pizza: "+ tipopizza);
        System.out.println("");
        System.out.println("Ingredientes Extra:");
        System.out.println("Extra queso: $"+ extraqueso);
        System.out.println("Pepperoni: $"+ pepperoni);
        System.out.println("Aceitunas: $"+ aceitunas);
        System.out.println("Piña: $"+ pina);
        System.out.println("Sardina: $"+ sardinas);
        System.out.println("");
        System.out.println("Total $" +total);
        System.out.println("");
        System.out.println("quieres Pedir otra pizza SI o No ");
        otraPizza = intro.next();
        }while(otraPizza.equals("si"));
        System.out.println("");
        System.out.println("Total por las pizzas $"+ totalPizzas);
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;
import java.util.Scanner;

/**
 *
 * @author LX699
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int golesEquip1, golesEquip2, golesEquip3, golesEquip4,golesGanador1,golesGanador2,golesPerdedor1,golesPerdedor2;
        String equipo1, equipo2, equipo3, equipo4, ganadorPartido1,ganadorPartido2, perdedorPartido1, perdedorPartido2,perdedorPartido3,perdedorPartido4,primerLugar,segundoLugar,tercerLugar,cuartoLugar;
        
        Scanner intro = new Scanner (System.in);
        
        System.out.println("Ingrese el Nombre Del Equipo N° 1");
        equipo1 = intro.next();
        System.out.println("Ingrese el Nombre Del Equipo N° 2");
        equipo2 = intro.next();
        System.out.println("Ingrese el Nombre Del Equipo N° 3");
        equipo3 = intro.next();
        System.out.println("Ingrese el Nombre Del Equipo N° 4");
        equipo4 = intro.next();
        
        System.out.println("Partido N° 1");
        System.out.println("Ingrese los goles del equipo " + equipo1);
        golesEquip1 = intro.nextInt();
        System.out.println("Ingrese los goles del equipo " + equipo2);
        golesEquip2 = intro.nextInt();
        
         if (golesEquip1 >golesEquip2){
            ganadorPartido1= equipo1;
            perdedorPartido1=equipo2;
        }else{
             ganadorPartido1= equipo2;
             perdedorPartido1=equipo1;
         }
        
        System.out.println("Partido N° 2");
        System.out.println("Ingrese los goles del equipo " + equipo3);
        golesEquip3 = intro.nextInt();
        System.out.println("Ingrese los goles del equipo " + equipo4);
        golesEquip4 = intro.nextInt();
        
        if (golesEquip3 > golesEquip4){
            ganadorPartido2= equipo3;
            perdedorPartido2=equipo4;
        }else{
             ganadorPartido2= equipo4;
             perdedorPartido2=equipo3;
         }
        System.out.println("Partido Por 1° y 2° Lugar");
        System.out.println("Ingrese goles del equipo" + ganadorPartido1);
        golesGanador1 = intro.nextInt();
        System.out.println("Ingrese goles del equipo" + ganadorPartido2);
        golesGanador2 = intro.nextInt();
        if (golesGanador1>golesGanador2){
            primerLugar= ganadorPartido1;
            segundoLugar= ganadorPartido2;
        }else{
            primerLugar= ganadorPartido2;
            segundoLugar= ganadorPartido1;
            
        }
           
        System.out.println("Partido Por 3° y 4° Lugar");
        System.out.println("Ingrese goles del equipo" + perdedorPartido1);
        golesPerdedor1=intro.nextInt();
        System.out.println("Ingrese goles del equipo" + perdedorPartido2);
        golesPerdedor2=intro.nextInt();
        if(golesPerdedor1>golesPerdedor2){
            tercerLugar=perdedorPartido1;
            cuartoLugar=perdedorPartido2;
        }else{
            tercerLugar=perdedorPartido2;
            cuartoLugar=perdedorPartido1;
        }
        System.out.println("1° Lugar" + primerLugar);
        System.out.println("Gano 2 Partidos");
        System.out.println("2° Lugar" + segundoLugar);
        System.out.println("Gano 1 Partido");
        System.out.println("3° Lugar" + tercerLugar);
        System.out.println("Gano 1 Partido");
        System.out.println("4° Lugar" + cuartoLugar);
        System.out.println("Gano 0 partidos");
            
        }
                        
    
                
            
        // TODO code application logic here
            
            

}
   

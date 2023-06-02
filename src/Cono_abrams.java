import java.util.Scanner;   // importamos esta libreria para poder leer los datos ingresados por el ususario

public class Cono_abrams {

    public static void main(String[] args) {
        double R,r,h,respuesta,pi = Math.PI; // Declaramos el tipo de nuestras variables
        Scanner intro = new Scanner(System.in); // Inicializamos la clase Scanner para obtener los datos
        
        // Pedimos al usuario que ingrese los valores y los guardamos en sus respectivas variables
        System.out.println("ingrese la altura del cono"); 
        h = intro.nextFloat();
        
        System.out.println("ingrese medida radio mayor del cono");
        R = intro.nextFloat();

        System.out.println("ingrese medida radio menor del cono");
        r = intro.nextFloat();
        
        //Aplicamos la formula con los datos previamente ingresador por el usuario y guardamos la respuesta en su respectiva variable
        respuesta = (pi/3)*h*(Math.pow(R, 2)+R*r+Math.pow(r, 2));
        
        // Le devolvemos al usuario la respuesta que obtuvimos 
        System.out.println("Respuesta = "+respuesta);
        
        //fin
        
        
    }
    
}

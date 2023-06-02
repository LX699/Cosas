/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LX699
 */
public class cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1;
        String n2;
        int num1, num2, suma;
        
        n1= JOptionPane.showInputDialog("Introdusca Primer Numero");
        n2= JOptionPane.showInputDialog("Introdusca Segundo Numero");
        
        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);
        suma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "La Suma Es :"+ suma, "Sumar Dos Numeros Enteros",JOptionPane.PLAIN_MESSAGE);
        // TODO code application logic here
    }
    
}

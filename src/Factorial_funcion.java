import javax.swing.*;

public class Factorial_funcion {

   //Funci�n factorial
   static long Factorial(int n) {
   	int cont;
   	long fact =1;
   	cont =1;
   	while (cont<=n) {
   		fact = fact * cont;
   		cont++;
   	}
   	return fact;
   }
   //Funci�n principal
    public static void main(String[] args) {

		int num, cont;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un n�mero >=0 para calcular el factorial: "));
		} while (num<0);

		JOptionPane.showMessageDialog(null,"El factorial es: " + Factorial(num)); //llamada de la funci�n

    }
}

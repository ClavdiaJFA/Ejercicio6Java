import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear un metdo que reciba por parametro un numero y nos muestre
		 * la tabla de multiplicar de ese numero
		 * 
		 * Ejemplo:
		 * 1 x 1 = 1
		 * 1 x 2 = 2
		 * ...
		 * 1 x 10 = 10
		 * 
		 */
	
		Scanner tabla = new Scanner (System.in);
		System.out.println("Introduce la tabla que deseas ver");
		int num = tabla.textInt();
	
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	System.out.println(10);
	
	for(int i=0; i < 10; i++) {
		System.out.println(i + 1);
		}
	}
}




import java.util.Scanner;

public class Grados {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Inserta los grados centigrados: ");
		double grados = teclado.nextDouble();	
		
		double farenheit = grados * 1.8 + 32;
		
		System.out.print("Los grados farenheit son: " + farenheit);
		
		teclado.close();
		
		
	}

}

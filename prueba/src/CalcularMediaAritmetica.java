

import java.util.Scanner;

public class CalcularMediaAritmetica {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Inserta el primer n�mero: ");
		double v1 = teclado.nextDouble();
		
		System.out.print("Inserta el segundo n�mero: ");
		double v2 = teclado.nextDouble();
		
		System.out.print("Inserta el tercer n�mero: ");
		double v3 = teclado.nextDouble();
		
		double media = (v1 + v2 + v3) / 3; // Si quieres que saque decilames, hay que poner 3.0;
		
		//System.out.println("La media aritm�tica de la suma de " + v1 + " + " + v2 + " + " + v3 + " es igual a: " + media);
		
		teclado.close();
				
		
	}

}

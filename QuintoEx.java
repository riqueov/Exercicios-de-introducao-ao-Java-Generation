package exercicios.um;

import java.util.Scanner;

public class QuintoEx {

	public static void main(String[] args) {

		double media, a, b, c;
		Scanner resp = new Scanner(System.in);
		
		System.out.print("\ndigite as três notas: ");
		
		    a = resp.nextDouble();
		    b = resp.nextDouble();
		    c = resp.nextDouble();
		    
		    media = (a + b + c) / 4;
		    
		    System.out.printf("\nMedia = %.2f", media);
		    
		    resp.close();
	}

}

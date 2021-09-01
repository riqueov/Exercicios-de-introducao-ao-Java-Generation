package exercicios.um;

import java.util.Scanner;

public class SetimoEx {

	public static void main(String[] args) {
		Double a, b, c, d, e, f, x, y;
		Scanner resp = new Scanner(System.in);

		System.out.println("Digite o valor a: ");
		a = resp.nextDouble();
		System.out.println("Digite o valor b: ");
		b = resp.nextDouble();
		System.out.println("Digite o valor c: ");
		c = resp.nextDouble();
		System.out.println("Digite o valor d: ");
		d = resp.nextDouble();
		System.out.println("Digite o valor e: ");
		e = resp.nextDouble();
		System.out.println("Digite o valor f: ");
		f = resp.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));

		System.out.println("\n O valor de X é de: " + x + "\nO valor de Y é de: " + y);
		
		resp.close();	
	}

}

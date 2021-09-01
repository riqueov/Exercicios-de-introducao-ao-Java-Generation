package exercicios.um;

import java.util.Scanner;
import java.lang.Math;

public class QuartoEx {

	public static void main(String[] args) {
		double a, b, c, d, r, s;
		Scanner resp = new Scanner (System.in);
		
		System.out.print("Valor de A: ");
		a = resp.nextDouble();
		System.out.print("Valor de B: ");
		b = resp.nextDouble();
		System.out.print("Valor de C: ");
		c = resp.nextDouble();
		
		r = Math.pow((a + b), 2.0);

		s = Math.pow((b + c), 2.0);
		
		d = (r + s) / 2;
		
		
		System.out.printf(" resultado R: %.2f ", r);
		System.out.printf("\n resultado S: %.2f", s);
		System.out.printf("\n resultado D: %.2f ", d);
		
		resp.close();
	}

}

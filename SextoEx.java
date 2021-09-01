package exercicios.um;

import java.util.Scanner;

public class SextoEx {

	public static void main(String[] args) {
		Double x1, x2, y1, y2, p1, p2, resultado;
		Scanner resp = new Scanner(System.in);
		
		System.out.print("Entre com o valor de x1: ");
		x1 = resp.nextDouble();
		System.out.print("Entre com o valor de y1: "); 
		y1 = resp.nextDouble();
		System.out.print("Entre com o valor de x2: ");
		x2 = resp.nextDouble();
		System.out.print("Entre com o valor de y2: "); 
		y2 = resp.nextDouble();

		p1 = Math.pow((x2 - x1), 2.0);
		p2 = Math.pow((y2 - y1), 2.0);

		resultado = Math.sqrt((p1 + p2));

		System.out.printf("\n A distância entre P1 e P2 é de: %.2f", resultado);
		
		resp.close();
	}

}

package exercicios.um;

import java.util.Scanner;

public class TerceiroEx {

	public static void main(String[] args) {
		Scanner resp = new Scanner(System.in);
		int hora, minuto, segundo, segundos;
		
		System.out.print("Digite quantos segundos: ");
		segundos = resp.nextInt();

		
		hora = segundos / 3600;
			
		minuto = (segundos % 3600) /60;

		segundo = (segundos % 3600) % 60; 

		System.out.print("o tempo da evento é de: " + hora + " : " + minuto + " : " + segundo);
		
		resp.close();
	}

}

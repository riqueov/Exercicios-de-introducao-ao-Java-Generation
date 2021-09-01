package exercicios.um;

import java.util.Scanner;

public class PrimeiroEx {

	public static void main(String[] args) {

		int meses = 0, anos = 0, dias = 0, idadeDias = 0;
		Scanner resp = new Scanner (System.in);
		
		System.out.println("Digite sua idade, meses e dias: ");
		System.out.print("Digite sua idade: ");
		anos = resp.nextInt();
		
		System.out.print("Digite os meses: ");
		meses = resp.nextInt();
		
		System.out.print("Digite os dias: ");
		dias = resp.nextInt();
		
		idadeDias = (anos * 365)+(meses * 30)+ dias;
		System.out.println("A sua idade em quantidade é igual a: "+ idadeDias + " dias");
		resp.close();
	}

}

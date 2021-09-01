package exercicios.um;

import java.util.Scanner;

public class SegundoEx {

	public static void main(String[] args) {
		int ano, mes, dia, dias;
		Scanner resp = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		dias = resp.nextInt();

		ano = dias / 365;
			
		mes = (dias % 365) /30;

		dia = (dias % 365) % 30;

		System.out.print("A idade em anos, meses e dias é de: " + ano + " " + mes + " " + dia); 
		resp.close();
	}

}

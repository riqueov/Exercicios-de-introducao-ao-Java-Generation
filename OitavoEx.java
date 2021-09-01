package exercicios.um;

import java.util.Scanner;

public class OitavoEx {

	public static void main(String[] args) {
		double CustoFabrica, ValorDistribuidor, ValorImposto, CustoConsumidor;
		double PerDistribuidor = 28;
		double PerImpostos = 45;
		
		Scanner resp = new Scanner(System.in);
		
		System.out.print("Digite o custo de fábrica: ");
		CustoFabrica = resp.nextDouble();
		
		ValorDistribuidor = CustoFabrica * PerDistribuidor/100;
		ValorImposto = CustoFabrica * PerImpostos/100;
			 
		CustoConsumidor = CustoFabrica + ValorDistribuidor + ValorImposto;

		System.out.print("O valor para o consumidor final é de: " + CustoConsumidor);
		
		resp.close();
	}

}

package util;

import java.util.Scanner;

public class CurrencyConverter {
	
	
	public static double TaxaIOF() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o preço do dollar?");
		double dollarp = sc.nextDouble();
		System.out.println("Quantos dollares vc vai gastar?");
		double dollarg = sc.nextDouble();
		double taxa = 0.06 * dollarg;
		return (taxa + dollarg) * dollarp;
	}
	
	
}

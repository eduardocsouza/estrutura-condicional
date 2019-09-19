package program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double taxa = 50.00;
		double consumed;
		double total;
		System.out.println("Informe o valor cosumido:");
		consumed = sc.nextDouble();
		if(consumed > 100) {
			total = 2 * (consumed - 100) + taxa;
			System.out.printf("Valor a pagar R$: %.2f", total);
		}
		else {
			System.out.printf("Valor a pagar R$: %.2f", taxa);
		}
		sc.close();
	}
}

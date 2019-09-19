package program;

import java.util.Scanner;

public class SwitchECase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:	
			dia = "Segunda";
			break;
		default:
			dia = "Valor incorreto";
			break;
		}
		System.out.println(dia);
		sc.close();
	}

}

package program;

public class CondicionalTern�ria {

	public static void main(String[] args) {

		/*
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println(desconto);
		*/
		
		/*Condicional tern�ria funciona da seguinte forma.
			a ? funciona como um "Se" o os : funciona como um "Se n�o"
			� dada um condin��o e feito os teste. 
		*/
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}
	
	
}

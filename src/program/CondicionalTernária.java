package program;

public class CondicionalTernária {

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
		
		/*Condicional ternária funciona da seguinte forma.
			a ? funciona como um "Se" o os : funciona como um "Se não"
			é dada um condinção e feito os teste. 
		*/
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}
	
	
}

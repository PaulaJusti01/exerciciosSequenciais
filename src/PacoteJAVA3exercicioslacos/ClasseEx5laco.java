package PacoteJAVA3exercicioslacos;

import java.util.Scanner;

public class ClasseEx5laco {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0;
		
		
		do {
		System.out.println("Entre com um número: ");
		numero = ler.nextInt();
		soma += numero;
		}
		
		while (numero > 0);
		
		System.out.println("A soma de todos os números digitados é "+ soma);
		
		
		
		
	}

}

package PacoteJAVA3exercicioslacos;

import java.util.Scanner;

public class ClasseEx2laco {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int numero, contpar=0, contimpar=0;
		
		for(int x=1; x<=10; x++) {
			
			System.out.println("Entre com um número: ");
			numero = ler.nextInt();
			
			if(numero%2==0) {
				contpar++;
			}
			else {
				contimpar++;
			}
			
		}
		System.out.println("pares: "+ contpar);
		System.out.println("impares: "+ contimpar);
		
	}
}

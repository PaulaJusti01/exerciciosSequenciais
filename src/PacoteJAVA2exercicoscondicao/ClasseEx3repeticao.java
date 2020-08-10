package PacoteJAVA2exercicosrepeticao;

import java.util.Scanner;

public class ClasseEx3repeticao {
	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade? ");
		idade = ler.nextInt();
		
			if(idade == 10 && idade <= 14) {
				System.out.println("Você está na categoria infantil.");
			}
			
			else if(idade == 15 && idade <= 17) {
				System.out.println("Você está na categoria juvenil.");
				
			}
			
			else if (idade == 18 && idade <=25) {
				System.out.println("Você está na categoria adulto.");
			}
		
	}

}

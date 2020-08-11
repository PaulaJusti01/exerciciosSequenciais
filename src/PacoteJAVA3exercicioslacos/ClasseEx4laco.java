package PacoteJAVA3exercicioslacos;

import java.util.Scanner;

public class ClasseEx4laco {
	public static void main(String[] args) {
		
		int idade, sexo, fp, contpc=0, contmn = 0, contha = 0, contoc=0, contpn40=0, contpc18=0, x=1;
		
		Scanner ler = new Scanner(System.in);
		
		while(x<=6) {
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Entre com o sexo: \n 1-Mulheres \n2-Homens \n3-Outros");
			sexo = ler.nextInt();
			
			System.out.println("Entre com o  sexo: \\n 1-Calmo \\n2-Nervoso \\n3-Agressivo");
			fp = ler.nextInt();
			
			
			if(fp==1) {
				
				contpc++;
			}
			if(sexo == 1 && fp == 2) {
				
				contmn++;
			}
			if(sexo ==2 && fp == 3) {
				
				contha++;
			}
			if(sexo==3 && fp==1);{
				
				contoc++;
			}
			if(fp==2 && idade>40) {
				
				contpn40++;
			}
			if(fp == 1 && idade <18) {
				contpc18++;
			}
				x++;
		}
		System.out.println("Pessoas calmas: "+contpc);
		System.out.println("mulheres nervosas: "+contmn);
		System.out.println("Homens agressivos: "+contha);
		System.out.println("outros calmos: "+contoc);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("pessoas calmas com menos de 18 anos: "+contpc18);
	}
}

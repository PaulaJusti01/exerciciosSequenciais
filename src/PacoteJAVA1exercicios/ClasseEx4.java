package PacoteJAVA1exercicios;

import java.util.Scanner;


public class ClasseEx4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.println("O valor de D é " + d);
		
		
		
		
	}

}

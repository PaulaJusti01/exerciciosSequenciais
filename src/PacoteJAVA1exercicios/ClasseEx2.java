package PacoteJAVA1exercicios;

import java.util.Scanner;

public class ClasseEx2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, total;
		
		System.out.println("Quantos dias você já viveu? ");
		total = ler.nextInt();
		
		anos = total/365;
		meses = (total%365)/30;
		dias = (total - (anos*365)) - (meses*30);
				
				System.out.printf("Sua idade é %d anos, %d meses e %d dias " ,anos, meses, dias);
				
				
	}
}

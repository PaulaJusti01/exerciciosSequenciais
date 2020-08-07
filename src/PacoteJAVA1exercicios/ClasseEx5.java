package PacoteJAVA1exercicios;
import java.util.Scanner;

public class ClasseEx5 {
	 public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double n1, n2, n3, mediap;
		
		System.out.println("Qual é a primeira nota? ");
		n1 = ler.nextInt();
		
		System.out.println("Qual é a segunda nota? ");
		n2 = ler.nextInt();
		
		System.out.println("Qual é a terceira nota? ");
		n3 = ler.nextInt();
		
		mediap = (n1*2+n2*3+n3*5)/10;
		
				System.out.println("A média ponderada é " + mediap);
	}
}

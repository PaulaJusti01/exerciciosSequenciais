package PacoteJAVA2exercicosrepeticao;

import java.util.Scanner;

public class ClasseEx4repeticao {
	
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 int numero;
	 
	 System.out.println("Entre com um número qualquer: ");
	 numero = ler.nextInt();
	 
	 if (numero%2 == 0) {
		 
		 System.out.println("O número digitado é par e sua raiz quadrada é "+ Math.sqrt(numero));
		 
	 }
	 
	 else {
		 System.out.println("O número digitado é ímpar e seu quadrado é " + Math.pow(numero, 2));
	 }
	
}
}

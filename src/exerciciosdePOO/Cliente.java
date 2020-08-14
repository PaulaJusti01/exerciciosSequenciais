package exerciciosdePOO;

public class Cliente {
	String nome;
	int idade;
	double dinheiro;
	
	public void pagar(double valor) {
		if (valor <= dinheiro) {
			dinheiro = dinheiro - valor;
		}
	}
}

package exercicio1;

public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;

	public Fornecedor (String nome, String endereço, String telefone, float valorCredito, float valorDivida) {

		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}




	public float obterSaldo () {

		return valorCredito - valorDivida;


	}




}

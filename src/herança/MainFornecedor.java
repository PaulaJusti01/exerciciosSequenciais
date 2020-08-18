package exercicio1;

public class MainFornecedor {
	public static void main(String[] args) {

		float valorCredito = 1000.0f;
		float valorDivida = 300.0f;


		Fornecedor fornecedor = new Fornecedor("Paula","Rua Tal 123", "12345678", valorCredito, valorDivida);
		float saldo = fornecedor.obterSaldo();

		System.out.println(saldo);

	}


}


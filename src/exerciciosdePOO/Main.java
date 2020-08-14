package exerciciosdePOO;

public class Main {
	public static void main(String[] args) {
		
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		produtoEletronico.nome = "Celular";
		produtoEletronico.preco = 1000.00;
		produtoEletronico.voltagem = 110;
		
		System.out.printf("ProdutoEletronico(nome=%s, preco=%f, voltagem=%d", produtoEletronico.nome, produtoEletronico.preco, produtoEletronico.voltagem);
		
	}
 
}

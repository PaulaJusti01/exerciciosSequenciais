package exercicio1;

public class MainEmpregado {
	public static void main(String[] args) {

		int codigoSetor;
		float salarioBase;
		float imposto;


		Empregado empregado = new Empregado("Fulana","Rua Sei lá 456", "12345678", 555, 2000.0f, 10.0f);
		float salario = empregado.calcularSalario();

		System.out.println(salario);
	}

}

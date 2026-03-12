
public class ex05 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.identificacao = 1;
		f1.nome = "Gabriel";
		f1.sobrenome = "Carvalho";
		f1.salario = 3000;
		
		System.out.println("Nome Completo: " + f1.nomeCompleto());
		System.out.println("Salario Anual: " + f1.salarioAnual());
		
		f1.aumentarSalario(10);
		
		System.out.println("Novo Salario: " + f1.salario);

	}

}


public class Funcionario {
	
	int identificacao;
	String nome;
	String sobrenome;
	double salario;
	
	double salarioAnual() {
		return salario * 12;
	}
	
	String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + (salario* percentual / 100);
	}
}

import java.util.Scanner;


public class Ex01 {
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Joao";
		p1.sexo = 'M';
		p1.dataNascimento = "10/05/1995";
		p1.estadoCivil = "Solteiro";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.sexo = 'F';
		p2.dataNascimento = "22/08/1998";
		p2.estadoCivil = "Casada";
		
		System.out.println("Pessoa 1:");
		System.out.println("Nome: "+p1.nome);
		System.out.println("Sexo: "+p1.sexo);
		System.out.println("Data de Nascimento: "+p1.dataNascimento);
		System.out.println("Estado Civil: "+p1.estadoCivil);
		
		System.out.println();
		
		System.out.println("Pessoa 2:");
		System.out.println("Nome: "+p2.nome);
		System.out.println("Sexo: "+p2.sexo);
		System.out.println("Data de Nascimento: "+p2.dataNascimento);
		System.out.println("Estado Civil: "+p2.estadoCivil);
		
		
		
		
		
 

	}

}

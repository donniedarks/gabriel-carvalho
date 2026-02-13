import java.util.Scanner;

public class scnEx04 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("insira seu nome:");
		String nome = input.next();
		
		System.out.println("insira seu sobrenome:");
		String sobrenome = input.next();
		
		String nomeCompleto = nome +" "+ sobrenome;
		
		System.out.println("Seu nome é: "+nomeCompleto);

	}

}

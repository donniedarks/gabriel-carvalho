import java.util.Scanner;

public class scnEx05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira uma idade:");
		int idade1 = input.nextInt();
		
		System.out.println("insira uma segunda idade:");
		int idade2 = input.nextInt();
		
		int idadeFinal = idade1 + idade2;
		
		System.out.println("A soma das idades são: "+idadeFinal);

	}

}

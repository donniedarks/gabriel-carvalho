import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o nome do seu colega");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("Gabriel")) {
			gabrielCarvalho();
			
		} else if (nome.equalsIgnoreCase("Kevin")) {
			Kevin();
		}
	}
	
	public static void gabrielCarvalho() {
		System.out.println("o nome dele é Gabriel");
		System.out.println("ele tem 18 anos");
		System.out.println("ele é estudante de desenvolvimento de sistemas");
	}
	
	public static void Kevin() {
		System.out.println("o nome dele é Kevin");
		System.out.println("ele tem 19 anos");
		System.out.println("ele é estudante de desenvolvimento de sistemas");
		
	}

}

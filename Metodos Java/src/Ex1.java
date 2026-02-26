import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe um numero de 1 a 4 para informar a estação do ano:");
		int numero = input.nextInt();
		
		if (numero == 1) {
			System.out.println("é verão e o tempo esta quente");
		} else {
			if (numero == 2) {
				System.out.println("é outono e o tempo esta seco");
			} else {
				if (numero == 3) {
					System.out.println("é inverno e o tempo esta frio");
				} else {
					if (numero == 4) {
						System.out.println("é primavera e o tempo esta ameno");
					} else {
						System.out.println("informe outro número");
					}
				}
			}
		}

	}

}

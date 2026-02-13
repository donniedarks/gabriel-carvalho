import java.util.Scanner;

public class scnEx01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor de um produto:");
		double produto1 = input.nextDouble();
		
		System.out.println("Insira o valor de um segundo produto:");
		double produto2 = input.nextDouble();
		
		double valorFinal = produto1 + produto2;
		
		System.out.println("O valor final dos dois produtos é de R$"+valorFinal);

	}

}

import java.util.Scanner;

public class scnEx02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira uma altura:");
		double altura1 = input.nextDouble();
		
		System.out.println("insira uma segunda altura:");
		double altura2 = input.nextDouble();
		
		double alturaFinal = altura1 - altura2;
		
		System.out.println("a diferença entre as alturas é de "+alturaFinal+" cm");

	}

}

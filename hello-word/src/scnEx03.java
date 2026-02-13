import java.util.Scanner;

public class scnEx03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira a base do retangulo:");
		double base = input.nextDouble();
		
		System.out.println("insira a altura do retangulo:");
		double altura = input.nextDouble();
		
		double perimetro = (altura + base) * 2;
		
		double area = base * altura;
		
		System.out.println("a area do retangulo é: " + area);
		System.out.println("o perimetro do retangulo é: " + perimetro);

	}

}

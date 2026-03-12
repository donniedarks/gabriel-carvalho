
public class Ex04 {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.raio = 2;
		
		Circulo c2 = new Circulo();
		c2.raio = 4;
		
		Circulo c3 = new Circulo();
		c3.raio = 6;
		
		Circulo c4 = new Circulo();
		c4.raio = 8;
		
		System.out.println("Área circulo 1: "+c1.calcularArea());
		System.out.println("Área circulo 2: "+c2.calcularArea());
		System.out.println("Área circulo 3: "+c3.calcularArea());
		System.out.println("Área circulo 4: "+c4.calcularArea());

	}

}

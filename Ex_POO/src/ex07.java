
public class ex07 {

	public static void main(String[] args) {
		
		Aeronave a1 = new Aeronave();
		a1.modelo = "Avião A";
		a1.passageiros = 150;
		a1.velocidadeMaxima = 800;
		a1.capacidadeCombustivel = 20000;
		a1.queimaPorMinuto = 50;
		
		Aeronave a2 = new Aeronave();
		a2.modelo = "Avião B";
		a2.passageiros = 200;
		a2.velocidadeMaxima = 850;
		a2.capacidadeCombustivel = 25000;
		a2.queimaPorMinuto = 60;
		
		Aeronave a3 = new Aeronave();
		a3.modelo = "Avião C";
		a3.passageiros = 180;
		a3.velocidadeMaxima = 900;
		a3.capacidadeCombustivel = 22000;
		a3.queimaPorMinuto = 55;
		
		Aeronave a4 = new Aeronave();
		a4.modelo = "Avião D";
		a4.passageiros = 220;
		a4.velocidadeMaxima = 780;
		a4.capacidadeCombustivel = 30000;
		a4.queimaPorMinuto = 70;
		
		Aeronave maiorPassageiros =a1;
		
		if (a2.passageiros > maiorPassageiros.passageiros) maiorPassageiros = a2;
		if (a3.passageiros > maiorPassageiros.passageiros) maiorPassageiros = a3;
		if (a4.passageiros > maiorPassageiros.passageiros) maiorPassageiros = a4;
		
		System.out.println("Mais passageiros: " + maiorPassageiros.modelo);
		
		Aeronave maiorTempo = a1;
		
		if (a2.tempoMaximoVoo() > maiorTempo.tempoMaximoVoo()) maiorTempo = a2;
		if (a3.tempoMaximoVoo() > maiorTempo.tempoMaximoVoo()) maiorTempo = a3;
		if (a4.tempoMaximoVoo() > maiorTempo.tempoMaximoVoo()) maiorTempo = a4;
		
		System.out.println("Mais tempo no ar: " + maiorTempo.modelo);
		
		Aeronave maiorDistancia = a1;
		
		if (a2.distanciaMaxima() > maiorDistancia.distanciaMaxima()) maiorDistancia = a2;
		if (a3.distanciaMaxima() > maiorDistancia.distanciaMaxima()) maiorDistancia = a3;
		if (a4.distanciaMaxima() > maiorDistancia.distanciaMaxima()) maiorDistancia = a4;
		
		System.out.println("Maior distancia maxima: " + maiorDistancia.modelo);

	}

}


public class Aeronave {
	
	String modelo;
	int passageiros;
	double velocidadeMaxima;
	double capacidadeCombustivel;
	double queimaPorMinuto;
	
	double tempoMaximoVoo() {
		return capacidadeCombustivel / queimaPorMinuto;
	}
	
	double distanciaMaxima() {
		return tempoMaximoVoo() * velocidadeMaxima;
	}

}

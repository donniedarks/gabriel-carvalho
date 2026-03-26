
public class Ex08 {

	public static void main(String[] args) {
		
		Contribuente[] pessoas = new Contribuente[5];
		
		pessoas[0] = new Contribuente();
		pessoas[0].nome = "João";
		pessoas[0].cpf = "111";
		pessoas[0].uf = "PR";
		pessoas[0].rendaAnual = 40000;
		
		pessoas[1] = new Contribuente();
		pessoas[1].nome = "Maria";
		pessoas[1].cpf = "222";
		pessoas[1].uf = "RS";
		pessoas[1].rendaAnual = 20000;
		
		pessoas[2] = new Contribuente();
		pessoas[2].nome = "Carlos";
		pessoas[2].cpf = "333";
		pessoas[2].uf = "SC";
		pessoas[2].rendaAnual = 10000;
		
		pessoas[3] = new Contribuente();
		pessoas[3].nome = "Ana";
		pessoas[3].cpf = "444";
		pessoas[3].uf = "PR";
		pessoas[3].rendaAnual = 3000;
		
		pessoas[4] = new Contribuente();
		pessoas[4].nome = "Pedro";
		pessoas[4].cpf = "555";
		pessoas[4].uf = "RS";
		pessoas[4].rendaAnual = 35000;
		
		Contribuente maior = pessoas[0];
		
		for(int i = 1; i < pessoas.length; i++) {
			if (pessoas[i].calcularImposto() > maior.calcularImposto()) { 
				maior = pessoas[i];
			}
		}
		
		System.out.println("Quem mais paga imposto: " + maior.nome);
		
		double total = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			total += pessoas[i].calcularImposto();
		}
		System.out.println("Total de imposto: " + total);
	}

}

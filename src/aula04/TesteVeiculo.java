package aula04;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		
		Veiculo matheusVeiculo = new Veiculo ("kat","qwertyu","pequeno","hatch");
		Veiculo matheusHeiculo = new Veiculo ("zed","qwertuy","grande","hatch");
		
		
		//String numeroSerie,String placa, String porte,String modelo
		
		Veiculo.exibirContador();
		
		matheusVeiculo.statusVeiculo(1);
		
		System.out.println(matheusVeiculo.statusVeiculo(1));
		
		
		
		
		

	}

}

package aula04;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		
		Veiculo matheusVeiculo = new Veiculo ("kat","qwertyu","pequeno","hatch");
		Veiculo henriqueVeiculo = new Veiculo ("zed","qwertuy","grande","hatch");
		
		
		//String numeroSerie,String placa, String porte,String modelo
		
		Veiculo.exibirContador();
		
		matheusVeiculo.statusVeiculo(1);
		
		
		matheusVeiculo.acelerar(240);
		
		matheusVeiculo.freiar(20);
		
		System.out.println(matheusVeiculo.getPlaca());
		System.out.println(henriqueVeiculo.getPlaca());
		
		
		
		
		
		
		
		//System.out.print(matheusVeiculo.acelerar(12));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	matheusVeiculo.acelerar(20);
		
		
		//System.out.println(matheusVeiculo.velocidadeVeiculo);
	//	System.out.println(matheusVeiculo.statusVeiculo);
		
		
		
		
		
		
		

	}

}

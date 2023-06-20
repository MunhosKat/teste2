package aula04;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		
		Motor tm  = new Motor("chevrolet", "gasolina");
		Pneu chev = new Pneu (12,"pirelli");
		Transmissao auto = new Transmissao ("5","automatico");
		
		
		
		
		
		
		
		
		Carro matheusVeiculo = new Carro (tm,chev,auto,"1234","AFG1234","pequeno","hatch");

		
		
		
		Veiculo.exibirContador();
		
		//matheusVeiculo.acelerar(10);
		
		matheusVeiculo.setStatusVeiculo(1);
		matheusVeiculo.getStatusVeiculo();
		
		//	matheusVeiculo.acelerar(123);
		
		//System.out.println(matheusVeiculo.getLimiteVeiculo());
		
		//	matheusVeiculo.getStatusVeiculo();
		//matheusVeiculo.setLimiteVeiculo(140);
		
		
		
		
		matheusVeiculo.setLimiteVeiculo(220);
		
		
		matheusVeiculo.acelerar(221);
		matheusVeiculo.freiar(20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		matheusVeiculo.statusVeiculo(1);
//		
//		matheusVeiculo.freiar(20);
//		
//		System.out.println(matheusVeiculo.getPlaca());
//		System.out.println(henriqueVeiculo.getPlaca());
//	System.out.println(matheusVeiculo.getModelo());
//		matheusVeiculo.setLimiteVeiculo(200);
//		
//		
//		matheusVeiculo.acelerar(240);
		
		
		
		
	//	System.out.println(matheusVeiculo.velocidadeVeiculo);
	//System.out.println(matheusVeiculo.statusVeiculo);
		
		
		
		
		
		
		

	}

}

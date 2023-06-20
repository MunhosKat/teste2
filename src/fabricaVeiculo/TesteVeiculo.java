package fabricaVeiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		
		Motor tm  = new Motor("chevrolet", "gasolina");
		Pneu chev = new Pneu (12,"pirelli");
		Transmissao auto = new Transmissao ("5","automatico");
		
		
		
		
		
		
		Caminhao caminhaoJessica = new Caminhao (tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00);
		Moto motoGui = new Moto (tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00);
		Carro matheusVeiculo = new Carro (tm,chev,auto,"1234","AFG1234","pequeno","hatch", 250);

		motoGui.ligarVeiculo();
		motoGui.acelerar(310);
		
		matheusVeiculo.ligarVeiculo();
		matheusVeiculo.acelerar(-180);
		Veiculo.exibirContador();
		
		caminhaoJessica.ligarVeiculo();
		caminhaoJessica.fecharJanela();
		caminhaoJessica.abrirJanela();

	}

}

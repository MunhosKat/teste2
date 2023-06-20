package fabricaVeiculo;

public class TesteVeiculo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Criação de novas partes do veículo.
		Motor tm  = new Motor("chevrolet", "gasolina");
		Pneu chev = new Pneu (12,"pirelli");
		Transmissao auto = new Transmissao ("5","automatico");
		//Criando novos veículos.	
		Caminhao caminhaoJessica = new Caminhao ("Preto",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00);
		Moto motoGui = new Moto ("Preto",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00, 0, 1);
		Carro matheusVeiculo = new Carro ("Vermelho",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 250, 1, 1, 1);
		//teste de funcionalidade dos veículos.
		
	}

}

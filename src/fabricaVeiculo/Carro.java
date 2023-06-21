package fabricaVeiculo;

import aula03.Produto;

public class Carro extends Veiculo {
	int controlarJanela;
	int abrirPortaMalas;
	int abrirCapo;
	double qtdNoTanque;
	private double rendimentoTotal;

//Testado pelo Matheus
	public Carro(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
	}
	// métodos

	public Carro(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo, int controlarJanela, int abrirPortaMalas, int abrirCapo) {
		super(motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo);
		this.controlarJanela = controlarJanela;
		this.abrirPortaMalas = abrirPortaMalas;
		this.abrirCapo = abrirCapo;
	}

	public boolean controlarJanela(int valor) {
		controlarJanela = valor;

		if (valor == 1) {
			System.out.println("Levantando a janela");
			return true;

		} else {
			System.out.println("abaixando a janela");
			return false;
		}
	}

	public boolean abrirPortaMalas(int valor) {
		abrirPortaMalas = valor;

		if (valor == 1) {
			System.out.println("Abrindo porta malas ");
			return true;

		} else {
			System.out.println("fechando porta malas");
			return false;
		}
	}

	public boolean abrirCapo(int valor) {
		abrirCapo = valor;

		if (valor == 1) {
			System.out.println("Abrindo capo ");
			return true;

		} else {
			System.out.println("fechando capo");
			return false;
		}

	}

	public void exibirDadosVeiculo() {
		System.out.println(getModelo());
	}
	
	
	
	public void abastecimento (Combustivel comb, double qtd) {
		if (qtdNoTanque + qtd <= 50) {
			qtdNoTanque += qtd;
			rendimentoTotal +=comb.abastecer(qtd);
			
		}
	}

	public double getQtdNoTanque() {
		return qtdNoTanque;
	}

	public void setQtdNoTanque(double qtdNoTanque) {
		this.qtdNoTanque = qtdNoTanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

	
	
	
	
	
	
	
	
	
	
}

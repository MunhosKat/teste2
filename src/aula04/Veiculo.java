package aula04;

import java.util.Date;

import aula03.Cliente;

public class Veiculo {

	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int statusVeiculo;
	protected Motor motor;
	protected Pneu pneu;
	protected Transmissao transmissao;
	protected double limiteVeiculo, valorVeiculo, velocidadeVeiculo;
	private static long contador;

	public Veiculo(Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo) {
		// apagar o SUPER
		this.motor = motor;
		this.pneu = pneu;
		this.transmissao = transmissao;
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = new Date(System.currentTimeMillis());
		contador++;
	}

	public boolean statusVeiculo(int valor) {
		statusVeiculo = valor;

		if (valor == 1) {
			return true;

		}
		return false;

	}

	public double acelerar(double acelerar) {

		if (statusVeiculo == 1) {
			if (acelerar > 0) {
				if (acelerar > limiteVeiculo) {
					acelerar = limiteVeiculo;
					this.velocidadeVeiculo = acelerar;

				}
			}
		} 
		this.velocidadeVeiculo = acelerar;
		System.out.println(velocidadeVeiculo + " KM/H");
		return velocidadeVeiculo;

	} 

	public double freiar(double freiar) {

		if (velocidadeVeiculo > 0) {
			velocidadeVeiculo -= freiar;
		}
		System.out.println(velocidadeVeiculo + " KM/H");
		return freiar;

	}
	
	
//	public double limiteVeiculo(double veloMax) {
//		return limiteVeiculo = veloMax;
//		
//	}
	
	
	
	
	
	

	public String exibirDados() {
		System.out.println();
		return modelo;

	}

	public static void exibirContador() {
		System.out.println(contador);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public double getLimiteVeiculo() {
		return limiteVeiculo;
	}

	public void setLimiteVeiculo(double limiteVeiculo) {
		this.limiteVeiculo = limiteVeiculo;
	}

	public int getStatusVeiculo() {
		return statusVeiculo;
	}

	public void setStatusVeiculo(int statusVeiculo) {
		this.statusVeiculo = statusVeiculo;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public double getVelocidadeVeiculo() {
		return velocidadeVeiculo;
	}

	public void setVelocidadeVeiculo(double velocidadeVeiculo) {
		this.velocidadeVeiculo = velocidadeVeiculo;
	}

}
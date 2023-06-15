package aula04;

import java.util.Date;

import aula03.Conta;

public abstract class Veiculo {
	
	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int status;
	protected double limiteVeiculo, valorVeiculo,velocidadeVeiculo;
	private static long contador;

	
	public Veiculo(String numeroSerie, String cor, String placa, String porte, Date dataFabricacao, double valorVeiculo, String modelo,double limiteVeiculo,double velocidadeVeiculo) {
		//apagar o SUPER
		this.velocidadeVeiculo = velocidadeVeiculo;
		this.limiteVeiculo = limiteVeiculo;
		this.numeroSerie = numeroSerie;
		this.cor = cor;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = dataFabricacao;
		this.valorVeiculo = valorVeiculo;
		contador++;
	}
	

	public boolean status(int valor) {
		if (valor == 1) {
			if (this.status < valor) {
				this.saldo -= valor;
				return true;
			}

		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}